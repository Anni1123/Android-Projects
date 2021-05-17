package com.example.liquidbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gospelware.liquidbutton.LiquidButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LiquidButton liquidButton=findViewById(R.id.button);
        liquidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LiquidButton btn = (LiquidButton) view;
                btn.startPour();
                btn.setFillAfter(true);
                btn.setAutoPlay(true);
            }
        });
        liquidButton.setPourFinishListener(new LiquidButton.PourFinishListener() {
            @Override
            public void onPourFinish() {
                Toast.makeText(MainActivity.this, "Finish", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onProgressUpdate(float progress) {
                liquidButton.changeProgress(progress);
            }
        });
    }
}
