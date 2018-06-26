package com.facebook;

import android.app.Application;

/**
 * Created by galid on 2018-06-25.
 */

public class FaceBookApplication extends Application {

    private static FaceBookApplication instance;

    public static FaceBookApplication getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }


}
