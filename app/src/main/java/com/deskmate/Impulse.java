package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class Impulse extends AppCompatActivity {
    private EditText edj;
    private EditText edjf;
    private EditText edjt;
    private TextView sumj;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impulse);
        edj = (EditText) findViewById(R.id.edj);
        edjt = (EditText) findViewById(R.id.edjt);
        edjf = (EditText) findViewById(R.id.edjf);
        sumj = (TextView) findViewById(R.id.sumj);
    }
    private void calcFunction() {
        if (edjt.getText().toString().equals("*")) {
            double F = Double.parseDouble(edjf.getText().toString());
            double J = Double.parseDouble(edj.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(J / F))));
            if (res.contains("E")) {
                sumj.setText(expConverter(res));
            } else {
                sumj.setText(res);
            }
        } else if (edj.getText().toString().equals("*")) {
            double F = Double.parseDouble(edjf.getText().toString());
            double t = Double.parseDouble(edjt.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(F * t ))));
            if (res.contains("E")) {
                sumj.setText(expConverter(res));
            } else {
                sumj.setText(res);
            }
        } else if (edjf.getText().toString().equals("*")) {
            double J = Double.parseDouble(edj.getText().toString());
            double t = Double.parseDouble(edjt.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(J / t))));
            if (res.contains("E")) {
                sumj.setText(expConverter(res));
            } else {
                sumj.setText(res);
            }
        }
    }

    public void btnj(View view) {
        calcFunction();
    }
}
