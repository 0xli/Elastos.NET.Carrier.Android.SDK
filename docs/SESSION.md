# Session memory

Last updated: 2026-11-22

- Branch `codex/carrier-rsp-redial` fixes the Android JNI receipt-send
  error path. The destination string and message buffer are released once.
  Use this JNI library in Android Carrier `6.0.5-beagle6`.

- Branch `codex/carrier-idle-suspend` exposes `Carrier.setNetworkSuspended`
  over JNI. Build with Elastos.NET.Carrier.Native.SDK branch
  `codex/carrier-idle-suspend`.
- The Beagle app uses it after the idle background timer and resumes it on
  foreground entry or a push. Its local Maven AAR is `6.0.5-beagle3`.
