package com.example.snake.androjavaexample.day8;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.snake.androjavaexample.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Activity_6_2 extends AppCompatActivity {

    private Button btnOk;
    private TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6_2);

        setUpUI();
    }

    // 버튼을 가져오고 onClick 이벤트핸들러를 지정하는 메소드
    private void setUpUI() {
        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Android에서는 절대로 서버와 통신을 "바로 사용할 수 없다"
                // 즉, Activiy와는 다른 메모리 영역인 (Thread)기반의 클래스를
                // 이용하여 통신을 해야 한다. - 주로 AsyncTask 클래스를 활용한다.
                // 즉, 비동기(코드가 완료될때까지 기다리지 않고 다음라인으로 이동)
                // 방식으로 코딩해야 한다. 그러나 아래의 코드는 비동기와 동기를 섞은
                // 방식이다. 화면에 문자열을 처리하기위해 사용했다.
                // 이렇듯 통신 프로그램은 분석하기 조금 난해하다.
                try{

                    // get()메소드를 사용해서 onPostExecute가 실행될 때까지 멈추어있는다.
                    //new getTask().execute().get();

                    // 위를 주석처리 해결책
                    getTask tsk = new getTask();
                    tsk.execute().get();

                    txtMessage.setText(tsk.GET_HTML_RESPONSE);

                } catch (Exception e){

                }
            }
        });

        txtMessage = (TextView)findViewById(R.id.txtMessage);

    }

    // www.daum.net 홈페이지 소스를 가져와 a tag의 정보를 보여주는 메소드
    private String getHomepageInfo() throws Exception {

        // Jsop을 이용해 URL의 HTML 소스를 가져온다.
        Document document = Jsoup.connect("http://www.daum.net").get();

        // 표시할 문자열을 저장할 String
        String str = "";

        if (null != document) {
            // href tag를 가진 a tag를 가져온다.
            Elements elements = document.select("a[href]");

            // 존재하는 갯수만큼 ....
            for (int i = 0; i < elements.size(); i++) {
                // 링크로 보여지는 문자열
                str += "link: " + elements.get(i).text() + "\n";
                // 링크정보
                str +=  "주소: " + elements.get(i).attr("href")+ "\n";
                str +=  "------------------------------------------" + "\n";;

                System.out.println(str);

            }
            System.out.println(str);

            // 동기화 버그.
            //txtMessage.setText(str);
        }

        return str;
    }


    // 서버통신을 한다면 AsyncTask 클래스를 주로 이용한다.
    // AsyncTask는 외부에서 execute() 메소드가 호출되는 순간
    // onPreExecute -> doInBackground -> onPostExecute 순서로 실행된다.
    class getTask extends AsyncTask {
        public String GET_HTML_RESPONSE = "";

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Object doInBackground(Object[] objects) {
            // bug!!!!!!(think about ui thread..)
            try {
                // 동기화 버그가 있음.
                //getHomepageInfo();

                // 위를 주석처리 해결책
                GET_HTML_RESPONSE = getHomepageInfo();


            } catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
        }
    }

    /*
    미션 1: img[src]로 리스트를 가져와보기
    */
}
