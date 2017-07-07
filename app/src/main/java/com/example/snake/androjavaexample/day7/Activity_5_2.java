package com.example.snake.androjavaexample.day7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.snake.androjavaexample.R;

public class Activity_5_2 extends AppCompatActivity {

    private WebView wbMain;
    private ProgressBar prgLoading;
    private Button btnNext;
    private Button btnPrev;
    private EditText edtURL;
    private Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_2);

        setUpUI();
    }

    private void setUpUI() {
        setWebViewUI();

        edtURL = (EditText)findViewById(R.id.edtURL);
        prgLoading = (ProgressBar) findViewById(R.id.prgLoading);

        btnGo    = (Button) findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wbMain.loadUrl(edtURL.getText().toString());

            }
        });

        btnNext    = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wbMain.goForward();

            }
        });

        btnPrev    = (Button) findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wbMain.goBack();

            }
        });

    }

    private void setWebViewUI() {
        wbMain = (WebView) findViewById(R.id.wbMain);

        // 무조건해야 한다. 웹페이지 진행상황을 관리하는 클래스
        wbMain.setWebViewClient(new WebClient());

        // 세팅을 가져오고 설정한다.
        WebSettings set = wbMain.getSettings();

        // 자바스크립틀을 사용가능하게 하고 zoom을 false한다.
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(false);

        // 이동한다.
        wbMain.loadUrl("http://vintageappmaker.tumblr.com/");
    }

    private class WebClient extends WebViewClient {

        // URL 호출하기 전...
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            prgLoading.setVisibility(View.VISIBLE);
            return super.shouldOverrideUrlLoading(view, url);
        }

        // webpage를 모두 읽었을 때,
        @Override
        public void onPageFinished(WebView view, String url) {
            prgLoading.setVisibility(View.GONE);
            super.onPageFinished(view, url);
        }
    }

    /*
    미션 1: Activity의 onBackPress를 오버라이드해서 back 버튼을 누를 시, 이전 주소로 이동한다.
    hint: 커서를 Activity 내에 어딘가에 이동 후, ctrl +o를 누르면 오버라이드 함수들이 나옴.
          이곳에서 onBackPress를 입력하면 자동으로 선택가능.
    */
}
