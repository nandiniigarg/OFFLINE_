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
    public void CENav_btn(View view){
        Intent intent = new Intent(CalcNav.this, CENav.class);
        startActivity(intent);
    }
    public void ACNav_btn(View view){
        Intent intent = new Intent(CalcNav.this, ACNav.class);
        startActivity(intent);
    }
    public void MagNav_btn(View view){
        Intent intent = new Intent(CalcNav.this, MagneticsNav.class);
        startActivity(intent);
    }
    public void LOMNav_btn(View view){
        Intent intent = new Intent(CalcNav.this, LOM_Nav.class);
        startActivity(intent);
    }
    public void MFNav_btn(View view){
        Intent intent = new Intent(CalcNav.this, MFNav.class);
        startActivity(intent);
    }

}