package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EPCNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_p_c_nav);
    }

    public void homeBtn(View view) {
        Intent intent = new Intent(EPCNav.this, HomePage.class);
        startActivity(intent);
    }

    public void EPCc(View view) {
        Intent intent = new Intent(EPCNav.this, EPndC_Capacitance.class);
        startActivity(intent);
    }

    public void EPCcylc(View view) {
        Intent intent = new Intent(EPCNav.this, EPndC_cylindricalcapacitor.class);
        startActivity(intent);
    }

    public void EPCesc(View view) {
        Intent intent = new Intent(EPCNav.this, EPndC_energystoredincapacitor.class);
        startActivity(intent);
    }

    public void EPCppc(View view) {
        Intent intent = new Intent(EPCNav.this, EPndC_parallelplatecapacitor.class);
        startActivity(intent);
    }

    public void EPCsc(View view) {
        Intent intent = new Intent(EPCNav.this, EPndC_sphericalcapacitor.class);
        startActivity(intent);
    }
}