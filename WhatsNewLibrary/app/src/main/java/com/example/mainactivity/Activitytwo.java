package com.example.mainactivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        Bundle firstData = getIntent().getExtras();
        if(firstData==null){
            return;
        }
        String firstmessgae=firstData.getString("firstmessgae");
        final TextView SecondText =(TextView)findViewById(R.id.SecondText);
        SecondText.setText(firstmessgae);
    }

}
