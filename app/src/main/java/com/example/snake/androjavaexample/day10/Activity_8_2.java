package com.example.snake.androjavaexample.day10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.snake.androjavaexample.R;

import java.util.ArrayList;

public class Activity_8_2 extends AppCompatActivity {

    ListView lstMain = null;
    ArrayList lst    =  new <String>ArrayList();

    ArrayAdapter adapter = null;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8_2);

        setListView();
        initItems();
    }

    private void initItems() {
        for(int i =0 ; i < 50; i++){
            addListItem(i + ":> 번째 입니다.");
        }
    }

    // ListView에 추가
    public void setListView(){
        lstMain = (ListView) findViewById(R.id.listView);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lst);
        lstMain.setAdapter(adapter);

        lstMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // click 했을 때 해당 항목을 삭제 해보자..
                removeItem(position); //<-- 메소드를 만들어 규현해보자.
                Toast.makeText(getApplicationContext(), (String)lst.get(position), Toast.LENGTH_LONG ).show();
            }

        });

        btnClear = (Button) findViewById(R.id.btnInit);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearList();
                initItems();
            }
        });
    }

    private void removeItem(int position) {
        lst.remove(position);
        adapter.notifyDataSetChanged();
    }


    private void clearList() {
        lst.clear();
    }

    // ListView에 add Item
    public void addListItem(String sMessage){
        lst.add(sMessage);

        // 이런 코드는 엄청난 과부하를 !!
        adapter.notifyDataSetChanged();
    }

    /*
    미션 1: 클릭 시, 아이템이 짝수일 경우만 지워지게 구현하기
    */

}
