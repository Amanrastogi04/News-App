package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import androidx.appcompat.widget.Toolbar;

public class webview extends AppCompatActivity {

    Toolbar toolbar;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        toolbar=findViewById(R.id.toolbar);
        webView=findViewById(R.id.webviews);
        setSupportActionBar(toolbar);



        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);

    }

}