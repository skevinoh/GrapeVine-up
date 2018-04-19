package com.example.davidnissenoff.grapevine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David Nissenoff on 4/10/2018.
 */

public class HomePage extends AppCompatActivity {
    private ListView mListView;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_listview);
        mContext = this;
        mListView = findViewById(R.id.posts_list_view);
    }

    public void onClickCreatePost(View view){
        Intent intent = new Intent(getApplicationContext(), Posts.class);
        startActivity(intent);
    }
}
