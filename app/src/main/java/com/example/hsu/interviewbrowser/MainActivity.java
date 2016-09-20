package com.example.hsu.interviewbrowser;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.webViewOne);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.co.in/");

    }
}
