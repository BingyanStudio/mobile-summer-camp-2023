package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    private List<Animal>mData = new ArrayList<>();

    private Context mContext;
    private AnimalrAdapter mAdapter =null;
    private ListView list_animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=MainActivity.this;
        list_animal=(ListView) findViewById(R.id.lv);
        mData.add(new Animal("小鹿","呦呦鹿鸣，食野之蒿",R.drawable.xl));
        mData.add(new Animal("小熊","熊咆龙吟殷岩泉,栗深林兮惊层巅。",R.drawable.xx2));
        mData.add(new Animal("好耶","春风得意马蹄疾，一日看尽长安花.",R.drawable.ye));
        mData.add(new Animal("小鸟","月出惊山鸟，时鸣春涧中。",R.drawable.nn));
        mData.add(new Animal("苹果","错认如花枝上艳，不知荚子缀猩红。",R.drawable.pg));
        mAdapter=new AnimalAdapter(mData,mContext);
        list_animal.setAdapter(mAdapter);

    }
}