package com.example.snake.androjavaexample.day3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.snake.androjavaexample.R;

public class activity_1_3 extends AppCompatActivity {

    TextView txtTitle = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_3);

        txtTitle = (TextView)findViewById(R.id.txtTitle);
        txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTitle.setBackgroundColor(Color.RED);
                txtTitle.setText("동적변경");
                txtTitle.setTextColor(Color.WHITE);
                txtTitle.setTextSize(48);
            }
        });

    }
}
