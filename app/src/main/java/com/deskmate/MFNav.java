package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MFNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_f_nav);
    }

    public void MFcor(View view) {
        Intent intent = new Intent(MFNav.this, MFduetoC_fieldaatCentreofRing.class);
        startActivity(intent);
    }

    public void MFcoa(View view) {
        Intent intent = new Intent(MFNav.this, MFduetoC_fieldatCentreofArc.class);
        startActivity(intent);
    }

    public void MFisw(View view) {
        Intent intent = new Intent(MFNav.this, MFduetoC_fieldduetoinfstrtwire.class);
        startActivity(intent);
    }

    public void MFit(View view) {
        Intent intent = new Intent(MFNav.this, MFduetoC_fieldinsideaToroid.class);
        startActivity(intent);
    }

    public void MFaor(View view) {
        Intent intent = new Intent(MFNav.this, MFduetoC_fieldonaxisofring.class);
        startActivity(intent);
    }

    public void homeBtn(View view) {
        Intent intent = new Intent(MFNav.this, HomePage.class);
        startActivity(intent);
    }
}