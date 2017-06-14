package com.example.snake.androjavaexample.day9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.snake.androjavaexample.R;

public class Activity_7_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7_2);

        Intent intent = new Intent(Activity_7_2.this, Service_7_2.class);
        startService(intent);
    }
}
