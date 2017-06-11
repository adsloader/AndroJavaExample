package com.example.snake.androjavaexample.day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.snake.androjavaexample.R;

public class activity_2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_1);

        // Activity를 실행한다.
        Intent intent = new Intent(activity_2_1.this, FullscreenActivity.class);
        startActivity(intent);

        // 지금 activity를 종료한다.
        finish();
    }
}
