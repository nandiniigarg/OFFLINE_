package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class LoginPage extends AppCompatActivity {
    EditText uName, uEmail, uSchool, uPassword, uOccupation;
    private FirebaseAuth auth;
    ProgressBar progress;
    FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        uName = (EditText) findViewById(R.id.username);
        uEmail = (EditText) findViewById(R.id.emailID);
        uSchool = (EditText) findViewById(R.id.schoolName);
        uPassword = (EditText) findViewById(R.id.password);
        uOccupation = (EditText) findViewById(R.id.occupation);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();


//        auth.signInWithEmailAndPassword(uEmail, uPassword).addOnCompleteListener(new onCompleteListener<AuthResult> {
//            @Override
//                    public void onComplete (@NonNull Task<AuthResult> task) {
//
//                    }
//        });
    }


    public void SignUp_Btn(View view) {
        Intent intent = new Intent(LoginPage.this, RegisterPage.class);
        startActivity(intent);
    }
    public void Home_btn(View view){
        Intent intent = new Intent(LoginPage.this, HomePage.class);
        startActivity(intent);
    }


}