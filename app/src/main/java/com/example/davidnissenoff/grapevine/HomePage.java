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
    String AddedTask1;
    private GrapeAdpater mGrapeAdapter;
    ArrayList<SubmitPosts> submitPosts = new ArrayList<>();
    ArrayList<Posts> postList = new ArrayList<>();
    int pos = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_listview);
        ArrayList<String> strings = new ArrayList<>();
        mListView = findViewById(R.id.posts_list_view);
        Intent intent = getIntent();
        if(intent.hasExtra("post")){
            String addedPost = this.getIntent().getExtras().getString("post");
            strings.add(addedPost);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
            arrayAdapter.notifyDataSetChanged();
            mListView.setAdapter(arrayAdapter);


           /* mListView = findViewById(R.id.posts_list_view);
            String newPost = this.getIntent().getExtras().getString("post");

            ArrayList<String> newPosts = new ArrayList<>();
            newPosts.add(newPost);

            SubmitPosts submitPosts = new SubmitPosts();
            Posts mPosts = new Posts();

            postList.add(mPosts);
            mGrapeAdapter = new GrapeAdpater(getApplicationContext(), postList);
            mListView.setAdapter(mGrapeAdapter);
            mGrapeAdapter.notifyDataSetChanged();*/
        }

       /* final ArrayList<Posts> list = new ArrayList<>();
        mGrapeAdapter = new GrapeAdpater(this, list);
        mListView = findViewById(R.id.posts_list_view);
        mListView.setAdapter(mGrapeAdapter);*/

    }

    public void onClickCreatePost(View view){
        Intent intent = new Intent(getApplicationContext(), Posts.class);
        startActivity(intent);

    }
}
