import os, re, sys

root = r"C:\Users\dany1\AppData\Local\Temp\opencode\orchard-src\k74"

METHOD_HEAD = re.compile(r'^   (?:public |private |protected )?(?:static |final |synchronized )*[\w<>.\[\], ?]+\s+(\w+)\s*\([^)]*\)\s*\{')

def process_file(path):
    src = open(path, encoding='utf-8', errors='replace').read()
    lines = src.split('\n')
    chunks = []
    cur_name = None; cur = []
    for ln in lines:
        is_head = False; nm = None
        if ln.startswith('   static {'): is_head, nm = True, '<clinit>'
        elif METHOD_HEAD.match(ln): is_head = True; nm = METHOD_HEAD.match(ln).group(1)
        elif re.match(r'^   \w+ \w+\(.*\)\s*\{', ln):
            mm = re.match(r'^   \w+ (\w+)\(', ln)
            if mm: is_head, nm = True, mm.group(1)
        if is_head and nm:
            if cur_name is not None: chunks.append((cur_name, '\n'.join(cur)))
            cur_name, cur = nm, []
        if cur_name is not None: cur.append(ln)
    if cur_name is not None: chunks.append((cur_name, '\n'.join(cur)))

    out = []
    for mname, body in chunks:
        varexprs = {}
        for m in re.finditer(r'^\s+int (var\d+) = (.+?);$', body, re.M):
            varexprs[m.group(1)] = m.group(2).strip()
        # sites: IlIIllIII.(lI|Ill|lII)(
        for m in re.finditer(r'IlIIllIII\.(?:lI|Ill|lII)\(', body):
            start = m.end() - 1
            d = 0; i = start
            while i < len(body):
                c = body[i]
                if c == '(': d += 1
                elif c == ')':
                    d -= 1
                    if d == 0: break
                i += 1
            inner = body[start+1:i]
            out.append((mname, inner, varexprs))
    return out

records = []
for dirpath, dirs, files in os.walk(root):
    for fn in files:
        if not fn.endswith('.java'): continue
        cls = os.path.relpath(os.path.join(dirpath, fn), root).replace('\\','/')[:-5]
        if cls.endswith('package-info'): continue
        for mname, expr, env in process_file(os.path.join(dirpath, fn)):
            records.append((cls, mname, expr, env))

with open(r"C:\Users\dany1\AppData\Local\Temp\opencode\callsites.txt", 'w', encoding='utf-8') as f:
    for cls, mname, expr, env in records:
        varstr = '|'.join(f"{k}~{v}" for k, v in sorted(env.items()))
        expr_flat = ' '.join(expr.split())
        f.write(f"{cls}\t{mname}\t{varstr}\t{expr_flat}\n")

print("emitted", len(records), "callsites", file=sys.stderr)
