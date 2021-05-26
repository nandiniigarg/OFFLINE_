package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CalcNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_nav);
    }
    public void homeBtn(View view){
        Intent intent = new Intent(CalcNav.this, HomePage.class);
        startActivity(intent);
    }
    public void esNavOpen(View view){
        Intent intent = new Intent(CalcNav.this, ESNav.class);
        startActivity(intent);
    }
    public void CPNav_btn(View view){
        Intent intent = new Intent(CalcNav.this, CPNav.class);
        startActivity(intent);
    }
}