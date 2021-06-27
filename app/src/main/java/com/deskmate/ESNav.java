package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ESNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esnav);
    }
    public void openCoulumbs(View view){
        Intent intent = new Intent(ESNav.this, Coulumbs_ES.class);
        startActivity(intent);
    }
    public void openElectricF(View view){
        Intent intent = new Intent(ESNav.this, ElectricField.class);
        startActivity(intent);
    }
    public void openElectroEnergy(View view){
        Intent intent = new Intent(ESNav.this, ElectroSEnergy_ES.class);
        startActivity(intent);
    }
    public void dipPotential_btn(View view){
        Intent intent = new Intent(ESNav.this, dipolePotential.class);
        startActivity(intent);
    }
    public void homeBtn(View view) {
        Intent intent = new Intent(ESNav.this, HomePage.class);
        startActivity(intent);
    }
}