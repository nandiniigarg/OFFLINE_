package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class AC_CapacitiveReactance extends AppCompatActivity {
    private EditText caprec;
    private EditText caprecf;
    private EditText caprecc;
    private TextView sumcaprec;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_capacitive_reactance);
        caprec = (EditText) findViewById(R.id.caprec);
        caprecf = (EditText) findViewById(R.id.caprecf);
        caprecc = (EditText) findViewById(R.id.caprecc);
        sumcaprec = (TextView) findViewById(R.id.sumcaprec);
    }
    private void calcFunction() {
        if (caprec.getText().toString().equals("*")) {
            double f = Double.parseDouble(caprecf.getText().toString());
            double C = Double.parseDouble(caprecc.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(1 / ( 2 * 3.14285 * C * f)))));
            if (res.contains("E")) {
                sumcaprec.setText(expConverter(res));
            } else {
                sumcaprec.setText(res);
            }
        } else if (caprecf.getText().toString().equals("*")) {
            double x = Double.parseDouble(caprec.getText().toString());
            double C = Double.parseDouble(caprecc.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(1 / ( 2 * 3.14285 * C * x)))));
            if (res.contains("E")) {
                sumcaprec.setText(expConverter(res));
            } else {
                sumcaprec.setText(res);
            }
        } else if (caprecc.getText().toString().equals("*")) {
            double x = Double.parseDouble(caprec.getText().toString());
            double f = Double.parseDouble(caprecf.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(1 / ( 2 * 3.14285 * f * x)))));
            if (res.contains("E")) {
                sumcaprec.setText(expConverter(res));
            } else {
                sumcaprec.setText(res);
            }
        }
    }

    public void btncaprec(View view) {
        calcFunction();
    }
}