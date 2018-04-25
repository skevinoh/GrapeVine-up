package com.example.davidnissenoff.grapevine;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by David Nissenoff on 4/10/2018.
 */

public class Posts extends AppCompatActivity {
    public String postThing;
    public EditText posts;
    private Context mContext;
    private TextView mTextView;
    private ListView mListView;
    private Button createPost;
    public String posting;
    ArrayList<String> postList;

    int pos = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
        posts = findViewById(R.id.postsEditText);



    }
    public void onClickSubmitPost(View view){
        postThing = posts.getText().toString();
        Intent intent = new Intent(Posts.this, HomePage.class);
        intent.putExtra("post", postThing);
        setResult(RESULT_OK, intent);
        startActivity(intent);


    }
}

