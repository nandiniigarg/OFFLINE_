package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SS_LOM_THEORY_03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss_lom_theory03);
    }

    public void nextpagelom3(View view) {
        Intent intent = new Intent(SS_LOM_THEORY_03.this, SS_LOM_THEORY_04.class);
        startActivity(intent);
    }
}