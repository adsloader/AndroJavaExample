package com.example.snake.androjavaexample.day5.self;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.snake.androjavaexample.R;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Activity_calculator_1 extends AppCompatActivity {

    // 초기화 영역
    private Button button;
    private ArrayList<Integer> mNumberList = new ArrayList<Integer>();
    private TextView txtNumber;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_1);

        txtNumber = (TextView) findViewById(R.id.txtNumber);
        addListenerOnButton();

    }

    public void addListenerOnButton() {

        //Select a specific button to bundle it with the action you want
        button = (Button) findViewById(R.id.btnMemory);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                calculateNumber();

            }

        });

    }

    // 인터넷 검색에서 찾은 평형계산법
    // 3.305785 제곱미터가 1평임
    private void calculateNumber() {
        double per = 3.305785;
        String sDisplyNumber = (String)txtNumber.getText();
        double nNumber = new Double(sDisplyNumber);
        double nResult = per * nNumber;
        ShowMessage(String.format("%,d 제곱미터", Math.round(nResult) ) );
        txtNumber.setText("");
    }

    public void OnPress(View v){
        Button btn = (Button)v;
        String str = btn.getText().toString();

        // 미션 1: c이면 문자열을 지우고 나가기
//        if(str.equals()){
//
//        };


        // 미션 2: 숫자단위가 6단위이상 입력 못하게 하기
//        if(str.???){
//
//        };

        // 미션 3: 제곱미터를 평으로 계산하기

        String sDisplyNumber = (String)txtNumber.getText();
        txtNumber.setText(sDisplyNumber +  str);
    }

    // Message를 출력한다.
    private void ShowMessage(String str){
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
    }
}
