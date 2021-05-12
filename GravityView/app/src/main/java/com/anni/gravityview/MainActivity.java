package com.anni.gravityview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import co.gofynd.gravityview.GravityView;

public class MainActivity extends AppCompatActivity {

    GravityView gravityView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        gravityView=GravityView.getInstance(this);
        if(!gravityView.deviceSupported()){
            // show the error / imageView
            Toast.makeText(MainActivity.this,"Not Supported",Toast.LENGTH_LONG).show();
        }
        else
        {
            gravityView.setImage(imageView,R.drawable.gravity).center();
        }
    }
    @Override
    protected void onStop(){
        super.onStop();
        gravityView.unRegisterListener();
    }
    @Override

    protected void onResume(){
        super.onResume();
        gravityView.registerListener();
    }
}
