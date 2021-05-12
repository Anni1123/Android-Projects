package com.anni.selectimage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class MainActivity extends AppCompatActivity {

    TextView select;
    Button selectimage;
    private static final int IMAGEPICK_GALLERY_REQUEST = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        select=findViewById(R.id.selectit);
        selectimage=findViewById(R.id.selecti);
        selectimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galleryIntent = new Intent(Intent.ACTION_PICK);
                galleryIntent.setType("image/*");
                startActivityForResult(galleryIntent, IMAGEPICK_GALLERY_REQUEST);
            }
        });
    }
    Uri imageuri;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==IMAGEPICK_GALLERY_REQUEST){
            imageuri=data.getData();   Uri uri = data.getData();
            ContentResolver cr = this.getContentResolver();
            String mime = cr.getType(uri);
            File file = new File(mime);
            long length = file.length() / 1024;
            Toast.makeText(MainActivity.this,""+humanReadableByteCountSI(length),Toast.LENGTH_LONG).show();
        }

    }
    public static String humanReadableByteCountSI(long bytes) {
        if (-1000 < bytes && bytes < 1000) {
            return bytes + " B";
        }
        CharacterIterator ci = new StringCharacterIterator("kMGTPE");
        while (bytes <= -999_950 || bytes >= 999_950) {
            bytes /= 1000;
            ci.next();
        }
        return String.format("%.1f %cB", bytes / 1000.0, ci.current());
    }

}