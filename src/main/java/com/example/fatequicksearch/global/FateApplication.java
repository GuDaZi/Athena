package com.example.fatequicksearch.global;

import android.app.Application;
import android.content.Context;

/**
 * Created by TJTJL on 2017/6/13.
 */

public class FateApplication extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

}
