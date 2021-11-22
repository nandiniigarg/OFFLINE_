package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SS_LOM_THEORY_01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss_lom_theory01);
    }


    public void ss_lomtheor_2(View view) {
        Intent intent = new Intent(SS_LOM_THEORY_01.this, SS_LOM_THEORY_02.class);
        startActivity(intent);
    }

}