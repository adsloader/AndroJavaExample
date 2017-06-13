package com.example.snake.androjavaexample.day7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.snake.androjavaexample.R;

public class Activity_5_3 extends AppCompatActivity {

    /*
    * 핸드폰에서 웹브라우저 기본설정을 하면
    * 호출되지 않는다.!!!!!
    *
    * 테스트방법:
    * 1. 핸드폰 웹에서 구글이동
    * 2. 검색창에서 vintageappmaker 검색
    * 3. www.vintageappmaker.com 링크를 선택
    * 4. 핸드폰 화면 하단에 앱선택이 나타남
    * */
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_3);

        // webview를 가져온다.
        webview = (WebView)findViewById(R.id.webView);
        // webview client 객체를 넘긴다.
        webview.setWebViewClient(new WebClient());
        // 브라우저 세팅을 가져온다.
        WebSettings set = webview.getSettings();
        // 자바스크립트를 실행가능하게
        set.setJavaScriptEnabled(true);
        // 줌인아웃을 불가능하게
        set.setBuiltInZoomControls(false);

        // Zoom 버튼의 보여지기 설정  -> Pinch로 Zoom을 가능하게 할 수도 있음
        // 아래와 같이하면
        // setBuiltInZoomControls(true)
        // set.setDisplayZoomControls(false);

        webview.loadUrl("http://www.vintageappmaker.com");
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
        // 실행되었을 때, 누군가 Intent로 호출했다면
        // 그 Intent 객체로 getData()를 하여 파라메터를 가져온다.
        Intent i = getIntent();
        if(i != null){
            Uri uri = i.getData();
            if (uri == null) return;

            // 파라메터를 읽어와서 보여준다.
            // ex) www.vintageappmaker.com?a=3&b=4이면
            // a=3&b=4 sMessage에 가져온다.
            String sMessage = uri.getQueryParameter("message");
            Toast.makeText(getApplicationContext(), sMessage, Toast.LENGTH_LONG).show();
        }
    }
}
