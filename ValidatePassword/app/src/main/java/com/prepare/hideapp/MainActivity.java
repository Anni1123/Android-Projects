package com.prepare.hideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity
{
    EditText editText;
    TextView atoz,AtoZ,num,charcount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.addpasss);
        atoz=findViewById(R.id.atoz);
        AtoZ=findViewById(R.id.AtoZ);
        num=findViewById(R.id.num);
        charcount=findViewById(R.id.charcount);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String password=editText.getText().toString();
                validatepass(password);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    public void validatepass(String password){
        Pattern uppercase=Pattern.compile("[A-Z]");
        Pattern lowercase=Pattern.compile("[a-z]");
        Pattern digit=Pattern.compile("[0-9]");
        if(!lowercase.matcher(password).find()){
            atoz.setTextColor(Color.RED);
        }else{
            atoz.setTextColor(Color.GREEN);
        }
        if(!uppercase.matcher(password).find()){
            AtoZ.setTextColor(Color.RED);
        }else{
            AtoZ.setTextColor(Color.GREEN);
        }
        if(!digit.matcher(password).find()){
            num.setTextColor(Color.RED);
        }else{
            num.setTextColor(Color.GREEN);
        }
        if(password.length()<8){
            charcount.setTextColor(Color.RED);
        }else{
            charcount.setTextColor(Color.GREEN);
        }
    }


}