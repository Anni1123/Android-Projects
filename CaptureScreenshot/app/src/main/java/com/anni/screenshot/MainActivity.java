package com.anni.screenshot;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button click;
    private static final int REQUEST_EXTERNAL_STORAGe=1;
    private static String[] permissionstorage={Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = findViewById(R.id.clickme);
        verifystoragepermissions(this);
        //adding beep sound
        final MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.beep);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You just Captured a Screenshot," +
                        " Open Gallery/ File Storage to view your captured Screenshot",Toast.LENGTH_SHORT).show();
                screenshot(getWindow().getDecorView().getRootView(),"result");

                mediaPlayer.start();
            }
        });
    }
    protected static File screenshot(View view,String filename) {
        Date date = new Date();
        //Here we are initialising the format of our image name
        CharSequence format = android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", date);
        try {
            //Initialising the directory of storage
            String dirpath = Environment.getExternalStorageDirectory()+"";
            File file = new File(dirpath);
            if(!file.exists()){
                boolean mkdir=file.mkdir();
            }
            //File name
            String path=dirpath + "/" +  filename + "-" + format + ".jpeg";
            view.setDrawingCacheEnabled(true);
            Bitmap bitmap=Bitmap.createBitmap(view.getDrawingCache());
            view.setDrawingCacheEnabled(false);
            File imageurl=new File(path);
            FileOutputStream outputStream=new FileOutputStream(imageurl);
            bitmap.compress(Bitmap.CompressFormat.JPEG,50,outputStream);
            outputStream.flush();
            outputStream.close();
            return imageurl;

        }catch (FileNotFoundException io){
            io.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    //verifying if storage permission is given or not
    public static void verifystoragepermissions(Activity activity){
        int permissions= ActivityCompat.checkSelfPermission(activity,Manifest.permission.WRITE_EXTERNAL_STORAGE);
        //If storage permission is not given then request for External Storage Permission
        if(permissions!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(activity,permissionstorage,REQUEST_EXTERNAL_STORAGe);
        }
    }
}
