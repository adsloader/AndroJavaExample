package com.example.snake.androjavaexample.day8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.snake.androjavaexample.R;

import java.util.concurrent.ExecutionException;

public class Activity_6_1 extends AppCompatActivity {

    private Button btnGet;
    private TextView txtSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6_1);

        // 화면만들기
        setUpUI();
    }

    private void setUpUI() {
        btnGet = (Button)findViewById(R.id.btnGet);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    MyHttpClient http = new MyHttpClient(getApplicationContext());

                    // 미션 1: 왜 안될까? 소스코딩상의 문제일까? 고민하기.
                    // vintageappmaker.com을 입력해보기
                    int nResultCode = http.execute("http://vintageappmaker.com", "GET").get();
                    if(nResultCode == MyHttpClient.REQUEST_FAIL) return;

                    String s = http.getString();
                    txtSource.setText(s);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        });

        txtSource = (TextView)findViewById(R.id.txtSource);

    }
}
