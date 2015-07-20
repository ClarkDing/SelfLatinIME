package com.ialway.inputmethod.ui;

import android.app.Application;

public class MainApp extends Application {

    private static MainApp mInstance;

    public static MainApp getInstance() {
        if (mInstance == null) {
            mInstance = new MainApp();
        }   
        return mInstance;
    } 

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();

        mInstance = this;
    }
}
