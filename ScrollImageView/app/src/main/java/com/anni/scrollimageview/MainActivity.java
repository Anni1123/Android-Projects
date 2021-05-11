package com.anni.scrollimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.q42.android.scrollingimageview.ScrollingImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        ScrollingImageView scrollingBackground = (ScrollingImageView) findViewById(R.id.scrolling_background);
        ScrollingImageView scrollingBackground1 = (ScrollingImageView) findViewById(R.id.scrolling_background1);
        scrollingBackground.start();
        scrollingBackground1.start();
    }
}
