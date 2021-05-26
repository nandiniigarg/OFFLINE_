package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EPndC_energystoredincapacitor extends AppCompatActivity {
    private EditText etq;
    private EditText etV;
    private EditText etc;
    private TextView tvResult7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_pnd_c_energystoredincapacitor);
        etq = (EditText) findViewById(R.id.etq);
        etV = (EditText) findViewById(R.id.etV);
        etc = (EditText) findViewById(R.id.etc);
        tvResult7 = (TextView) findViewById(R.id.tvResult7);
    }

    public void EnergyCapacitor(View view) {
        Context context = getApplicationContext();
        if (etq.getText().toString().equals("")) {
            double V = Double.parseDouble(etV.getText().toString());
            double c = Double.parseDouble(etc.getText().toString());
            double result = 0.5*c*V*V;
            tvResult7.setText(String.valueOf(result)+"J");
        }else if(etV.getText().toString().equals("")) {
            double q = Double.parseDouble(etq.getText().toString());
            double c = Double.parseDouble(etc.getText().toString());
            double result = (q*q)/(2*c);
            tvResult7.setText(String.valueOf(result)+"J");
        }else {
            double q = Double.parseDouble(etq.getText().toString());
            double V = Double.parseDouble(etV.getText().toString());
            double result = 0.5*q*V;
            tvResult7.setText(String.valueOf(result)+"J");
        }


    }
    public void homeBTN(View view){
        Intent intent = new Intent(EPndC_energystoredincapacitor.this, HomePage.class);
        startActivity(intent);
    }

}