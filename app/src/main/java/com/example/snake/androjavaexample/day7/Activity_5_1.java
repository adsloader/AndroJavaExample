package com.example.snake.androjavaexample.day7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.snake.androjavaexample.R;

public class Activity_5_1 extends AppCompatActivity {

    private WebView webview;
    private Button btnNaver;
    private Button btnGoogle;
    private Button btnMyHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_1);

        setUpUI();
    }

    private void setUpUI() {
        webview = (WebView)findViewById(R.id.wbMain);
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

        btnNaver = (Button) findViewById(R.id.btnNaver);
        btnNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 이동한다.
                webview.loadUrl("http://www.naver.com");

            }
        });

        btnGoogle = (Button) findViewById(R.id.btnGoogle);
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 이동한다.
                webview.loadUrl("http://www.google.com");

            }
        });

        btnMyHome = (Button) findViewById(R.id.btnMyHome);
        btnMyHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 이동한다.
                webview.loadUrl("http://blog.naver.com/adsloader");

            }
        });
    }

    // webview에서 필요한 클래스
    class WebClient extends WebViewClient {
        // URL을 요청했다면...
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    /*
    미션 1: pinch(손가락으로 줌인아웃) 기능 구현. -> 소스내의 주석처리된 부분 참조
    미션 2: 82번 라인  view.loadUrl(url);을 주석처리.
    */

}
