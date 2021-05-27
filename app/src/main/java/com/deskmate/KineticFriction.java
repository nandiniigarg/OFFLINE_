package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class KineticFriction extends AppCompatActivity {
    private EditText edfrk;
    private EditText edfrku;
    private EditText edfrkn;
    private TextView sumfrk;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinetic_friction);
        edfrk = (EditText) findViewById(R.id.edfrk);
        edfrku = (EditText) findViewById(R.id.edfrku);
        edfrkn = (EditText) findViewById(R.id.edfrkn);
        sumfrk = (TextView) findViewById(R.id.sumfrk);
    }
    private void calcFunction() {
        if (edfrkn.getText().toString().equals("*")) {
            double F = Double.parseDouble(edfrk.getText().toString());
            double u = Double.parseDouble(edfrku.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(F / u))));
            if (res.contains("E")) {
                sumfrk.setText(expConverter(res));
            } else {
                sumfrk.setText(res);
            }
        } else if (edfrku.getText().toString().equals("*")) {
            double F = Double.parseDouble(edfrk.getText().toString());
            double n = Double.parseDouble(edfrkn.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(F / n ))));
            if (res.contains("E")) {
                sumfrk.setText(expConverter(res));
            } else {
                sumfrk.setText(res);
            }
        } else if (edfrk.getText().toString().equals("*")) {
            double n = Double.parseDouble(edfrkn.getText().toString());
            double u = Double.parseDouble(edfrku.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(n * u))));
            if (res.contains("E")) {
                sumfrk.setText(expConverter(res));
            } else {
                sumfrk.setText(res);
            }
        }
    }

    public void btnfrk(View view) {
        calcFunction();
    }
}