
package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterPage extends AppCompatActivity {
    EditText uName, uEmail, uSchool, uPassword;
    FirebaseAuth fAuth;
    ProgressBar progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage);

        uName = (EditText) findViewById(R.id.username);
        uEmail = (EditText) findViewById(R.id.emailID);
        uSchool = (EditText) findViewById(R.id.schoolName);
        uPassword = (EditText) findViewById(R.id.password);

        fAuth = FirebaseAuth.getInstance();
    }
    public void homeBtnReg(View view) {
        Intent intent = new Intent(RegisterPage.this, HomePage.class);
        startActivity(intent);
    }
}