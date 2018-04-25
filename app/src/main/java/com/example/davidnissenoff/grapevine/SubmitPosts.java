package com.example.davidnissenoff.grapevine;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SubmitPosts extends AppCompatActivity {

  public String post;
  public String whatEat;
  public String price;
  public Image foodImage;

  public SubmitPosts(String post, String whatEat, String price, Image foodImage){
      this.post = post;
      this.whatEat = whatEat;
      this.price = price;
      this.foodImage = foodImage;
  }


}
