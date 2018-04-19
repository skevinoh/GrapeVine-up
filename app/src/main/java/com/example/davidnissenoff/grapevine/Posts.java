package com.example.davidnissenoff.grapevine;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by David Nissenoff on 4/10/2018.
 */

public class Posts extends AppCompatActivity {
    private EditText posts;
    private Context mContext;
    private TextView mTextView;
    private Button createPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_posts);
        mContext = this;
        posts = findViewById(R.id.postsEditText);
        mTextView = findViewById(R.id.dummyTextView);
        createPost = findViewById(R.id.onClickSubmitPostBtn);
       /* createPost.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){



                mTextView.setText(posts.getText());

            }

        });


*/
    }
    public void onClickSubmitPost(View view){
        mTextView.setText(posts.getText());
        Intent intent = new Intent(getApplicationContext(), HomePage.class);
        startActivity(intent);


    }
    /*public static ArrayList<Posts> getPostsFromFile(String filename, Context context){

        ArrayList<Posts> postList = new ArrayList<Posts>();
     return postList;
   */ }

