package com.anni.htmltext;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.sufficientlysecure.htmltextview.HtmlAssetsImageGetter;
import org.sufficientlysecure.htmltextview.HtmlFormatter;
import org.sufficientlysecure.htmltextview.HtmlFormatterBuilder;
import org.sufficientlysecure.htmltextview.OnClickATagListener;

public class MainActivity extends AppCompatActivity {
    TextView gtext;
    org.sufficientlysecure.htmltextview.HtmlTextView text1,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gtext=findViewById(R.id.text);
        text1= findViewById(R.id.text2);
        text2=findViewById(R.id.text3);
        Spanned spanned= HtmlFormatter.formatHtml(new HtmlFormatterBuilder()
                .setHtml("<p><big><bold>GeeksForGeeks</bold></big><p>"));
        gtext.setText(spanned);
        text2.setHtml("<font color='blue'><a href='https://www.google.com'</a>Go to this link</font>");
        text2.setOnClickATagListener(new OnClickATagListener() {
            @Override
            public boolean onClick(View widget, String spannedText, @Nullable String href) {
                Toast.makeText(getApplicationContext(),href,Toast.LENGTH_LONG).show();
                return false;
            }
        });
        text1.setHtml("Load Image From Asset<br><img src='image.png'/>",new HtmlAssetsImageGetter(text1));

    }
}
