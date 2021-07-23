## What is this repo?
+ This is a repo to test rust program language on android.

## how to build?
1. Install rust from https://www.rust-lang.org/.
2. Install the rust toolchains for your target platforms:
   ```
    rustup target add armv7-linux-androideabi   # for arm
    rustup target add i686-linux-android        # for x86
    rustup target add aarch64-linux-android     # for arm64
    rustup target add x86_64-linux-android      # for x86_64
    rustup target add x86_64-unknown-linux-gnu  # for linux-x86-64
    rustup target add x86_64-apple-darwin       # for darwin (macOS)
    rustup target add x86_64-pc-windows-gnu     # for win32-x86-64-gnu
    rustup target add x86_64-pc-windows-msvc    # for win32-x86-64-msvc
   ``` 
3. Install Android studio,sdk and ndk toolchains.
4. Build.

## More infomation:
+ I use Rust Android Gradle Plugin from mozilla,see https://github.com/mozilla/rust-android-gradle
+ You can learn rust by Rust book. https://doc.rust-lang.org/stable/book/
+ Maybe you're interested in these knowlage:
  + jni
  + android-ndk
  + rust-ffi (https://doc.rust-lang.org/nomicon/ffi.html).
