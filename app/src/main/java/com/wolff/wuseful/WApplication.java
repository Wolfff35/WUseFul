package com.wolff.wuseful;

import android.app.Application;

/**
 * Created by wolfff on 05.12.17.
 */

public class WApplication extends Application {
    private static WApplication singleton;
    public static WApplication getInstance() {
        return singleton;
    }
    @Override
    public final void onCreate() {
        super.onCreate();
        singleton = this;
    }


}
