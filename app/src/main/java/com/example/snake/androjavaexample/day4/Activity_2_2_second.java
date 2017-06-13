package com.example.snake.androjavaexample.day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.snake.androjavaexample.R;

public class Activity_2_2_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_2_second);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Intent i = getIntent();

        // 값이 없으면 리턴
        if (i == null) return;

        String sMessage = i.getStringExtra("message");
        setTitle(sMessage);
    }
}
