package com.example.draggablepnel;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    Button red,blue,black;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.imageview);
        blue=findViewById(R.id.blue);
        black=findViewById(R.id.black);
        red=findViewById(R.id.red);

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setColorFilter(Color.BLUE);
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setColorFilter(Color.BLACK);
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setColorFilter(Color.RED);
            }
        });
    }
}
