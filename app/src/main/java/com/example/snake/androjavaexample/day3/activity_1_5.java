package com.example.snake.androjavaexample.day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.snake.androjavaexample.R;

public class activity_1_5 extends AppCompatActivity {

    ImageButton btnCount = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_5);

        setUpUI();
    }

    // 화면을 설정하는 메소드
    private void setUpUI() {
        btnCount = (ImageButton) findViewById(R.id.imageButton);
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sDisplay = "";
                for (int i = 0; i < 100; i++){
                    sDisplay += Integer.toString( i) + "\n" ;
                }
                TextView txtCount = (TextView) findViewById(R.id.textView);
                txtCount.setText(sDisplay);
            }
        });
    }
}
