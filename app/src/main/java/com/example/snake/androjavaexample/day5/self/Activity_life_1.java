package com.example.snake.androjavaexample.day5.self;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.snake.androjavaexample.R;

public class Activity_life_1 extends AppCompatActivity {

    int nLineNumber = 0;
    // Activity가 생성될 때
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_1);

        Log.d("ALLTEST", String.format("\n%d: onCreate", nLineNumber++) );
    }

    // 내 activity 맨앞으로 왔을 때
    @Override
    public void onResume(){
        super.onResume();
        Log.d("ALLTEST", String.format("%d: onResume", nLineNumber++) );
    }

    // 내 activity 맨앞에 뭔가가 있을 때
    @Override
    public void onStop(){
        super.onStop();
        Log.d("ALLTEST", String.format("%d: onStop", nLineNumber++) );
    }

    // Activity가 최초실행될 때
    @Override
    public void onStart(){
        super.onStart();
        Log.d("ALLTEST", String.format("%d: onStart", nLineNumber++) );
    }

    // Activity가 완전히 종료될 때
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("ALLTEST", String.format("%d: onDestroy", nLineNumber++) );
    }

}
