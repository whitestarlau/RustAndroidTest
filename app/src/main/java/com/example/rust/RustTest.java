package com.example.rust;

public class RustTest {
    static {
        System.loadLibrary("rust");
    }

    /**
     * A native method that is implemented by the 'rust' native library,
     * which is packaged with this application.
     */
    public static native void startRequestFromJni(Callback callback);

    public interface Callback {
        public void startCall();
        public void getResult(String str);
    }
}
