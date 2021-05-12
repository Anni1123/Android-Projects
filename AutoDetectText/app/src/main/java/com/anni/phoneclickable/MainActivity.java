package com.anni.phoneclickable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mobile = (TextView) findViewById(R.id.mobile);
        TextView google = (TextView) findViewById(R.id.google);
        TextView email = (TextView) findViewById(R.id.email);
        email.setText("//add your email here");
        mobile.setText("//add your number here");
        google.setText("www.google.com");
        Linkify.addLinks(email, Linkify.ALL);
        Linkify.addLinks(mobile, Linkify.ALL);
        Linkify.addLinks(google, Linkify.ALL);
    }
}