package com.assembly.user.module2module;

import android.app.Application;
import com.github.mzule.activityrouter.annotation.Modules;


@Modules({"app","aModule","bModule"})
public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
