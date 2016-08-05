package com.kauriheakth.kaurihealth;

import android.app.Application;
import android.support.multidex.MultiDex;

/**
 * Created by jianghw on 2016/8/5.
 * <p/>
 * 描述：
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MultiDex.install(this);
    }
}
