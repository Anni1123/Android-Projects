package com.anni.coloshadow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yinglan.shadowimageview.ShadowImageView;

public class MainActivity extends AppCompatActivity {

    ShadowImageView shadow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shadow=findViewById(R.id.shadow);
        shadow.setImageResource(R.mipmap.ic_launcher);
    }
}