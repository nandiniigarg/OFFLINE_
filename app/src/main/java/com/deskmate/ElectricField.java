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
    private EditText efo;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Context context = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric_field);
        chrg = (EditText) findViewById(R.id.charge);
        dista = (EditText) findViewById(R.id.distance);
        efo = (EditText) findViewById(R.id.distance2);
        res = (TextView) findViewById(R.id.result_ef);

    }public void calc_EF (View view){
        res.setText(ElectroStatics.ElectricField(chrg.getText().toString(), dista.getText().toString(), efo.getText().toString()));

    }
}