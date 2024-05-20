package com.meishe.onesignaldemo;

import android.app.Application;

import com.onesignal.OneSignal;

public class Myapp extends Application {

    private static final String ONESIGNAL_APP_ID = "96f7d433-3b72-46a0-b9e6-46fc341a9671";

    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
