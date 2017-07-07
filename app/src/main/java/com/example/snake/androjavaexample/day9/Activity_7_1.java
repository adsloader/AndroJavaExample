package com.example.snake.androjavaexample.day9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.snake.androjavaexample.R;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class Activity_7_1 extends AppCompatActivity {

    private Firebase myFirebaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7_1);

        initFireBase();
        makeFireBase();
    }

    private void makeFireBase() {
        myFirebaseRef.child("sharemessage").setValue("파이어베이스 메시지처리입니다..");
        myFirebaseRef.child("sharemessage").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                String sMessage  = (String)snapshot.getValue();
                Toast.makeText(getApplicationContext(), sMessage, Toast.LENGTH_LONG).show();
            }
            @Override public void onCancelled(FirebaseError error) { }
        });
    }

    private void initFireBase() {
        // Firebase가 이렇게 하라고 한다.
        Firebase.setAndroidContext(this);

        // 박모씨 아들의 파이어베이스 계정입니다.
        //myFirebaseRef = new Firebase("https://glowing-torch-2311.firebaseio.com/");
        myFirebaseRef = new Firebase("https://testandroid-d79e4.firebaseio.com/");
    }

     /*
    미션 1: 자신의 Firebase 주소로 변경하고 실행해볼 것.
    */
}
