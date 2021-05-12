package com.anni.selecttext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView select;
    EditText selecte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        select=findViewById(R.id.select);
        selecte=findViewById(R.id.selecte);
        select.setTextIsSelectable(true);

        selecte.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                selecte.setCursorVisible(true);
                Toast.makeText(MainActivity.this,"Visible",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
}