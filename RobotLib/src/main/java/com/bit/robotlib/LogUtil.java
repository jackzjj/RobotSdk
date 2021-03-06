package com.bit.robotlib;


import android.util.Log;

/**
 * 简单的LogUtil工具
 */
public class LogUtil {

    public static boolean isDebug = false;

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }

    public static void e(String tag, String msg, Throwable t) {
        //        if (DEBUG) {
        Log.e(tag, msg, t);
        //        }
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }


    public static void v(String tag, String msg) {
        if (isDebug) {
            Log.v(tag, msg);
        }
    }


    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }


    public static void w(String tag, String msg) {
        if (isDebug) {
            LogUtil.i(tag, msg);
        }
    }


}