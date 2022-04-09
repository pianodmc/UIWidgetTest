package com.example.listview_test;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private List<Goods> mData=new ArrayList<>();

    //    private String[] data={"华为"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_list_view);

        listView=(ListView)findViewById(R.id.listView);
        //添加数据源
        addData();
        //创建适配器
        GoodsAdapter adapter = new GoodsAdapter(this,R.layout.goods_item, mData);
        //关联适配器
        listView.setAdapter(adapter);
    }

    private void addData(){

            Goods huawei=new Goods("华为 Mate7", R.drawable.huawei_pic1,"价格：2000.00");
            mData.add(huawei);



    }
}
