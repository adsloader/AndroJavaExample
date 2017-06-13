package com.example.snake.androjavaexample.day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.snake.androjavaexample.R;

public class Activity_2_2 extends AppCompatActivity {

    Button btnLaunch = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_2);

        setUpUi();
    }

    // UI를 설정하는 메소드
    private void setUpUi() {
        btnLaunch = (Button)findViewById(R.id.button);
        btnLaunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_2_2.this, Activity_2_2_second.class);
                i.putExtra("message", "hi");
                startActivity(i);
            }
        });
    }

    /*
     * 미션 1: "test"라는 이름으로 "테스트"라는 값을 보내고 호출된 Activity에서 setTitle로 보여준다. .
     * 힌트 : Intent의 put, get의 이해
    * */
}
