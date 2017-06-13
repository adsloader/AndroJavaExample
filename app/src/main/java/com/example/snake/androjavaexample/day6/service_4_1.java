package com.example.snake.androjavaexample.day6;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

public class service_4_1 extends Service {
    public service_4_1() {
    }

    int nCount = 0;
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO Auto-generated method stub
        if(intent != null){
            LogCountInfo();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

    // 3초간격으로 handleMessage()를 호출한다.
    Handler handler;
    private void  LogCountInfo(){
        handler = new Handler() {
            public void handleMessage(Message msg) {
                Log.d("ALLTEST", String.format("service count-->%d", nCount++));
                if(nCount == 10){
                    // 웹브라우저 호출 Intent
                    Intent i = new Intent(service_4_1.this, activity_4_1.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                }

                if(nCount < 100){
                    handler.sendEmptyMessageDelayed(0,3000);
                }

            }
        };
        handler.sendEmptyMessage(0);
    }
}
