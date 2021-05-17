package com.example.sparklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import io.github.tonnyl.spark.Spark;

public class MainActivity extends AppCompatActivity {

    Spark spark;
    RelativeLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.relativel);
        spark=new Spark.Builder().setView(layout).setDuration(5000)
                .setAnimList(Spark.ANIM_BLUE_PURPLE).build();
    }

    @Override
    protected void onResume() {
        super.onResume();
        spark.startAnimation();
    }

    @Override
    protected void onPause() {
        super.onPause();
        spark.stopAnimation();
    }
}
