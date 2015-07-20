package com.ialway.inputmethod.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import android.util.Log;

import com.ialway.inputmethod.common.Constants;

public class LogUtils {

    private File logFile;
    private static LogUtils mInstance = new LogUtils();

    public LogUtils() {

        logFile = new File(Constants.LogContants.LOG_FILE_PATH);
    }

    public static LogUtils shared() {
        return mInstance;
    }

    public void iLog(String tag, String msg) {
        if (Constants.LogContants.LOG_OPEN) {
            Log.i(tag, msg);
        }
        if (Constants.LogContants.LOG_FILE_OPEN) {
            writeLogToFile(tag, msg);
        }
    }

    public void eLog(String tag, String msg) {

        if (Constants.LogContants.LOG_OPEN) {
            Log.e(tag, msg);
        }
        if (Constants.LogContants.LOG_FILE_OPEN) {
            writeLogToFile(tag, msg);
        }
    }

    public void dLog(String tag, String msg) {

        if (Constants.LogContants.LOG_OPEN) {
            Log.d(tag, msg);
        }
        if (Constants.LogContants.LOG_FILE_OPEN) {
            writeLogToFile(tag, msg);
        }
    }

    public void wLog(String tag, String msg) {

        if (Constants.LogContants.LOG_OPEN) {
            Log.w(tag, msg);
        }
        if (Constants.LogContants.LOG_FILE_OPEN) {
            writeLogToFile(tag, msg);
        }
    }

    /**
     * 将log写入sdcard
     * @param tag
     * @param msg
     */
    public void writeLogToFile(String tag, String msg) {

        FileWriter fileWrite = null;
        try {
            fileWrite = new FileWriter(logFile);
            fileWrite.append(tag);
            fileWrite.append(" : ");
            fileWrite.append(msg);
            fileWrite.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fileWrite != null) {
                try {
                    fileWrite.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
