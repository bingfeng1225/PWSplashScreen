package com.qd.peiwen.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;

import com.gyf.barlibrary.ImmersionBar;

/**
 * Created by nick on 2018/5/7.
 */

public class PWSplash extends Dialog {

    private Activity activity;
    private ImmersionBar immersionBar;

    public PWSplash(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        this.activity = (Activity) context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setCancelable(false);
        this.setContentView(R.layout.launch_screen);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(this.immersionBar == null) {
            this.immersionBar = ImmersionBar.with(this.activity, this, "PWSplash");
        }
        this.immersionBar.init();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(null != this.immersionBar){
            this.immersionBar.destroy();
        }
    }
}
