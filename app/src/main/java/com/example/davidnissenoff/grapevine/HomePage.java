package com.example.davidnissenoff.grapevine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by David Nissenoff on 4/10/2018.
 */

public class HomePage extends AppCompatActivity {
    private TextView mTextView;
    private ListView mListView;
    private EditText editText;
    private Context mContext;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_listview);
        mListView = findViewById(R.id.posts_list_view);
        mTextView = findViewById(R.id.home_item_textview);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.activity_home_items, R.id.home_item_textview);
        mListView.setAdapter(arrayAdapter);
    }

    public void onClickCreatePost(View view){
        Intent intent = new Intent(getApplicationContext(), Posts.class);
        startActivity(intent);
    }
}
