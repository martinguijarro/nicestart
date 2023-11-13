package com.example.nicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView mImage = findViewById(R.id.backgroundImage);

        Glide.with(this)
                .load("https://t4.ftcdn.net/jpg/00/53/45/31/360_F_53453175_hVgYVz0WmvOXPd9CNzaUcwcibiGao3CL.jpg")
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .centerCrop()
                .circleCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
                .into(mImage);
    }
}