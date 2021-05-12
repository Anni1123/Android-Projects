package com.anni.typinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView typingt;
    Button typingb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        typingb=findViewById(R.id.typingb);
        typingt=findViewById(R.id.typingt);
        typingb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.setText("H");
                    }
                },300);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("e");
                    }
                },400);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("l");
                    }
                },500);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("l");
                    }
                },600);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("o");
                    }
                },700);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("E");
                    }
                },800);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("v");
                    }
                },900);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("e");
                    }
                },1000);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("r");
                    }
                },1100);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("y");
                    }
                },1200);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("o");
                    }
                },1300);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("n");
                    }
                },1400);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("e");
                    }
                },1500);
            }
        });
    }
}