package com.example.snake.androjavaexample.day5.self;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import com.example.snake.androjavaexample.R;

public class Activity_about_2 extends Activity {

    private TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView 실행 전에 코딩되어야 한다. 그리고 Activity만 된다.
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_about_2);

        // 화면을 설정한다.
        setUpUI();
    }

    // 화면을 설정한다.
    private void setUpUI() {
        myText = (TextView) findViewById(R.id.textView2);

        // 애니메이션을 만든다. Android에서 제공하는 클래스
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1500);
        anim.setStartOffset(20);

        // 애니메이션 모드설정
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);

        // 애니메이션을 textview에 붙인다.
        myText.startAnimation(anim);
    }
}
