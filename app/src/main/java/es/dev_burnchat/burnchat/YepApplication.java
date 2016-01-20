package es.dev_burnchat.burnchat;

import android.app.Application;

import com.parse.Parse;

///commit

public class YepApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this);
         }
    }


