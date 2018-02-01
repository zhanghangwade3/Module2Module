package com.assembly.user.libraryb;

import android.app.Activity;
import android.os.Bundle;

import com.github.mzule.activityrouter.annotation.Router;

/**
 * Created by user on 2018/1/30.
 */
@Router("libraryTwo")
public class LibraryTwoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_main_activity);
    }
}
