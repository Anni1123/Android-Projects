package com.anni.superbottombar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import me.ertugrul.lib.OnItemReselectedListener;
import me.ertugrul.lib.OnItemSelectedListener;
import me.ertugrul.lib.SuperBottomBar;

public class MainActivity extends AppCompatActivity {

    SuperBottomBar botttomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botttomBar=findViewById(R.id.bottomBar);
        botttomBar.setOnItemSelectListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelect(int i) {
                Toast.makeText(MainActivity.this,"Selected",Toast.LENGTH_LONG).show();
            }
        });
        botttomBar.setOnItemReselectListener(new OnItemReselectedListener() {
            @Override
            public void onItemReselect(int i) {
                Toast.makeText(MainActivity.this,"Reselected",Toast.LENGTH_LONG).show();
            }
        });
    }
}