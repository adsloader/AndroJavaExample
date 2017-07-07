package com.example.snake.androjavaexample.day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.snake.androjavaexample.R;

public class Activity_2_extra extends AppCompatActivity {

    // 미션1: Tttle Bqr를 없애기(Activity 상속, setContentView이전에 코딩)
    // 미션2: 전체화면으로 만들기 (Activity 상속, setContentView 이후 코딩)
    // 미션3: 배경을 투명으로 만들기 -> (Activity 상속, XML 수정)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_extra);
    }
}
