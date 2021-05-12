package com.anni.copytext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView copyt;
    Button copyb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        copyb=findViewById(R.id.copyb);
        copyt=findViewById(R.id.copyt);
        final String story=copyt.getText().toString();
        copyb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager manager=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData data=ClipData.newPlainText("Text",story);
                manager.setPrimaryClip(data);
                Toast.makeText(MainActivity.this,"Copied to Clipboard",Toast.LENGTH_LONG).show();
            }
        });
    }
}