package com.example.snake.androjavaexample.day7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.snake.androjavaexample.R;

public class Activity_5_4_second extends AppCompatActivity {

    private WebView webview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_4_second);
        webview = (WebView)findViewById(R.id.webView);
        // webview client 객체를 넘긴다.
        webview.setWebViewClient(new WebClient());
        // 브라우저 세팅을 가져온다.
        WebSettings set = webview.getSettings();
        // 자바스크립트를 실행가능하게
        set.setJavaScriptEnabled(true);
        // 줌인아웃을 불가능하게
        set.setBuiltInZoomControls(false);

    }

    // webview에서 필요한 클래스
    class WebClient extends WebViewClient {
        // URL을 요청했다면...
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Intent i = getIntent();
        if (i != null){
            String sUrl = i.getStringExtra("url");
            webview.loadUrl(sUrl);
        }
    }
}
