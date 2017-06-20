package com.example.snake.androjavaexample.day4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.snake.androjavaexample.R;

public class Activity_2_4 extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_4);

        setUpUI();
    }

    // UI를 설정하는 메소드
    private void setUpUI() {
        btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // SMS 보내기
                Uri uri = Uri.parse("smsto:" + "01011112222");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "여기가 문자!!");
                startActivity(intent);
            }
        });

        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 전화걸기
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 114));
                startActivity(intent);
            }
        });

        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 지도이동
                Uri uri = Uri.parse ("geo: 37.5310091, 127.0261659");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 마켓으로 이동하기
                Uri uri = Uri.parse("market://details?id=com.psw.moringcall");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }

    /*
    미션 1: 자신의 집주소로 지도를 이동시켜보기.
    미션 2: 카카오톡으로 자신에게 문자를 보내보기 (4일차 강의문서에 있음)
    */
}
