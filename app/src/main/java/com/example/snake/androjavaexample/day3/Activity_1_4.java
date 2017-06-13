package com.example.snake.androjavaexample.day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.snake.androjavaexample.R;

public class Activity_1_4 extends AppCompatActivity {

    EditText edt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_4);

        edt = (EditText)findViewById(R.id.editText);
        edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    Toast.makeText(getApplicationContext(), edt.getText().toString(), Toast.LENGTH_LONG).show();
                    edt.setText("");
                }
            }
        });

    }
}
