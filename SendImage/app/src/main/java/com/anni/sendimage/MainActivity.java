package com.anni.sendimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sendimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendimage=findViewById(R.id.sendimagei);
        sendimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendimage=new Intent(MainActivity.this,ReceiveImage.class);
                sendimage.putExtra("image",R.mipmap.ic_launcher);
                startActivity(sendimage);
            }
        });
    }
}