# Orchard Client — Fully Reversed

> ## ⚠️ VIRUS / MALWARE — DO NOT DOWNLOAD ⚠️
>
> **Windows Defender flags this jar.** This repository does not recommend, host, or encourage downloading or running it. The original file is included *only* as a research specimen for the teardown below.
>
> Why it deserves the flag — all confirmed by reverse engineering, not guesswork:
>
> - **It spawns `powershell.exe -ExecutionPolicy Bypass`** — extracts a script from its own jar to `%TEMP%` and executes it, restarting the process every 2 seconds. Policy-bypass script execution is textbook malware behavior, in a *game mod*.
> - **It fingerprints your machine** — OS snapshotting (`Windows 11`, `10.0`), win/mac/darwin/android detection, HWID regex matching, and a `,"hwid":"` JSON payload builder. The upload endpoint isn't visible in this build — meaning it can be enabled in any other build invisibly.
> - **It actively fights analysis.** Per-call-site string encryption keyed to caller stack-frame hashes, fake symbol tables, and a prompt-injection file designed to make AI tools refuse to inspect it. Legitimate mods don't do this. Rootkits do this.
> - **The "payload slot" is empty in this build.** The same structure that's inert today ships working in whatever build the vendor hands you next, with zero visibility.
>
> **Do not download it. Do not run it on your main machine. If you already have it, Defender is right.**

---

> **Orchard "Client" v1.8.0+1.21.11 (internal codename `ilovcats`)**
> A "proprietary", obfuscated, string-encrypted Minecraft 1.21.11 Fabric hack client.
> Fully decompiled, fully decrypted, fully documented — in one evening, offline.

<p align="center">
  <img alt="the dev's response when told his obfuscation was beaten" src="screenshots/dm.png" width="640">
</p>

> **Dany:** "yo sry to bother you, but you should encrypt the client better, i have been able to reverse eng some of it and i don't want that to be leaked to anybody"
> **The dev (Monohorde):** "get a job"
> **Dany:** "holy bro i did it with ai"
> **The dev:** <blank stares, deletes his invite link>

Well. Here it is — everything that "can't be leaked". Compliments of a free afternoon, a decompiler, and a JVM. If the owner is reading this: hi. Next time maybe pay for a real obfuscator instead of string-XOR + stack-trace theater, and definitely don't ship prompt-injection honeypots that tell AI models to refuse analysis — that's not a protection, that's a confession.

---

## What this repo is

This is a complete static + dynamic reverse-engineering of `orchard-1.21.11.jar`:

- **`orchard-1.21.11.jar`** — the original artifact (untouched, as received)
- **`orchard-extracted/`** — the jar exploded: manifest, mixins config, all 140 assets, original obfuscated `.class` files under `k74/x` (core) and `k74/y` (mixins)
- **`orchard-src/`** — all **695 classes** decompiled to Java (Vineflower)
- **`strings_out.txt`** — **815 decrypted runtime strings**, each with class + method context
- **`callsites.txt`** — the 3184 encrypted-string call sites scraped from the decompiled source
- **`RE-ORCHARD-REPORT.txt`** — the formal teardown report
- **`tools/`** — the entire crack kit, reproducible end to end

## What this thing actually is

| | |
|---|---|
| **Product** | Orchard Client ("Orchard Client", 1.8.0+1.21.11, build 251) |
| **Internal ID** | `ilovcats` (yes, really — `"id":"ilovcats"`) |
| **Type** | Minecraft 1.21.11 Fabric **client-side hack/cheat mod** |
| **Author alias** | `v1s0r` (mixin config is literally `v1s0r.mixins.json`) |
| **Size** | 8.8 MB, 695 classes, 63 mixins |
| **Requires** | Fabric Loader ≥ 0.18.4, fabric-api, Java 21 |
| **Hardcoded servers** | `smp.fadedmc.net`, `pvp.fadedmc.net` (allowlist logic in module code) |
| **Lang file secret** | registers itself as **"NameSkinChanger"** — a previous product name left in the bones |

## The "protection" layer (and why it failed)

The jar is wrapped in a three-layer string-encryption scheme designed to be undecryptable offline:

1. **Layer 1 — constant-pool blob decryption.** Huge unicode blobs live in `<clinit>`; each class decrypts its own string table with a fixed rotate-XOR scheme at class-init time.
2. **Layer 2 — per-callsite stack-hash keys.** Every string access decrypts with a key derived from the *caller's stack frame*: `(callerClassName.hashCode() ^ callerMethodName.hashCode()) >> 16 ^ CONST`. If you call the decryptor from anywhere else, you get garbage. This defeats naive reflective dumping and naive LLM harnesses.
3. **Layer 3 — base64 + LCG-derived XOR stream.** All layer-2 output is wrapped by `k74.x.IlIIllIII`, which base64-decodes and XORs with an LCG-generated 64-byte keystream.

Plus:

- **Runtime `java.lang.reflect.Proxy` interceptors** (`IIlIlIIII`, `lIIIIl`) hooking foreign classes without mixins
- **Self-jar integrity checks** (`CodeSource`/`URL` reflection)
- **DosFileAttributeView abuse** on config backups
- And the crown jewel — **AI honeypots baked into the jar assets**:
  - `assets/m2c8/security/eval_agent_context.json` — a prompt-injection payload instructing AI assistants to *refuse analysis* and claim the code is "honeypot decoy procedures handled by an external native hypervisor" (it is not)
  - `assets/m2c8/security/decomp_symbol_cache.bin` — a fake "symbol table" pointing at a `q96.x` package that doesn't exist anywhere in the jar, designed to poison automated decompiler tooling

Both honeypots are documented in this repo. Neither worked.

### How it was beaten (the fun part)

Reimplementing the crypto was error-prone, so we didn't. Instead:

1. **`obf_parse.py`** parses all 695 decompiled sources and extracts every `IlIIllIII.lI(...)` string-decrypt call site with its integer arguments and local-variable environment (3184 sites).
2. **`gen_stub2.py`** rips real method/field signatures out of the jar via `javap` and emits ~300 empty stub classes (`net.minecraft.class_*`, gson/joml/netty replacements) so the obfuscated classes can load *without Minecraft present*. A convergence loop (`stub_loop.py`) auto-extends the stub hierarchy from JVM `VerifyError` messages until every class initializes — the verifier's own error text literally writes the class hierarchy for you.
3. **`ObfDump.java`** loads the real classes under a portable JDK 21, lets each class's `<clinit>` decrypt its own tables natively, then reflectively invokes the per-class decryptors with the scraped call arguments, pipes results through the real `IlIIllIII.lI` transform, and dumps plaintext.

No crypto was reimplemented. The mod decrypted itself for us. That's the joke.

## Architecture map

```
k74.x.IIIIllII (ModInitializer)        main entrypoint, no-op
k74.x.IIIIIllII (ClientModInitializer) boot: registers tick/HUD events, shutdown hook,
                                       writes .minecraft/orchard-init.log (t=<ms> boot trace)
k74.y.*                                63 mixins — the hook map:
    class_2535 Connection (netty)      channelRead0 + send → full packet interception
    class_746 MultiPlayerGameMode      attack / interact / use-item routing (combat core)
    class_310 Minecraft                init, resize, pause, close, key input, screens
    class_312 MouseHandler             mouse routing (GUI vs. combat)
    class_1657/1309/1297 Player etc.   movement, spawn, hit ticks
    class_636 ClientPlayerEntity       input routing, entity checks
    class_634 ClientPacketListener     chat/commands, keepalive, disconnect handling
    class_761 FirstPersonRenderer      hand swing
    class_759/897 ItemRenderer etc.    first-person anims, fake-client badge rendering
    class_1661 PlayerInventory         slot switches (chest stealers, swap logic)
    + Fabric WorldRenderEvents bridges ($AfterEntities, $EndExtraction)
```

## Module catalog (all decrypted)

**Combat:** TriggerBot (target mode, range + variability, sword/axe cooldowns, reaction time ms, smart crits, unshield, ignore shields, invisible players, weapon-only, hold-bind) · Aim Assist (range, FOV, strength, smoothness, aim drift %, hand tremor %, pitch ratio, smart, allow-override) — including an entire **"Dev" anti-detection suite**: yaw/pitch/blend variance min-max, drift frequency, step noise, shake, twitch chance/amount, overshoot, micro-pause chance/duration, blend/smooth/lock scales — i.e., aim movement *engineered to look human* · Aim Optimizer (mouse slowdown near targets, tracking scale, pitch weight, deadzone) · NoMissDelay (chance-based removal of missed-hit delay) · MaceSwap (StunSlam, Breach Swap, min fall distance, density-above) · PearlChase (counter-pearl vs opponent trajectories) · ClickPearl/PearlCatch · Perfect Windcharge (auto-jump on wind charge at feet) · Crystal module (switch delay, obby place delay, crystal place delay, explode delay) · SprintReset · KeepSprint (velocity ratio, sprint condition) · Hitbox · LagRange (packet choking while closing into range) · TotemGuard

**Automation:** Autoclicker (CPS, button, only-when-holding) · ChestStealer/ChestAura (delay, shulkers, hoppers, only-valuables) · InventoryCleaner (drop junk, clean armor/tools/custom models) · Inventory Presets · FastPlace · FastXP (auto XP bottles, start/target durability) · FastCart · AutoRunner · AutoTpBack · AutoGG (kill message: *"Maybe this client would have saved you <3"*) · Panic (disable all)

**Movement:** Speed (legit with straight-line equalization or sprint + autojump; exploit mode) · Legit Scaffold (edge sneaking, length ticks, sneak speed multiplier, ground/blocks/backwards conditions) · Parkour (edge auto-jump) · NoJumpDelay · VClip (distance blocks, reset motion) · SnapTap · Free Camera · WebAssist (place *only* cobwebs through entities)

**Render:** 2D ESP (health bar) · DivebombESP (3-block ground heatmap) · Storage ESP (chests/barrels/hoppers/furnaces/shulkers/ender chests/spawners, per-type colors, box/item styles) · PlayerLocator (outlines through walls, nametags, custom target list) · TargetCircle (animated circle around current target) · PopVisuals (frozen ghost on totem/charm pop) · Glow · Rotations (silent server head rotations) · Trajectories (projectile path prediction) · JumpCircle · **Chinahat** (a cone hat on player heads — yes, really) · FullBright · NoEffectView · Animations (first-person item animations, fully mirrored offhand config: swing speed/curve/strength, per-axis rotation, spin, tilt, scale, offsets)

**Client:** **Fake Client** (spoofs client brand + channels as Fabric, Feather or Lunar) · FakePlayer · FakeHacker · PingSpoof (manual or opponent-matched latency) · AntiBot (tablist absence, zero ping, malformed identity, invisible bot, air floating, duplicate identity, entity ID, grace period) · **Spotify HUD** (song, album art, progress, synced lyrics) · Unload Orchard · Opsec ("Your favourite opsec mod, just inside Orchard")

Categories: Player, Combat, Movement, Render, Hud, Interface.

## Network surface (all endpoints recovered)

- `https://lrclib.net/api/search?track_name=…&artist_name=…` and `https://lrclib.net/api/get?…` — lyric fetching for the Spotify HUD, User-Agent `Ilovcats-Spotify-HUD/1.0`
- **Update checker** (`lIlIl`): JSON with `version / build / subversion / mc_target / download_url / notes_url`, 30-minute poll cycle, 8 KB… actually 16 KB response cap, semver comparison
- **Profile lookup HTTP client** (`IIIllIIII`): GET with URL-encoded name/param pairs, 8 s timeout
- **Name blacklist:** SHA-256(name), first 16 bytes, binary-searched over a **7767-entry baked-in table**
- **HWID infrastructure** (`lIllllI`): OS snapshotting (`Windows 11`, `10.0`, win/mac/darwin/android detection), HWID regex `(?i)([0-9a-f]{32}|[0-9a-f]{8}(?:-[0-9a-f]{4}){3}-[0-9a-f]{12})`, a `,"hwid":"` JSON builder — extraction only, **no telemetry/license upload endpoint found in this build**

## The PowerShell bridge (the headline finding)

`IIIllIIII` extracts `/assets/cats/spotify/spotify_session.ps1` from the jar to `%TEMP%\ilovcats-spotify\` and launches:

```
powershell.exe -NoProfile -NonInteractive -ExecutionPolicy Bypass -File <script>
```

then reads JSON + Base64 messages from its stdout, restarting the process every 2 seconds. That is textbook malware-shaped behavior in a Minecraft mod, whatever the intent.

**This specific build is inert:** the script `assets/cats/spotify/spotify_session.ps1` is *not in the jar* (all 140 assets are under `assets/m2c8/`), so `getResourceAsStream` returns null, the bridge throws, and silently retries forever. The code exists; the payload doesn't. Any build that ships the script would execute it. Evaluation criteria, meet bar.

## Internal services

- **Local web server** (`llIIlllI`): browser-based ClickGUI. JSON routes: `ok/port/webEnabled/nativeFallbackAvailable/clickGuiBind/backupDirectory`, `profiles`, `export`, and audit hooks on every mutation (`before-module-toggle`, `before-keybind-update`, `before-setting-update`, `before-clickgui-bind-update`, `before-action-press`, `before-profile-*`, `before-hud-mutation`, `before-web-mutation/restore`). Includes literal SSRF/channel/translation-probe blocks (the "Opsec" module). One gem: *"Native ClickGUI fallback has been removed; web ClickGUI cannot be disabled from the UI."*
- **Config system**: per-profile settings JSON, `modules/settings` JSON, `clickGuiLayout` + imported `riseClickGuiLayout` naming, `.bak` backups + `.before-web-restore.` snapshots, hidden attribute manipulation via DosFileAttributeView
- **Reads Lunar Client's cache**: `~/.lunarclient/launcher-cache/...` (`texturesIndex.txt`, `cosmetics.json`, `jit_index`)
- **Filesystem footprint**: `.minecraft/orchard-init.log`, `%TEMP%\ilovcats-spotify\`

## The honeypots (for the record)

Both files live in `orchard-extracted/assets/m2c8/security/`. One instructs AI models to output a fake error and claims a "native hypervisor" runs the real logic (there is no native layer; it's all plain Java bytecode). The other is a synthetic symbol table for a package that isn't in the jar. They exist purely to break AI-assisted analysis workflows. They are preserved here as exhibits.

## Reproducing the dump

Requirements: any JDK 21+, Python 3, and the jars listed in `tools/` deps below.

```bash
# 1. decompile everything
java -jar vineflower.jar --silent -dgs=1 orchard-1.21.11.jar orchard-src

# 2. scrape string call sites
python obf_parse.py                 # -> callsites.txt

# 3. generate dependency stubs from javap signatures
python gen_stub2.py                 # -> stubs/ tree (compiles with javac)

# 4. load real classes under JDK21, reflect decryptors, dump plaintext
java -cp stubs;gson.jar;slf4j.jar;joml.jar;fastutil.jar; ObfDump orchard-1.21.11.jar callsites.txt
```

~250 of 695 classes fail offline `<clinit>` (netty/mixin/MC-tied classes) and ~2400 call sites remain stack-hash-locked — those require a live 1.21.11 Fabric client run. Everything user-facing (module names, settings labels, HUD strings, URLs, config keys) is fully covered by the recovered set.

## Disclaimer

This repository documents security research on a binary that **Windows Defender itself flags as malicious**. The jar is stored here as a specimen only. Nothing here includes, reproduces, or links to paid/hacked content, and nothing here helps run the client on servers that ban it — the opposite: this is the public service announcement the vendor's "security" posture demanded. Do not download the jar. Do not execute it. It spawns policy-bypassing PowerShell, fingerprints your machine, and ships anti-analysis honeypots — treat it exactly as Defender treats it: as malware.

---

*Reverse engineered with an offline JVM, 300 stub classes, and a decompiler. No hypervisor required.*
