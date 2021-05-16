package com.example.instructionsdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        displaydialogbox();
    }

    private void displaydialogbox() {
        //initialise dialog
        final Dialog dialog=new Dialog(this);
        //set view
        dialog.setContentView(R.layout.dialogbox);
        //set layout
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        //set background
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(
                Color.TRANSPARENT
        ));
        //show dialog
        dialog.show();
        View view=dialog.findViewById(R.id.view1);
        final View view1=dialog.findViewById(R.id.view2);
        final View view2=dialog.findViewById(R.id.view3);
        final TextView textView=dialog.findViewById(R.id.textview);

        textView.setText("This is button");
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setVisibility(View.INVISIBLE);
                view1.setVisibility(View.VISIBLE);
                //set text
                textView.setText("This is Textview");
            }
        });
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setVisibility(View.INVISIBLE);
                view2.setVisibility(View.VISIBLE);
                //set text
                textView.setText("This is ImageView");
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }
}
