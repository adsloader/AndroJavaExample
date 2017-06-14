package com.example.snake.androjavaexample.day10;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.example.snake.androjavaexample.R;
import java.util.ArrayList;

public class    Activity_8_3 extends AppCompatActivity {

    // 리스트view
    ListView listview = null;

    // 리스트와 데이터를 연동하는 adapter 클래스
    myListAdapter adapter  = null;

    // 리스트에 연동될 데이터 배열
    ArrayList<listData> arr = new ArrayList<listData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8_3);

        setUpUI();
    }


    // 화면을 만든다.
    private void setUpUI() {

        listview = (ListView) findViewById(R.id.listView);

        // list에 보여줄 배열을 만든다.
        arr.add( makeItems("#333333", "첫번째") );
        arr.add( makeItems("#FF0000", "두번째") );
        arr.add( makeItems("#FF00FF", "세번째"));

        // 귀찮아서 아무거나..
        for(int i = 0; i < 10;i++){
            arr.add( makeItems("#0000FF", Integer.toString(i)) );
        }

        adapter = new myListAdapter();
        listview.setAdapter(adapter);
    }

    // item 정보를 만든다.
    private listData makeItems(String color, String title){
        listData v = new listData();
        v.sTitle = title;
        v.sChangeColor = color;
        return v;
    }

    // ListItem에 필요한 정보를 다루는 inner Class
    class listData {
        String sTitle;       // textView에 들어갈 내용
        String sChangeColor; // 변화시킬 글자색
    }

    class ViewHolder{
        Button btn;
        TextView txt;
    }

    // listview처리를 위한 inner class
    class myListAdapter extends BaseAdapter {

        // List의 개수를 알려준다.
        @Override
        public int getCount() {
            return arr.size();
        }

        // 해당 인덱스의 값을 전달해준다.
        @Override
        public Object getItem(int position) {
            return arr.get(position);
        }

        // 가장 중요!!!!!!!!!!!!!
        // 리스트 항목에 위젯을 설정한다.
        // 쉬운 설명을 위해 widget을 tag에 저장하는 기법은 사용하지 않았다.!!!
        // 그러므로 스크롤 할 경우, 데이터가 이상하게 보일 것이다.
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.list_item, null);

                // 이곳에서 위젯들을 읽어와서 convertView의 setTag()로 저장
                // 화면에 사용되는 위젯들을 저장할 클래스를 선언하고 사용해야 함!!
                /*
                *  class ViewHolder{
                *      Button btn;
                *      TextView txt;
                *  }
                * */

            } else{

                // 이곳에서 getTag()로 읽어와서 위젯들을 액세스
            }

            final listData mData = arr.get(position);

            // convertView.findViewById()를 사용함!!
            final Button btn =(Button) convertView.findViewById(R.id.button);
            final TextView txtView = (TextView) convertView.findViewById(R.id.textView);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtView.setTextColor(Color.parseColor(mData.sChangeColor));
                    txtView.setText(mData.sTitle);
                }
            });

            return convertView;
        }


        // 잘모르겠다.
        @Override
        public long getItemId(int position) {
            return position;
        }
    }
}
