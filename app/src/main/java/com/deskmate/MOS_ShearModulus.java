package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class MOS_ShearModulus extends AppCompatActivity {
    private EditText sm;
    private EditText smx;
    private EditText sml;
    private EditText sma;
    private EditText smf;
    private TextView sumsm;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_o_s__shear_modulus);
        sm = (EditText) findViewById(R.id.sm);
        smx = (EditText) findViewById(R.id.smx);
        sma = (EditText) findViewById(R.id.sma);
        sml = (EditText) findViewById(R.id.sml);
        smf = (EditText) findViewById(R.id.smf);
        sumsm = (TextView) findViewById(R.id.sumsm);
    }
    private void calcFunction() {
        if (sm.getText().toString().equals("*")) {
            double x = Double.parseDouble(smx.getText().toString());
            double l = Double.parseDouble(sml.getText().toString());
            double a = Double.parseDouble(sma.getText().toString());
            double F = Double.parseDouble(smf.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((F * l) / (a * x)))));
            if (res.contains("E")) {
                sumsm.setText(expConverter(res));
            } else {
                sumsm.setText(res);
            }

        } else if (sml.getText().toString().equals("*")) {
            double x = Double.parseDouble(smx.getText().toString());
            double a = Double.parseDouble(sma.getText().toString());
            double F = Double.parseDouble(smf.getText().toString());
            double g = Double.parseDouble(sm.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((g * a * x) / F))));
            if (res.contains("E")) {
                sumsm.setText(expConverter(res));
            } else {
                sumsm.setText(res);
            }
        } else if (smx.getText().toString().equals("*")) {
            double l = Double.parseDouble(sml.getText().toString());
            double a = Double.parseDouble(sma.getText().toString());
            double g = Double.parseDouble(sm.getText().toString());
            double F = Double.parseDouble(smf.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((F * l) / (a * g)))));
            if (res.contains("E")) {
                sumsm.setText(expConverter(res));
            } else {
                sumsm.setText(res);
            }
        } else if (smf.getText().toString().equals("*")) {
            double l = Double.parseDouble(sml.getText().toString());
            double a = Double.parseDouble(sma.getText().toString());
            double g = Double.parseDouble(sm.getText().toString());
            double x = Double.parseDouble(smx.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((g * a * x) / l))));
            if (res.contains("E")) {
                sumsm.setText(expConverter(res));
            } else {
                sumsm.setText(res);
            }
        } else if (sma.getText().toString().equals("*")) {
            double l = Double.parseDouble(sml.getText().toString());
            double F = Double.parseDouble(smf.getText().toString());
            double g = Double.parseDouble(sm.getText().toString());
            double x = Double.parseDouble(smx.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((F * l) / (g * x)))));
            if (res.contains("E")) {
                sumsm.setText(expConverter(res));
            } else {
                sumsm.setText(res);
            }
        }
    }

    public void btnsm(View view) {
        calcFunction();
    }
}