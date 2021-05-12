package com.anni.blinktextanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView blinkt;
    Button blinkb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinkb=findViewById(R.id.blinkb);
        blinkt=findViewById(R.id.blinktext);
        blinkb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animator=ObjectAnimator.ofInt(blinkt,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);
                animator.setDuration(500);
                animator.setEvaluator(new ArgbEvaluator());
                animator.setRepeatCount(Animation.REVERSE);
                animator.setRepeatCount(Animation.INFINITE);
                animator.start();
            }
        });
    }
}