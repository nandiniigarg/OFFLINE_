package com.deskmate;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ElectricField extends AppCompatActivity {
    private EditText chrg;
    private EditText dista;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Context context = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric_field);
        chrg = (EditText) findViewById(R.id.charge);
        dista = (EditText) findViewById(R.id.distance);
        res = (TextView) findViewById(R.id.result_ef);
    }
    public void calc_EF(View view){


        double q = Double.parseDouble(chrg.getText().toString());
        double d = Double.parseDouble(dista.getText().toString());
        String result = com.deskmate.DeskmateRes.expConverter(Double.toString(DeskmateRes.coulumbsCnst * q / (d * d)));

        res.setText(result + "N/C");
    }
}