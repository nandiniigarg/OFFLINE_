package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ACNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acnav);
    }
    public void rmsAvg_btn(View view){
        Intent intent = new Intent(ACNav.this, Ohms_law.class);
        startActivity(intent);
    }
}