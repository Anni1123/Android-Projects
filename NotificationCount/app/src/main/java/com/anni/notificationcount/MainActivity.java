
package com.anni.notificationcount;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.arturogutierrez.Badges;
import com.github.arturogutierrez.BadgesNotSupportedException;
import com.nex3z.notificationbadge.NotificationBadge;

public class MainActivity extends AppCompatActivity {

    Button increase,zero;
    NotificationBadge notificationBadge;
    int countl=0;
    String c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increase=findViewById(R.id.Increase);
        notificationBadge=findViewById(R.id.badge);
        notificationBadge.setTextDirection(View.SCROLL_INDICATOR_TOP);
        if(countl>9){
            notificationBadge.setText("9+");
        }
        notificationBadge.setTextColor(Color.BLACK);
        zero=findViewById(R.id.zero);

    }

    @Override
    protected void onStart() {
        super.onStart();
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countl+=1;
                c=Integer.toString(countl);
                notificationBadge.setText(c);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationBadge.clear();
                countl=0;
//                notificationBadge.setText("0");
            }
        });
    }



}
