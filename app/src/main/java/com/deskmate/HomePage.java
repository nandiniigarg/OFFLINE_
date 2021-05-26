package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }

    public void openCalc(View view){
        Intent intent = new Intent(HomePage.this, CalcNav.class);
        startActivity(intent);

    }
    public void openRegister(View view){
        Intent intent = new Intent(HomePage.this, RegisterPage.class);
        startActivity(intent);
    }
    public void openLogin(View view){
        Intent intent = new Intent(HomePage.this, LoginPage.class);
        startActivity(intent);
    }
    public void openStudy(View view){
        Intent intent = new Intent(HomePage.this, StudyHome.class);
        startActivity(intent);
    }
}