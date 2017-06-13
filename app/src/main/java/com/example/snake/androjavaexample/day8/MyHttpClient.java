package com.example.snake.androjavaexample.day8;

import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class MyHttpClient extends AsyncTask<String, Integer, Integer> {

    Context ctx;
    StringBuilder result    = null;

    // 연결타임아웃과 HTTP를 읽어온 성공여부를 정의
    public static int CONNECTION_TIME_OUT = 1000 * 5;
    public static int REQUEST_OK   = 0;
    public static int REQUEST_FAIL = -1;

    public MyHttpClient(Context context) {
        ctx = context;
        result = new StringBuilder();
    }

    public String getString() {
        return result.toString();
    }

    @Override
    protected void onPreExecute() {
        // TODO Auto-generated method stub
        super.onPreExecute();
    }

    @Override
    protected Integer doInBackground(String... arg0) {
        // TODO Auto-generated method stub
        HttpURLConnection conn = null;

        // 통신은 무조건 try catch 문안에 코딩해주어야 한다.
        // Java에서 무조건 하라고 에러를 띄운다.
        try {

            // 주소를 지정한다.
            URL url = new URL(arg0[0]);
            // 주소로 연결한다.
            conn = (HttpURLConnection)url.openConnection();
            // 연결이 안되었으면 나가삼.
            if(conn == null) return -1;

            // 타임아웃(접속이 될 때까지 기다리는 시간)
            conn.setConnectTimeout(CONNECTION_TIME_OUT);

            // HTTP 통신방식
            conn.setRequestMethod(arg0[1]);		// GET or POST
            conn.setDoInput(true);
            conn.setDoOutput(true);

            // HTTP 결과코드(OK = 200)
            int resCode = conn.getResponseCode();

            // HTTP를 제대로 가져왔다면... HTTP_OK = 200
            if(resCode == HttpURLConnection.HTTP_OK) {

                // 읽어와서 result 값에 계속 추가한다.
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line = null;

                while(true) {

                    line = reader.readLine();

                    if(line == null) {
                        break;
                    }
                    result.append(line);
                    result.append("\n");
                }

                reader.close();
                conn.disconnect();

            } else {
                return REQUEST_FAIL;
            }



        } catch(Exception ex) {
            ex.printStackTrace();
            return REQUEST_FAIL;
        }
        return REQUEST_OK;
    }

    @Override
    protected void onPostExecute(Integer result) {
        // TODO Auto-generated method stub
        super.onPostExecute(result);
    }
}