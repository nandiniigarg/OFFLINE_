package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SS_LOM_THEORY_01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss_lom_theory01);
    }

    public void nextpagelom1(View view)
    {
        Intent intent = new Intent(SS_LOM_THEORY_01.this, SS_LOM_THEORY_02.class);
        startActivity(intent);
    }
}