package com.satyamevias.geeksforgeeks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialising msgtext and loginbutton

        TextView msgtex=findViewById(R.id.msgtext);
        final Button loginbutton=findViewById(R.id.login);

        // creating a variable for our BiometricManager
        //and lets check if our user can use biometric sensor or not
        BiometricManager biometricManager= androidx.biometric.BiometricManager.from(this);
        switch (biometricManager.canAuthenticate()){
            //this means we can use biometric sensor
            case BiometricManager.BIOMETRIC_SUCCESS:
                msgtex.setText("You can use the fingerprint sensor to login");
                msgtex.setTextColor(Color.parseColor("#fafafa"));
                break;
             //this means that the device doesnt have fingerprint sensor
            case BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE:
                msgtex.setText("This device doesnot have a fingerprint sensor");
                loginbutton.setVisibility(View.GONE);
                break;

             //this means that biometric sensor is not available
            case BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE:
                msgtex.setText("The biometric sensor is currently unavailable");
                loginbutton.setVisibility(View.GONE);
                break;
            //this means that the device doesnt contain your fingerprint
            case BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED:
                msgtex.setText("Your device doesn't have fingerprint saved,please check your security settings");
                loginbutton.setVisibility(View.GONE);
                break;
        }
        // creating a variable for our Executor
        Executor executor= ContextCompat.getMainExecutor(this);
        //this will give us result of AUTHENTICATION
        final BiometricPrompt biometricPrompt=new BiometricPrompt(MainActivity.this, executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
            }
            //THIS METHOD IS CALLED WHEN AYTHENTICATION IS SUCCESS
            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
                loginbutton.setText("Login Successful");
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
            }
        });
        // creating a variable for our promptInfo
        //BIOMETRIC DIALOG
        final BiometricPrompt.PromptInfo promptInfo=new BiometricPrompt.PromptInfo.Builder().setTitle("GFG")
                .setDescription("Use your fingerprint to login ").setNegativeButtonText("Cancel").build();

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biometricPrompt.authenticate(promptInfo);

            }
        });
    }
}
