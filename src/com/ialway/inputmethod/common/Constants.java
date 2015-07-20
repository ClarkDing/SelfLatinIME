package com.ialway.inputmethod.common;

import com.ialway.inputmethod.ui.MainApp;

import android.os.Environment;

public final class Constants {
    
    public interface FileConstants {
        
        public static final String SD_PATH = Environment.getExternalStorageDirectory().getPath();
    }
    
    public interface LogContants {
        
        public static final boolean LOG_OPEN = true;
        public static final boolean LOG_FILE_OPEN = true;
        public static final String LOG_FILE_PATH = FileConstants.SD_PATH + MainApp.getInstance().getPackageName() + "/log";
    }
}
