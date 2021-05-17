package com.example.tnimagelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import us.technerd.tnimageview.TNImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image);
        TNImageView tnImage = new TNImageView();
// pass your ImageView which you want to make rotatable and scaleable
        tnImage.makeRotatableScalable(imageView);

//you can also select if the touched view comes to front or not
        tnImage.bringToFrontOnTouch(true);
    }
}
