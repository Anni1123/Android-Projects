package com.example.notesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    ListView listView;
   static ArrayList<String> notes=new ArrayList<>();
   static ArrayAdapter arrayAdapter;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.add_note_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        if(item.getItemId()==R.id.add_note){
            Intent settingIntent=new Intent(MainActivity.this,NoteEditorActivity.class);
            startActivity(settingIntent);
            return true;
        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list);
        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("com.example.notesapp", Context.MODE_PRIVATE);
        HashSet<String> set=(HashSet<String>)sharedPreferences.getStringSet("notes",null);
        if(set==null){
            notes.add("Example Notes");
        }
        else{
            notes=new ArrayList(set);
        }
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,notes);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),NoteEditorActivity.class);
                intent.putExtra("noteId",position);
                startActivity(intent);
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                final int itemtodelete=position;
                new AlertDialog.Builder(MainActivity.this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Are You Sure").
                        setMessage("Do You Want To Delete This Note").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                     notes.remove(itemtodelete);
                     arrayAdapter.notifyDataSetChanged();
                        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("com.example.notesapp", Context.MODE_PRIVATE);
                        HashSet<String> set=new HashSet<>(MainActivity.notes);
                        sharedPreferences.edit().putStringSet("notes",set).apply();
                    }
                }).setNegativeButton("No",null).show();
                return true;
            }
        });
    }
}
