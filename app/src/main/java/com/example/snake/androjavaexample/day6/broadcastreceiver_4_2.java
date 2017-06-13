package com.example.snake.androjavaexample.day6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class broadcastreceiver_4_2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        /*
        * https://github.com/adsloader/SimpleBroadCastTest/blob/master/app/src/main/AndroidManifest.xml
        * 의 인텐트필터를 참고.
        * */
        Toast.makeText(context, "Unlock~~~", Toast.LENGTH_LONG).show();
    }
}
