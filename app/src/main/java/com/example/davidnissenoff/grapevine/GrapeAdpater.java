package com.example.davidnissenoff.grapevine;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by David Nissenoff on 4/10/2018.
 */

public class GrapeAdpater extends BaseAdapter{
    private Context mContext;
    private ListView mListview;
    private ArrayList<Posts> mPosts;
    private LayoutInflater mInflater;

    public GrapeAdpater(Context mContext, ArrayList<Posts> mPosts){
        this.mContext = mContext;
        this.mPosts = mPosts;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount(){
        return mPosts.size();
    }
    @Override
    public Object getItem(int position){
        return mPosts.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.activity_home_items, parent, false);
            holder = new ViewHolder();
            holder.homeItemTextView = convertView.findViewById(R.id.home_item_textview);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }
    private static class ViewHolder{
        public TextView homeItemTextView;
    }
}
