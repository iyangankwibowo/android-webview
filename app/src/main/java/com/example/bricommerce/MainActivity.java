package com.example.bricommerce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webviewku;
    WebSettings websettingku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webviewku = (WebView)findViewById(R.id.WebView1);

        websettingku = webviewku.getSettings();

        webviewku.setWebViewClient(new WebViewClient());
        websettingku.setJavaScriptEnabled(true);
        websettingku.setDomStorageEnabled(true);
        websettingku.setLoadWithOverviewMode(true);
        websettingku.setUseWideViewPort(true);
        websettingku.setBuiltInZoomControls(true);
        websettingku.setDisplayZoomControls(false);
        websettingku.setSupportZoom(true);
        websettingku.setDefaultTextEncodingName("utf-8");

        webviewku.loadUrl("http://team5.itcampbri2021.net:7070/");
    }
}