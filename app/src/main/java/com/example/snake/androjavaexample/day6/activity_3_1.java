package com.example.snake.androjavaexample.day6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.snake.androjavaexample.R;

public class activity_3_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6_1);

        // 1. startService로 서비스를 실행합니다.
        Intent Service = new Intent(this, service_3_1.class);
        startService(Service);
    }
}
