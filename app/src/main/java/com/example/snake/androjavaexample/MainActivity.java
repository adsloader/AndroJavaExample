package com.example.snake.androjavaexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


// 이 앱을 핸드폰에 실행하는 목적은
// 오로지 화면디자인 적용을 보기 위해서이다.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. res/layout 폴더에 우클릭 후, 레이아웃을 추가한다.
        // 2. 레이아웃 파일을 디자인 후에, setContentView의 파라메터로 넘긴다.
        // 3. 번개표시 버튼: instant run을 활용하여 디자인이 핸드폰에 적용된 것을 본다.
        setContentView(R.layout.activity_main);

        testFunc();


    }

    private void testFunc() {
        Toast.makeText(getApplicationContext(), "!!!", Toast.LENGTH_SHORT).show();
    }
}
