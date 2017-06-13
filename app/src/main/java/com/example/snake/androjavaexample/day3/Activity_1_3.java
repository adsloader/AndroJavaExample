package com.example.snake.androjavaexample.day3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.snake.androjavaexample.R;

public class Activity_1_3 extends AppCompatActivity {

    TextView txtTitle = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_3);

        txtTitle = (TextView)findViewById(R.id.txtTitle);
        txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTitle.setBackgroundColor(Color.RED);
                txtTitle.setText("동적변경");
                txtTitle.setTextColor(Color.WHITE);
                txtTitle.setTextSize(48);
            }
        });

    }

    /*
    * 미션 1: TextView를 누를 때마다 글자크기를 2씩 줄이고 "?번 클릭"으로 클릭한 횟수를 보여주기
    * 힌트: 카운트 관련 변수를 관리함.
    * */
}
