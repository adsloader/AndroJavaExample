package com.example.snake.androjavaexample.day3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity_1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 코드로 화면을 그리는 노가다 예제
        // 레아아웃을 생성 및 오리엔테이션 및 색상지정
        LinearLayout ln;
        ln = new LinearLayout(this);
        ln.setBackgroundColor(Color.DKGRAY);
        ln.setOrientation(LinearLayout.VERTICAL);

        // TextView와 Button을 생성
        TextView txtTest = new TextView(this);
        txtTest.setText("동적 TextView!!");
        Button btn = new Button(this);
        btn.setText("동적 Button!!");

        // 텍스트를 붙인다.
        ln.addView(txtTest);

        // 버튼을 붙인다.
        ln.addView(btn);

        setContentView(ln);
        //setContentView(R.layout.activity_main);
    }
}
