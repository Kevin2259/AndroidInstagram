package com.example.androidparstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import com.parse.Parse;
import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KbT3pP4hmSjiHvC2BOVj5PxONiYpKmZG2Rvje2WZ")
                .clientKey("vdSAofUUBhbBU3H7zdAhNLG2g7LHIvEXwtplZ36z")
                .server("https://parseapi.back4app.com")
                .build()
        );
//        Parse.initialize(new Parse.Configuration.Builder(this)
//                .applicationId("1sxpdmTlsLyf2FQWCwIwxE1ayikoWPpAy2bBMHos")
//                .clientKey("JiLndTbylDzmHTcxSnOnrOInPpN8hnYIiET5KleM")
//                .server("https://parseapi.back4app.com")
//                .build()
//        );
    }
}
