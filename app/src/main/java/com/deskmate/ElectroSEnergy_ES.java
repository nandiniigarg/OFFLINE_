package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ElectroSEnergy_ES extends AppCompatActivity {

    private static EditText entry1;
    private static EditText entry2;
    private static EditText entry3;
    private static TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electro_s_energy__e_s);
        entry1 = (EditText) findViewById(R.id.charge_ee);
        entry2 = (EditText) findViewById(R.id.distance_ee);
        entry3 = (EditText) findViewById(R.id.charge_ee2);
        result = (TextView) findViewById(R.id.result_ee);
    }

    public void calcEE(View view){

        double q = Double.parseDouble(entry1.getText().toString());
        double q2 = Double.parseDouble(entry3.getText().toString());
        double r = Double.parseDouble(entry2.getText().toString());

        result.setText(String.valueOf(com.deskmate.DeskmateRes.expConverter(Double.toString((-1)*(DeskmateRes.coulumbsCnst * q*q2/ (r * r)))+" J")));
    }
}