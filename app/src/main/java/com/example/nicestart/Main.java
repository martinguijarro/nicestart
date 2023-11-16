package com.example.nicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mWIP = findViewById(R.id.wip);

        Glide.with(this)
                .load(R.mipmap.ic_wip_foreground)
                .into(mWIP);
    }
}