package com.example.drawableview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class MainActivity extends AppCompatActivity {

    DrawableView drawableView;
    DrawableViewConfig config;
    Button increase,decrease,color,undo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiaselayout();
    }

    private void initiaselayout() {
        drawableView=findViewById(R.id.paintView);
        increase=findViewById(R.id.increase);
        decrease=findViewById(R.id.decrease);
        color=findViewById(R.id.color);
        undo=findViewById(R.id.undo);
        config=new DrawableViewConfig();
        config.setStrokeColor(getResources().getColor(android.R.color.black));
        config.setShowCanvasBounds(true); // If the view is bigger than canvas, with this the user will see the bounds (Recommended)
        config.setStrokeWidth(20.0f);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);
        drawableView.setConfig(config);
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                config.setStrokeWidth(config.getStrokeWidth()+10);
            }
        });
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                config.setStrokeWidth(config.getStrokeWidth()-10);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                config.setStrokeColor(Color.rgb(255,
                        random.nextInt(256),random.nextInt(256)));
            }
        });
        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawableView.undo();
            }
        });
    }


}
