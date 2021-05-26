package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EPndC_cylindricalcapacitor extends AppCompatActivity {
    private EditText etir1;
    private EditText etor1;
    private EditText eth;
    private TextView tvResult5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_pnd_c_cylindricalcapacitor);
        etir1 = (EditText) findViewById(R.id.etir1);
        etor1 = (EditText) findViewById(R.id.etor1);
        eth = (EditText) findViewById(R.id.eth);
        tvResult5 = (TextView) findViewById(R.id.tvResult5);

    }

    public void CCapacitor(View view) {
        double r1 = Double.parseDouble(etir1.getText().toString());
        double r2 = Double.parseDouble(etor1.getText().toString());
        double l = Double.parseDouble(eth.getText().toString());
        double ccap = (2*(22/7)*8.854*Math.pow(10,-12)*l)/(Math.log(r2/r1));
        tvResult5.setText(String.valueOf(ccap)); 
    }
}