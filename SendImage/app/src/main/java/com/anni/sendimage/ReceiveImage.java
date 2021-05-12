package com.anni.sendimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ReceiveImage extends AppCompatActivity {


    ImageView imageView;

    int imagevalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_image);
        imageView=findViewById(R.id.images);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            imagevalue=bundle.getInt("image");
            imageView.setImageResource(imagevalue);
        }

    }
}