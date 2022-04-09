package com.example.listview_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class GoodsAdapter extends ArrayAdapter<Goods> {
    private int resourceId;
    private ImageView goodsImg;
    private TextView  goodsInfo;
    private TextView  goodsPrice;

    public GoodsAdapter(@NonNull Context context, @LayoutRes int textViewResourceId, @NonNull List<Goods> objects) {
        super(context, textViewResourceId, objects);
        resourceId=textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Goods goods=getItem(position); //获取当前项的Goods实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        goodsImg= (ImageView) view.findViewById(R.id.img_goods);
        goodsInfo= (TextView) view.findViewById(R.id.tv_goods);
        goodsPrice= (TextView) view.findViewById(R.id.tv_price);

        goodsImg.setImageResource(goods.getId());
        goodsInfo.setText(goods.getName());
        goodsPrice.setText(goods.getPrice());

        return view;

    }
}
