package com.example.mariajose.lab9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new MyWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebChromeClient(new WebChromeClient(){
            public void onConsoleMessage(String message, int linenumber, String sourceId){
                Log.d("webview", message + " --- from line "
                        + linenumber + " of "
                        + sourceId
                );
            }
        });

        webView.addJavascriptInterface(new WebAppInterface(this), "Android");


        webView.loadUrl("http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/");
        //webView.loadUrl("http://saf.uandes.cl/");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed()
    {
       Log.d("webView", "Se presiono adtras");
    }


}
