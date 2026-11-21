# Session memory

Last updated: 2026-11-20

- Branch `codex/carrier-idle-suspend` exposes `Carrier.setNetworkSuspended`
  over JNI. Build with Elastos.NET.Carrier.Native.SDK branch
  `codex/carrier-idle-suspend`.
- The Beagle app uses it after the idle background timer and resumes it on
  foreground entry or a push. Its local Maven AAR is `6.0.5-beagle3`.
