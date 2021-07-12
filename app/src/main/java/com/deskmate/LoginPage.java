package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
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