package com.example.snake.androjavaexample.day5.self;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.snake.androjavaexample.R;

public class Activity_about_3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_about_3);
    }
}
