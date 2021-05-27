package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class CentripetalForce extends AppCompatActivity {
    private TextView edcf;
    private EditText edcfm;
    private EditText edcfv;
    private EditText edcfr;
    private TextView sumcf;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centripetal_force);
        edcf = (EditText) findViewById(R.id.edcf);
        edcfm = (EditText) findViewById(R.id.edcfm);
        edcfv = (EditText) findViewById(R.id.edcfv);
        edcfr = (EditText) findViewById(R.id.edcfr);
        sumcf = (TextView) findViewById(R.id.sumcf);
    }
    private void calcFunction() {
        if (edcf.getText().toString().equals("*")) {
            double m = Double.parseDouble(edcfm.getText().toString());
            double r = Double.parseDouble(edcfr.getText().toString());
            double v = Double.parseDouble(edcfv.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((m * v * v) / r))));
            if (res.contains("E")) {
                sumcf.setText(expConverter(res));
            } else {
                sumcf.setText(res);
            }
        } else if (edcfm.getText().toString().equals("*")) {
            double F = Double.parseDouble(edcf.getText().toString());
            double r = Double.parseDouble(edcfr.getText().toString());
            double v = Double.parseDouble(edcfv.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((F * r) /  v * v))));
            if (res.contains("E")) {
                sumcf.setText(expConverter(res));
        } else {
                sumcf.setText(res);
    }
        } else if (edcfr.getText().toString().equals("*")) {
            double F = Double.parseDouble(edcf.getText().toString());
            double m = Double.parseDouble(edcfm.getText().toString());
            double v = Double.parseDouble(edcfv.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((m * v * v) / F))));
            if (res.contains("E")) {
                sumcf.setText(expConverter(res));
            } else {
                sumcf.setText(res);
            }
        } else if (edcfv.getText().toString().equals("*")) {
            double F = Double.parseDouble(edcf.getText().toString());
            double m = Double.parseDouble(edcfm.getText().toString());
            double r = Double.parseDouble(edcfr.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(Math.sqrt(F * r / m)))));
            if (res.contains("E")) {
                sumcf.setText(expConverter(res));
        } else {
                sumcf.setText(res);
    }
        }
    }

    public void btncf(View view) {
        calcFunction();
    }
    }