package com.assembly.user.librarya;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.github.mzule.activityrouter.annotation.Router;
import com.github.mzule.activityrouter.router.Routers;


@Router("libraryOne")
public class LibraryOneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main_activity);
    }

    public  void aClick(View view){
        Routers.open(LibraryOneActivity.this,"assembly://libraryTwo");
    }

}
