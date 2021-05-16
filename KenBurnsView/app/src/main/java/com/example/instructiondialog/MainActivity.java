package com.example.instructiondialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Toast;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.RandomTransitionGenerator;
import com.flaviofaria.kenburnsview.Transition;

public class MainActivity extends AppCompatActivity {

    private boolean moving =true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final KenBurnsView kbv = (KenBurnsView) findViewById(R.id.gravity);
        AccelerateDecelerateInterpolator adi=new AccelerateDecelerateInterpolator();
        RandomTransitionGenerator randomTransitionGenerator=new RandomTransitionGenerator(1000,adi);
        kbv.setTransitionGenerator(randomTransitionGenerator);
        kbv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(moving){
                    kbv.pause();
                    moving=false;
                }else {
                    kbv.resume();
                    moving=true;
                }
            }
        });

        kbv.setTransitionListener(new KenBurnsView.TransitionListener() {
            @Override
            public void onTransitionStart(Transition transition) {
                Toast.makeText(MainActivity.this,"Started",Toast.LENGTH_LONG).show();
            }
            @Override
            public void onTransitionEnd(Transition transition) {
                Toast.makeText(MainActivity.this,"Finish",Toast.LENGTH_LONG).show();
            }
        });

    }
}
