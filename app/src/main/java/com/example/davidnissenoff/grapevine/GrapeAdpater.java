package com.example.davidnissenoff.grapevine;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
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
            holder.foodTextView = convertView.findViewById(R.id.eat_textview);
            holder.PriceTextView = convertView.findViewById(R.id.price_textView);
            holder.foodImageView = convertView.findViewById(R.id.food_image_view);
            holder.postsEditText = convertView.findViewById(R.id.postsEditText);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        SubmitPosts post = (SubmitPosts) getItem(position);
        TextView homeItemTextView = holder.homeItemTextView;
        EditText postsEditText = holder.postsEditText;

        //homeItemTextView.setText(post.postThing);
        return convertView;
    }

    private static class ViewHolder{
        public TextView homeItemTextView;
        public TextView foodTextView;
        public TextView PriceTextView;
        public ImageView foodImageView;
        public EditText postsEditText;
    }
}
