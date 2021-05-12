package com.anni.photofilter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.mukesh.image_processing.ImageProcessor;

public class MainActivity extends AppCompatActivity {

    Bitmap bitmap;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.gravity);

        ImageProcessor imageProcessor = new ImageProcessor();
        bitmap= imageProcessor.doInvert(bitmap);
        imageView=findViewById(R.id.imagefilter);
        imageView.setImageBitmap(bitmap);


    }
}