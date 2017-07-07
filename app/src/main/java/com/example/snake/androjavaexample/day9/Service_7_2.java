package com.example.snake.androjavaexample.day9;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class Service_7_2 extends Service {
    private Firebase myFirebaseRef;


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(intent != null){
            setUpFireBase();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    private void setUpFireBase() {
        initFireBase();
        makeFireBase();
    }

    private void makeFireBase() {
        myFirebaseRef.child("url").setValue("http://vintageappmaker.com");
        myFirebaseRef.child("url").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                String sMessage  = (String)snapshot.getValue();

                // 한글은되냐
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(sMessage));
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);

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
