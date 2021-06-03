package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MagneticsNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magnetics_nav);
    }
    public void mfieldSC_btn(View view){
        Intent intent = new Intent(MagneticsNav.this, MFieldCurrent.class);
        startActivity(intent);
    }
}