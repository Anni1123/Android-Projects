package com.example.emojirain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.luolc.emojirain.EmojiRainLayout;

public class MainActivity extends AppCompatActivity {

    Button start,stop;
    EmojiRainLayout mContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.starta);
        stop=findViewById(R.id.stopa);
        mContainer=findViewById(R.id.emojirain);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // add emoji sources
                mContainer.addEmoji(R.drawable.emoji_1_3);
                mContainer.addEmoji(R.drawable.emoji_2_3);
                mContainer.addEmoji(R.drawable.emoji_3_3);
                mContainer.addEmoji(R.drawable.emoji_4_3);
                mContainer.addEmoji(R.drawable.emoji_5_3);

                // set emojis per flow, default 6
                mContainer.setPer(10);

                // set total duration in milliseconds, default 8000
                mContainer.setDuration(7200);

                // set average drop duration in milliseconds, default 2400
                mContainer.setDropDuration(2400);

                // set drop frequency in milliseconds, default 500
                mContainer.setDropFrequency(500);
                mContainer.startDropping();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContainer.stopDropping();
            }
        });
    }
}
