package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashSet;

public class NoteEditorActivity extends AppCompatActivity {

    int noteid;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);
        EditText editText=(EditText)findViewById(R.id.editText);
        save=(Button)findViewById(R.id.save);

        Intent intent=getIntent();
         noteid=intent.getIntExtra("noteId",-1);
        if(noteid!=-1){
            editText.setText(MainActivity.notes.get(noteid));
        }
        else {
            MainActivity.notes.add("");
            noteid=MainActivity.notes.size()-1;
            MainActivity.arrayAdapter.notifyDataSetChanged();
        }
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NoteEditorActivity.this,MainActivity.class));
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainActivity.notes.set(noteid,String.valueOf(s));
                MainActivity.arrayAdapter.notifyDataSetChanged();
                SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("com.example.notesapp", Context.MODE_PRIVATE);
                HashSet<String> set=new HashSet<>(MainActivity.notes);
                sharedPreferences.edit().putStringSet("notes",set).apply();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
