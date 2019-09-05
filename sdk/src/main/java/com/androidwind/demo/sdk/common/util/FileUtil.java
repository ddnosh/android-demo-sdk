package com.androidwind.demo.sdk.common.util;

import android.content.Context;
import android.os.Environment;

import java.io.File;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class FileUtil {

    public static String getLogDir(Context context) {
        String logDir;
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            logDir = Environment.getExternalStorageDirectory().getPath();
        } else {
            logDir = context.getFilesDir().getPath();
        }
        return logDir + File.separator + "Log";
    }
}
