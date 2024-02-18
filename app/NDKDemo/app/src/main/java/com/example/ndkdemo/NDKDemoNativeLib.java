package com.example.ndkdemonativelib;

import android.util.Log;

public class NDKDemoNativeLib {
    // Used to load the 'ndkdemonativelib' library on application startup.
    static {
        System.loadLibrary("ndkdemonativelib");
    }
    /**
     * A native method that is implemented by the 'ndkdemonativelib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native long fibonacciFromJNI(int element);
}