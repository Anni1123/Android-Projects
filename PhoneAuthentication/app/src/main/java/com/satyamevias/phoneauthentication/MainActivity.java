package com.satyamevias.phoneauthentication;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private Button SendVerificationCodeButton, VerifyButton;
    private EditText InputPhoneNumber, InputVerificationCode;

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks;
    private FirebaseAuth mAuth;

    private ProgressDialog loadingBar;

    private String mVerificationId;
    private PhoneAuthProvider.ForceResendingToken mResendToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAuth = FirebaseAuth.getInstance();
        initFields();
        // Now lets start the verification process as When the user clicks the send
        // Verification Code button
        // we need to get the entered phone number and pass it to
        // PhoneAuthProvider.verifyPhoneNumber and will request Firebase to verify it.

        SendVerificationCodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = InputPhoneNumber.getText().toString();

                if (TextUtils.isEmpty(phoneNumber)) {
                    Toast.makeText(MainActivity.this, "Please enter your phone number first...", Toast.LENGTH_SHORT).show();
                } else {
                    loadingBar.setTitle("Phone Verification");
                    loadingBar.setMessage("Please wait, while we are authenticating your phone...");
                    loadingBar.setCanceledOnTouchOutside(false);
                    loadingBar.show();
                    PhoneAuthProvider.getInstance().verifyPhoneNumber(
                            InputPhoneNumber.getText().toString(),        // Phone number to verify
                            60,                 // Timeout duration
                            TimeUnit.SECONDS,   // Unit of timeout
                            MainActivity.this,               // Activity (for callback binding)
                            callbacks);
                                    // OnVerificationStateChangedCallbacks
                }
            }
        });

        //When User has got the otp he can enter the otp in the edit text and click
        // on Verify Button.
        VerifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SendVerificationCodeButton.setVisibility(View.INVISIBLE);
                InputPhoneNumber.setVisibility(View.INVISIBLE);
                String verificationCode = InputVerificationCode.getText().toString();

                if (TextUtils.isEmpty(verificationCode)) {
                    Toast.makeText(MainActivity.this, "Please write verification code first...", Toast.LENGTH_SHORT).show();
                } else {
                    loadingBar.setTitle("Verification Code");
                    loadingBar.setMessage("please wait, while we are verifying verification code...");
                    loadingBar.setCanceledOnTouchOutside(false);
                    loadingBar.show();
                    PhoneAuthCredential credential = PhoneAuthProvider.getCredential(mVerificationId, verificationCode);
                    signInWithPhoneAuthCredential(credential);
                }
            }
        });


        //Add the callback method of Firebase to get updates about the state of the verification process
        callbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            // 1. onVerificationCompleted — this method is called when verification is done
//            without user interactions; for example - user is verified without code or when
//            SMS is intercepted by Google play services and verified on its own.

            @Override
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
                signInWithPhoneAuthCredential(phoneAuthCredential);
            }

            //2. onVerificationFailed — this method is called on failure
            //instances such as when sending SMS fails or number format is not valid.

            @Override
            public void onVerificationFailed(FirebaseException e) {
                loadingBar.dismiss();
                Toast.makeText(MainActivity.this, "Verification Failed.", Toast.LENGTH_SHORT).show();
                SendVerificationCodeButton.setVisibility(View.VISIBLE);
                InputPhoneNumber.setVisibility(View.VISIBLE);
                VerifyButton.setVisibility(View.INVISIBLE);
                InputVerificationCode.setVisibility(View.INVISIBLE);
            }

            //3. onCodeSent — this method is called when SMS is successfully sent to the number.
            public void onCodeSent(String verificationId,
                                   PhoneAuthProvider.ForceResendingToken token) {
                // Save verification ID and resending token so we can use them later
                mVerificationId = verificationId;
                mResendToken = token;

                loadingBar.dismiss();
                Toast.makeText(MainActivity.this, "Code has been sent, please check and verify...", Toast.LENGTH_SHORT).show();

                SendVerificationCodeButton.setVisibility(View.INVISIBLE);
                InputPhoneNumber.setVisibility(View.INVISIBLE);

                VerifyButton.setVisibility(View.VISIBLE);
                InputVerificationCode.setVisibility(View.VISIBLE);
            }
        };
    }

    //Initialising the variable we have used
    private void initFields() {
        SendVerificationCodeButton = (Button) findViewById(R.id.send_ver_code_button);
        VerifyButton = (Button) findViewById(R.id.verify_button);
        InputPhoneNumber = (EditText) findViewById(R.id.phone_nnumber_input);
        InputVerificationCode = (EditText) findViewById(R.id.verification_code_input);
        loadingBar = new ProgressDialog(this);
    }

    String currentUserID;
    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            startActivity(new Intent(MainActivity.this,HomeActicity.class));
                        } else {
                            String message = task.getException().toString();
                            Toast.makeText(MainActivity.this, "Error : " + message, Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}