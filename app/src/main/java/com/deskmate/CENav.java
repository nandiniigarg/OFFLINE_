package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CENav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cenav);
    }
    public void EnergyStored__btn(View view){
        Intent intent = new Intent(CENav.this, Ohms_law.class);
        startActivity(intent);
    }
    public void EquivalentRes_btn(View view){
        Intent intent = new Intent(CENav.this, EquivalentRes.class);
        startActivity(intent);
    }

}