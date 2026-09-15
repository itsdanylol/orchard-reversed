import os, re, glob, subprocess, sys, collections

jvm = r"C:\Users\dany1\AppData\Local\Temp\opencode\jdk21\jdk-21.0.12.1+1\bin\java.exe"
javac = r"C:\Users\dany1\AppData\Local\Temp\opencode\jdk21\jdk-21.0.12.1+1\bin\javac.exe"
base = r"C:\Users\dany1\AppData\Local\Temp\opencode\stubs"
jar = r"C:\Users\dany1\Downloads\orchard-1.21.11.jar"
gson = r"C:\Users\dany1\AppData\Local\Temp\opencode\gson.jar"

# collect all class_NNN names
names = set()
for p in glob.glob(r"C:\Users\dany1\AppData\Local\Temp\opencode\orchard-src\**\*.java", recursive=True):
    src = open(p, encoding="utf-8", errors="replace").read()
    names.update(re.findall(r'\bnet\.minecraft\.class_(\d+)\b', src))

sup = {}  # name -> extends name
inner_set = set()  # (outer, inner)
edges = collections.defaultdict(set)  # child -> set of parents seen in verifier errors

def write_stubs():
    for n in sorted(names):
        sup_n = sup.get(n)
        ext = f" extends class_{sup_n}" if sup_n else ""
        # avoid self-ext
        if sup_n == n: ext = ""
        src = (f"package net.minecraft;\n"
               f"public class class_{n}{ext} {{\n"
               f"    public class_{n}() {{}}\n"
               f"    public class_{n}(Object... a) {{}}\n"
               f"}}\n")
        open(os.path.join(base, f"net", f"minecraft", f"class_{n}.java"), "w", encoding="utf-8").write(src)
    for outer, inner in sorted(inner_set):
        src = (f"package net.minecraft;\n"
               f"public class class_{outer}$class_{inner} {{\n"
               f"}}\n")
        open(os.path.join(base, f"net", f"minecraft", f"class_{outer}$class_{inner}.java"), "w", encoding="utf-8").write(src)

def compile_stubs():
    files = glob.glob(base + "/**/*.java", recursive=True)
    r = subprocess.run([javac, "-encoding", "UTF-8", "-nowarn", "-d", base] + files, capture_output=True, text=True)
    if r.returncode != 0:
        print("STUB COMPILE FAIL:", r.stderr[:2000])
        return False
    return True

def run_dump(out_path):
    r = subprocess.run([jvm, "-Dfile.encoding=UTF-8", "-cp",
                        base + ";" + gson + ";" + r"C:\Users\dany1\AppData\Local\Temp\opencode\slf4j.jar" + ";" + r"C:\Users\dany1\AppData\Local\Temp\opencode",
                        "ObfDump", jar, r"C:\Users\dany1\AppData\Local\Temp\opencode\callsites.txt"],
                       capture_output=True, text=True, encoding="utf-8", errors="replace")
    open(out_path, "w", encoding="utf-8", errors="replace").write(r.stdout + "\n=== STDERR ===\n" + r.stderr)
    return r.stdout + "\n" + r.stderr

for iteration in range(12):
    write_stubs()
    if not compile_stubs():
        print("compile failed at iter", iteration); break
    txt = run_dump(rf"C:\Users\dany1\AppData\Local\Temp\opencode\strings_out.txt")
    fails = re.findall(r"Type 'net/minecraft/class_(\d+)' \(current frame[^)]*\)\s*is not assignable to 'net/minecraft/class_(\d+)'", txt)
    ncls = re.findall(r"NoClassDefFoundError: net/minecraft/class_(\d+)(?:\$class_(\d+))?", txt)
    print(f"iter {iteration}: loadfails={len(set(ncls))}, verify-edges={len(fails)}")
    if ncls:
        for a, b in set(ncls):
            names.add(a)
            if b: inner_set.add((a, b))
    changed = False
    for a, b in fails:
        if sup.get(a) != b and a != b:
            sup[a] = b
            changed = True
    if not ncls and not fails:
        print("CLEAN"); break
    if not changed and not ncls:
        print("no more progress; remaining verify errors:", len(fails)); break
    print("extending:", {a: b for a, b in fails})
