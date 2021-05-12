package com.anni.waveloadingview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    me.itangqi.waveloadingview.WaveLoadingView loadingView;
    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar=findViewById(R.id.seekbar);
        loadingView=findViewById(R.id.waveLoadingView);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                loadingView.setProgressValue(progress);
                String title=String.valueOf(progress);
                loadingView.setBottomTitle("");
                loadingView.setCenterTitle("");
                loadingView.setTopTitle("");
                if(progress<50){
                    loadingView.setBottomTitle(title);
                }else if(progress==50){
                    loadingView.setCenterTitle(title);
                }else{
                    loadingView.setTopTitle(title);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}