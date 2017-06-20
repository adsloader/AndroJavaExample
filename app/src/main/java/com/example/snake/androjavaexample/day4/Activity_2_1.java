package com.example.snake.androjavaexample.day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.snake.androjavaexample.R;

public class Activity_2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_1);

        // Activity를 실행한다.
        Intent intent = new Intent(Activity_2_1.this, FullscreenActivity.class);
        startActivity(intent);

        // 지금 activity를 종료한다.
        finish();
    }

    /*
    hint: Activity_1_2(3일차 2번째 예제) 참고.
    미션 1: 버튼을 만들고 버튼 클릭 시, FullscreenActivity를 화면에 띄운다.

    1. activity_main.xml에 버튼을 하나 만든다.
    2. id는 btnOk로 한다.
    3. MainActivity.java에서 btnOk 버튼형 변수를 만든다.
    4. findViewById()로 가져와
    setOnClickListener로 onClick 이벤트 핸들러를
    만든다. -> 클릭시 : FullscreenActivity 화면에 띄운다.

    */

}
