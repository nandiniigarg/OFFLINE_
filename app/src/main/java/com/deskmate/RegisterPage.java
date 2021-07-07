
package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.deskmate.models.Users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

public class RegisterPage extends AppCompatActivity {
    EditText uName, uEmail, uSchool, uPassword, uOccupation;
    private FirebaseAuth auth;
    ProgressBar progress;
    FirebaseDatabase database;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage);

        uName = (EditText) findViewById(R.id.username);
        uEmail = (EditText) findViewById(R.id.emailID);
        uSchool = (EditText) findViewById(R.id.schoolName);
        uPassword = (EditText) findViewById(R.id.password);
        uOccupation = (EditText) findViewById(R.id.occupation);
        getSupportActionBar().hide();
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();


    }
    public void homeBtnReg(View view) {
        Intent intent = new Intent(RegisterPage.this, HomePage.class);
        startActivity(intent);
    }

    public void SignUp_btn(View view){

        auth.createUserWithEmailAndPassword(uEmail.getText().toString(),
                uPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Users user = new Users(uName.getText().toString(), uEmail.getText().toString(), uPassword.getText().toString(),
                            uOccupation.getText().toString(), uSchool.getText().toString())
                    Toast.makeText(RegisterPage.this, "User created successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterPage.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}