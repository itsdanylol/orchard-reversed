import os, re, sys

# generate java stubs for missing deps
stubs = {
    "net/fabricmc/api/ModInitializer": ("interface", []),
    "net/fabricmc/api/ClientModInitializer": ("interface", []),
    "net/fabricmc/api/EnvType": ("enum", []),
    "net/fabricmc/api/Environment": ("annotation", ["net/fabricmc/api/EnvType"]),
    "net/fabricmc/loader/api/FabricLoader": ("class", ["net/minecraft/class_310"]),
    "net/fabricmc/loader/api/ModContainer": ("class", []),
    "net/fabricmc/loader/api/metadata/ModMetadata": ("interface", []),
    "net/fabricmc/loader/api/metadata/CustomValue": ("interface", []),
}
base = r"C:\Users\dany1\AppData\Local\Temp\opencode\stubs"
for fq, (kind, deps) in stubs.items():
    pkg, name = fq.rsplit("/", 1)
    d = os.path.join(base, pkg.replace('/', os.sep))
    os.makedirs(d, exist_ok=True)
    imports = []
    for dep in deps:
        if dep.startswith("net/fabricmc/"):
            imports.append("import %s.*;" % dep.rsplit("/", 1)[0].replace('/', '.'))
    body = ""
    if kind == "interface":
        src = f"package {pkg.replace('/','.')};\npublic interface {name} {{\n}}\n"
    elif kind == "enum":
        src = f"package {pkg.replace('/','.')};\npublic enum {name} {{\n CLIENT, SERVER, ANY;\n}}\n"
    elif kind == "annotation":
        src = f"package {pkg.replace('/','.')};\nimport java.lang.annotation.*;\n@Retention(RetentionPolicy.RUNTIME)\n@Target({{ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}})\npublic @interface {name} {{\n    EnvType value() default EnvType.ANY;\n}}\n"
    else:
        src = f"package {pkg.replace('/','.')};\npublic class {name} {{\n    public static {name} getInstance() {{ return new {name}(); }}\n    public Object getGameDir() {{ return null; }}\n    public Object getModContainer(String s) {{ return java.util.Optional.empty(); }}\n}}\n"
    open(os.path.join(d, name + ".java"), "w", encoding="utf-8").write(src)

print("stubs written to", base)
