package com.example.nicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView mImage = findViewById(R.id.backgroundImage);
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        mImage.startAnimation(rotate);

        Glide.with(this)
                .load("https://images.pond5.com/animation-loading-circle-icon-white-footage-077162322_prevstill.jpeg")
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(mImage);

        openApp();
    }

    private void openApp() {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash
                        .this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 5000);
    }
}