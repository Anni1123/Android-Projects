package com.anni.explosionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import tyrantgit.explosionfield.ExplosionField;

public class MainActivity extends AppCompatActivity {

    boolean explod=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView explode=findViewById(R.id.explode);
        final ExplosionField explosionField=ExplosionField.attach2Window(this);
        explode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(explod){
                    //as we click on the image it will explode
                    explosionField.explode(explode);
                    explod=false;
                }
            }
        });

    }
}