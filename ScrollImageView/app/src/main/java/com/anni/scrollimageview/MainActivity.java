package com.prepare.makedirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.q42.android.scrollingimageview.ScrollingImageView;

public class MainActivity extends AppCompatActivity {

    boolean moving1 =true,moving2=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ScrollingImageView scrollingBackground = (ScrollingImageView) findViewById(R.id.scrolling_background);

        scrollingBackground.start();
        scrollingBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if already moving then stop
                if(moving1){
                    moving1=false;
                    scrollingBackground.stop();
                    //else start moving
                }else{
                    moving1=true;
                    scrollingBackground.start();
                }

            }
        });

    }
}
