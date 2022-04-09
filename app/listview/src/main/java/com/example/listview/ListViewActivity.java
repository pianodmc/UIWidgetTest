package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {

    private String[] data={"华为"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView=(ListView)findViewById(R.id.listView);
        //创建适配器
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        //关联适配器
        listView.setAdapter(adapter);
    }
}