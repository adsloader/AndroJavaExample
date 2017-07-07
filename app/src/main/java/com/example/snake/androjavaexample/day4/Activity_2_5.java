package com.example.snake.androjavaexample.day4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.snake.androjavaexample.R;

public class Activity_2_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_5);
    }


    @Override
    protected void onStart() {
        super.onStart();

        Intent i = getIntent();
        if ((i != null) && (i.hasExtra("result"))){
            String sMessage = i.getStringExtra("result");
            ShowCustomToast(getApplicationContext(), Integer.valueOf(sMessage));
        } else {
            ShowCustomToast(getApplicationContext(),  0);
        }

        finish();
    }

    // 이미지와 함께 보여주는 커스텀 Toast
    private void ShowCustomToast(Context ctx, int nIndex){


        // 2차 고도화 떄는 asset에서 파일을 읽어 parsing하는 것을 보도록 한다.
        String sMessage [] ={
                "1. 메시지",
                "2. 메시지",
                "3. 메시지",
                "4. 메시지",
                "5. 메시지",
                "6. 메시지",
                "7. 메시지"
        };

        if(nIndex >= sMessage.length){
            return;
        }

        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService("layout_inflater");
        View layout = layoutInflater.inflate(R.layout.toast_layout, null);

        TextView textMessage  = (TextView)layout.findViewById(R.id.txtMessage);
        textMessage.setText(sMessage[nIndex]);

        Toast toast = new Toast(ctx);
        toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.TOP, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
    /*
    미션 1: 보여지는 위치를 중앙으로 변경
    미션 2: Toast에 사용하는 toast_layout.xml의 최하단에
             a. TextView를 하나 추가(id:txtMessage2).
             b. Toast가 뜰때마다 nIndex 값을 보여준다.
             Hint: java의 Integer.toString()으로 숫자값을 문자로 변경.
    */
}
