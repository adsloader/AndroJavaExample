package com.example.snake.androjavaexample.day3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.snake.androjavaexample.R;

public class Activity_1_2 extends AppCompatActivity {

    Button btnOk = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_2);

        btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOk.setText("Click~~!!");
                btnOk.setTextColor(Color.parseColor("#333333"));
                btnOk.setBackgroundColor(Color.parseColor("#FFFF33"));
            }
        });

        // 힌트: click 했는지 안했는 지 비교하는 변수를 관리하면 됨.
        // 미션 1: 버튼을 처음 누르면 "빨강"으로 텍스트를 보이며 빨강색 처리, 또 한번 누르면
        // 원래색으로 복귀. 그리고 또 누르면 빨강"으로 텍스트를 보이며 빨강색 처리를 반복하게 구현.
    }
}
