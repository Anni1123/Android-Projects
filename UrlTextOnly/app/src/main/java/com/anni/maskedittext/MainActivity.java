package com.anni.maskedittext;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText addurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addurl = findViewById(R.id.aurl);

        // when we add text in the edit text
        // it will check for the pattern of text
        addurl.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            // whenever text size changes it will check
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // if text written matches the pattern then
                // it will show a toast of pattern matches
                if (Patterns.WEB_URL.matcher(addurl.getText().toString()).matches()) {
                    Toast.makeText(MainActivity.this, "Pattern Matches", Toast.LENGTH_SHORT).show();
                } else {
                    // otherwise show error of invalid url
                    addurl.setError("Invalid Url");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}