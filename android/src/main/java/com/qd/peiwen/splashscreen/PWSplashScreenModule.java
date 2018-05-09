package com.qd.peiwen.splashscreen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * PWSplash
 * 启动屏
 * from：http://www.devio.org
 * Author:CrazyCodeBoy
 * GitHub:https://github.com/crazycodeboy
 * Email:crazycodeboy@gmail.com
 */
public class PWSplashScreenModule extends ReactContextBaseJavaModule {
    public PWSplashScreenModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "PWSplashScreen";
    }

    /**
     * 打开启动屏
     */
    @ReactMethod
    public void show() {
        PWSplashScreen.show(getCurrentActivity());
    }

    /**
     * 关闭启动屏
     */
    @ReactMethod
    public void hide() {
        PWSplashScreen.hide(getCurrentActivity());
    }
}