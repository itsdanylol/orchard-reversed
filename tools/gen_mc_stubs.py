import os, re, glob

root = r"C:\Users\dany1\AppData\Local\Temp\opencode\orchard-src"
names = set()
for p in glob.glob(root + "/**/*.java", recursive=True):
    src = open(p, encoding="utf-8", errors="replace").read()
    names.update(re.findall(r'\bnet\.minecraft\.class_(\d+)\b', src))
    names.update(re.findall(r'class_(\d+)(?=\.class|\.\w+\(|\s+var|\))', src))

base = r"C:\Users\dany1\AppData\Local\Temp\opencode\stubs\net\minecraft"
os.makedirs(base, exist_ok=True)
count = 0
for n in sorted(names):
    src = (f"package net.minecraft;\n"
           f"public class class_{n} {{\n"
           f"    public class_{n}() {{}}\n"
           f"    public class_{n}(Object... a) {{}}\n"
           f"}}\n")
    open(os.path.join(base, f"class_{n}.java"), "w", encoding="utf-8").write(src)
    count += 1
print("generated", count, "minecraft stubs")
