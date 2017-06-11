package com.example.snake.androjavaexample.day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.snake.androjavaexample.R;

public class activity_2_3 extends AppCompatActivity {
    Button btnStartActivity = null;
    static int MY_REQUEST = 01;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == MY_REQUEST){
            String sData = data.getStringExtra("message");
            setTitle(sData);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_3);

        btnStartActivity = (Button) findViewById(R.id.button);
        btnStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_2_3.this, activity_2_3_second.class);
                i.putExtra("message", "hi");
                startActivityForResult(i, MY_REQUEST);
            }
        });
    }
}
