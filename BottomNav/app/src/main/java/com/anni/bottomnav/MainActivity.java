package com.anni.bottomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {



    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chipNavigationBar = findViewById(R.id.bottom_nav_bar);
    }

}
