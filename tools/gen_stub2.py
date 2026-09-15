import os, re, subprocess, collections, sys

jvmbin = r"C:\Users\dany1\AppData\Local\Temp\opencode\jdk21\jdk-21.0.12.1+1\bin"
jvm = jvmbin + r"\java.exe"
javap = jvmbin + r"\javap.exe"
jar = r"C:\Users\dany1\Downloads\orchard-1.21.11.jar"

# list k74 classes
r = subprocess.run([jvmbin + r"\jar.exe", "tf", jar], capture_output=True, text=True)
classes = [l.strip()[:-6].replace('/', '.') for l in r.stdout.splitlines() if l.strip().endswith('.class') and '$' not in l.strip()]
classes = [c for c in classes if c.startswith('k74.')]
print("k74 classes:", len(classes), file=sys.stderr)

methods = collections.defaultdict(list)   # (mccls, methname) -> (ret, [params])
fields = collections.defaultdict(set)     # mccls -> [(fieldname, type)]
class_refs = set()
extra_refs = set()

def parse_type(desc):
    desc = desc.strip()
    dims = 0
    while desc.startswith('['):
        dims += 1; desc = desc[1:]
    prim = {'B':'byte','C':'char','D':'double','F':'float','I':'int','J':'long','S':'short','Z':'boolean'}
    if desc.startswith('L'):
        base = desc[1:desc.index(';')].replace('/', '.')
    else:
        base = prim.get(desc[0], 'Object')
    base = base.replace('$', '.')
    return base + '[]' * dims

def split_desc(s):
    params = []
    k = 0
    while k < len(s):
        if s[k] == '[':
            j = k
            while s[j] == '[': j += 1
            if s[j] == 'L':
                e = s.index(';', j); params.append(s[k:e+1]); k = e+1
            else:
                params.append(s[k:j+1]); k = j+1
        elif s[k] == 'L':
            e = s.index(';', k); params.append(s[k:e+1]); k = e+1
        else:
            params.append(s[k]); k += 1
    return params

chunk = 40
for i in range(0, len(classes), chunk):
    batch = classes[i:i+chunk]
    r = subprocess.run([javap, "-c", "-p", "-classpath", jar] + batch, capture_output=True, text=True, encoding="utf-8", errors="replace")
    src = r.stdout
    for m in re.finditer(r'// Method net/minecraft/class_(\d+)\.(method_\d+):\(([^)]*)\)(\S+)', src):
        mc, mn = f"class_{m.group(1)}", m.group(2)
        params = [parse_type(p) for p in split_desc(m.group(3))]
        ret = parse_type(m.group(4))
        entry = (ret, tuple(params))
        if entry not in methods[(mc, mn)]:
            methods[(mc, mn)].append(entry)
        class_refs.add(mc)
    for m in re.finditer(r'// Field net/minecraft/class_(\d+)\.(field_\d+):(\S+)', src):
        mc, fn, ty = f"class_{m.group(1)}", m.group(2), m.group(3)
        fields[mc].add((fn, parse_type(ty)))
        class_refs.add(mc)
    # also all class refs mentioned anywhere in constant pools
    for m in re.finditer(r'net/minecraft/class_(\d+)', src):
        class_refs.add(f"class_{m.group(1)}")
    extra = re.findall(r'((?:com/mojang|org/joml|io/netty)/[\w$/]+)', src)
    for fq in extra:
        fq = fq.replace('$', '_NEST_')
        extra_refs.add(fq)

print("methods:", len(methods), "fields:", sum(len(v) for v in fields.values()), "classes:", len(class_refs), file=sys.stderr)

# emit stubs
base = r"C:\Users\dany1\AppData\Local\Temp\opencode\stubs\net\minecraft"
os.makedirs(base, exist_ok=True)

# keep manual hierarchy (extends) for the ones the verifier demanded
HIER = {"638": "1922", "1922": "1937", "746": "1657", "1657": "1309", "1309": "1297",
        "3966": "239", "3965": "239", "2935": "2596", "2338": "2382", "2817": "2596",
        "2846": "2596", "9091": "2596", "1792": "1935", "2561": "5348", "5250": "2561",
        "1043": "1044", "8709": "8710", "243": "2374", "636": "746"}

# collect inner-class references of net.minecraft classes: class_XXXX.class_YYYY
inner_mc = collections.defaultdict(set)
for i in range(0, len(classes), chunk):
    pass
# second pass to grab inner class refs
for i in range(0, len(classes), chunk):
    batch = classes[i:i+chunk]
    r = subprocess.run([javap, "-c", "-p", "-classpath", jar] + batch, capture_output=True, text=True, encoding="utf-8", errors="replace")
    src = r.stdout
    for m in re.finditer(r'net/minecraft/class_(\d+)\$class_(\d+)', src):
        inner_mc[f"class_{m.group(1)}"].add(f"class_{m.group(2)}")

for mc in sorted(class_refs):
    n = mc.replace("class_", "")
    sup = HIER.get(n)
    ext = f" extends class_{sup}" if sup else ""
    lines = [f"package net.minecraft;", f"public class {mc}{ext} {{", f"    public {mc}() {{}}", f"    public {mc}(Object... a) {{}}"]
    # special-case: ResourceLocation-like static factory used in clinit of several classes
    if mc == "class_2960":
        already = any(mn == "method_60655" for mn in ({k[1] for k in methods if k[0] == mc}))
        if not already:
            lines.append("    public static class_2960 method_60655(String a, String b) { return new class_2960(); }")
        lines.append("    public String toString() { return \"stub:\" + hashCode(); }")
    for fn, ty in sorted(fields.get(mc, [])):
        lines.append(f"    public {ty} {fn};")
    for mn in sorted({k[1] for k in methods if k[0] == mc}):
        for (ret, params) in methods[(mc, mn)]:
            plist = ", ".join(f"{p} a{i}" for i, p in enumerate(params))
            body = "return null;"
            if ret == "void": body = ""
            elif ret == "int": body = "return 0;"
            elif ret == "long": body = "return 0L;"
            elif ret == "boolean": body = "return false;"
            elif ret == "double": body = "return 0.0;"
            elif ret == "float": body = "return 0.0F;"
            elif ret == "byte": body = "return (byte)0;"
            elif ret == "short": body = "return (short)0;"
            elif ret == "char": body = "return (char)0;"
            elif ret == "double[]": body = "return new double[0];"
            elif ret == "int[]": body = "return new int[0];"
            elif ret == "float[]": body = "return new float[0];"
            elif ret == "byte[]": body = "return new byte[0];"
            elif ret == "boolean[]": body = "return new boolean[0];"
            elif ret == "long[]": body = "return new long[0];"
            elif ret == "short[]": body = "return new short[0];"
            elif ret == "char[]": body = "return new char[0];"
            lines.append(f"    public static {ret} {mn}({plist}) {{ {body} }}")
    for inner in sorted(inner_mc.get(mc, [])):
        lines.append(f"    public static class {inner} {{}}")
    lines.append("}")
    open(os.path.join(base, f"{mc}.java"), "w", encoding="utf-8").write("\n".join(lines) + "\n")

# remove standalone stub files for names that are inner classes of another stub
all_inners = set()
for v in inner_mc.values():
    all_inners.update(v)
removed = 0
for inner in all_inners:
    p = os.path.join(base, f"{inner}.java")
    if os.path.exists(p):
        os.remove(p)
        removed += 1
print("removed standalone inner dupes:", removed, file=sys.stderr)

# emit empty stubs for com.mojang/org.joml/io.netty referenced types (group nested under outer class)
outer_map = collections.defaultdict(set)
for fq in extra_refs:
    pkg, name = fq.rsplit('/', 1)
    if '_NEST_' in name:
        outer, inner = name.split('_NEST_', 1)
        outer_map[(pkg, outer)].add(inner)
    else:
        outer_map[(pkg, name)].add(None)
for (pkg, name), inners in sorted(outer_map.items()):
    d = os.path.join(base, pkg.replace('/', os.sep))
    os.makedirs(d, exist_ok=True)
    body = f"package {pkg.replace('/', '.')};\npublic class {name} {{\n"
    for inner in sorted(x for x in inners if x):
        body += f"    public static class {inner} {{}}\n"
    body += "}\n"
    open(os.path.join(d, name + ".java"), "w", encoding="utf-8").write(body)

print("emitted stub classes:", len(class_refs), "extra:", len(extra_refs), file=sys.stderr)
