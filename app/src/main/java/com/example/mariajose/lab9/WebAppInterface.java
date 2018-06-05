package com.example.mariajose.lab9;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;

/**
 * Created by MariaJose on 05-06-2018.
 */

public class WebAppInterface {

    Activity mActivity;

    WebAppInterface(Activity c){
        mActivity = c;
    }

    @JavascriptInterface
    public void closeApp(){
        mActivity.finish();
    }
}
