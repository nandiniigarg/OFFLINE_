package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CPNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpnav);
    }
    public void Cylinder_btn(View view){
        Intent intent = new Intent(CPNav.this, EPndC_cylindricalcapacitor.class);
        startActivity(intent);
    }
    public void EnergyStored__btn(View view){
        Intent intent = new Intent(CPNav.this, EPndC_energystoredincapacitor.class);
        startActivity(intent);
    }
}