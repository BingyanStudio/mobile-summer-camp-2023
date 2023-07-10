package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnimalAdapter extends BaseAdapter {
    private List<Animal> mData;
    private Context mContext;
    public AnimalAdapter(List<Animal> mData, Context mContext){
        this.mData=mData;
        this.mContext=mContext;
    }
    @Override
    public int getCount(){
        return mData.size();
    }
    @Override
    public Object getItem(int position) {
        if (position >= 0 && position < mData.size()) {
            return mData.get(position);
        } else {
            return null;
        }
    }
    @Override
    public long getItemId(int position)
    {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        ImageView img_icon = (ImageView) convertView.findViewById(R.id.animal_image);
        TextView txt_aName = (TextView) convertView.findViewById(R.id.animal_aname);
        TextView txt_aSpeak = (TextView) convertView.findViewById(R.id.animal_aspeak);
        img_icon.setBackgroundResource(mData.get(position).getaIcon());
        txt_aName.setText(mData.get(position).getaName());
        txt_aSpeak.setText(mData.get(position).getaSpeak());
        return convertView;
    }
}
