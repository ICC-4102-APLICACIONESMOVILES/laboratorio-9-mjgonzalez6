package com.example.mariajose.lab9;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.net.Uri;
import android.view.KeyEvent;

/**
 * Created by MariaJose on 05-06-2018.
 */

//http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){

        if(Uri.parse(url).getHost().equals("http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/")){
            return false;
        }
        return true;
    }

}
