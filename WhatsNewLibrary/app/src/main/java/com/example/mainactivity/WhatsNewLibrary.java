package com.example.mainactivity;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.tonnyl.whatsnew.WhatsNew;
import io.github.tonnyl.whatsnew.item.WhatsNewItem;
import io.github.tonnyl.whatsnew.util.PresentationOption;

public class WhatsNewLibrary extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_new_library);
        //initialsing layout
        button=findViewById(R.id.whatsnew);
        //click on button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating a new Instance for showing Content using WhatsNew
                WhatsNew whatsNew=WhatsNew.newInstance(
                        //add as much item you want with item title,description and image
                        new WhatsNewItem("Firebase Authentication", "Firebase Authentication service provides easy to use UI libraries and SDKs to authenticate users to your app.", R.drawable.circle),
                        new WhatsNewItem("Firebase Realtime Database", "The Firebase Realtime Database is a cloud based NoSQL database ", R.drawable.circle),
                        new WhatsNewItem("Cloud Firestore", " The cloud Firestore is a NoSQL document database that provides services like store, sync, and query through the application on a global scale", R.drawable.circle),
                        new WhatsNewItem("Firebase", " irebase is a product of Google which helps developers to build, manage, and grow their apps easily. It helps developers to build their apps faster and in a more secure way.", WhatsNewItem.NO_IMAGE_RES_ID)
                );
                whatsNew.setPresentationOption(PresentationOption.DEBUG);
                //on click present this layout
                whatsNew.presentAutomatically(WhatsNewLibrary.this);
            }
        });

    }
}

