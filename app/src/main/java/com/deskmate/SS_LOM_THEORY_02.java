package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SS_LOM_THEORY_02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss_lom_theory02);
    }

    public void nextpagelom02(View view) {
        Intent intent = new Intent(SS_LOM_THEORY_02.this, SS_LOM_THEORY_03.class);
        startActivity(intent);
    }
}