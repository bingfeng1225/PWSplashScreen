package com.simple;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.qd.peiwen.splashscreen.PWSplashScreen;

public class MainActivity extends ReactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PWSplashScreen.show(this);
        super.onCreate(savedInstanceState);
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "Simple";
    }
}
