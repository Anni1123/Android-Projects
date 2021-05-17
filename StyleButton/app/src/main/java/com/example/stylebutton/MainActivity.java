package com.example.stylebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button movie,download,pic,music,whatsapp;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        btn2.setTextAppearance(R.style.TextAppearance_Compat_Notification_Info);
        btn3.setTextAppearance(R.style.TextAppearance_Compat_Notification_Time);
        btn4.setTextAppearance(R.style.TextAppearance_AppCompat_Widget_Button_Inverse);
//        movie=findViewById(R.id.movies);
//        download=findViewById(R.id.download);
//        whatsapp=findViewById(R.id.whtsapp);
//        pic=findViewById(R.id.pic);
//        music=findViewById(R.id.music);
//        movie.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String path= Environment.getExternalStorageDirectory() + "/" + "Movies" + "/" ;
//                Uri uri=Uri.parse(path);
//                Intent intent=new Intent(Intent.ACTION_PICK);
//                intent.setDataAndType(uri,"*/*");
//                startActivity(intent);
//            }
//        });
//        whatsapp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String path= Environment.getExternalStorageDirectory() + "/" + "WhatsApp" + "/" ;
//                Uri uri=Uri.parse(path);
//                Intent intent=new Intent(Intent.ACTION_PICK);
//                intent.setDataAndType(uri,"*/*");
//                startActivity(intent);
//            }
//        });
//        download.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String path= Environment.getExternalStorageDirectory() + "/" + "Downloads" + "/" ;
//                Uri uri=Uri.parse(path);
//                Intent intent=new Intent(Intent.ACTION_PICK);
//                intent.setDataAndType(uri,"*/*");
//                startActivity(intent);
//            }
//        });
//        music.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String path= Environment.getExternalStorageDirectory() + "/" + "Music" + "/" ;
//                Uri uri=Uri.parse(path);
//                Intent intent=new Intent(Intent.ACTION_PICK);
//                intent.setDataAndType(uri,"*/*");
//                startActivity(intent);
//            }
//        });
//        pic.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String path= Environment.getExternalStorageDirectory() + "/" + "Pictures" + "/" ;
//                Uri uri=Uri.parse(path);
//                Intent intent=new Intent(Intent.ACTION_PICK);
//                intent.setDataAndType(uri,"*/*");
//                startActivity(intent);
//            }
//        });
    }
}
