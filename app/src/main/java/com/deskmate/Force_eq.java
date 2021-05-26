package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class Force_eq extends AppCompatActivity {
    private EditText edm;
    private EditText edf;
    private EditText edfa;
    private TextView sumf;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_eq);
        edm = (EditText) findViewById(R.id.edm);
        edfa = (EditText) findViewById(R.id.edfa);
        edf = (EditText) findViewById(R.id.edf);
        sumf = (TextView) findViewById(R.id.sumf);
    }

    private void calcFunction() {
        if (edm.getText().toString().equals("*")) {
            double a = Double.parseDouble(edfa.getText().toString());
            double F = Double.parseDouble(edfa.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(F / a))));
            if (res.contains("E")) {
                sumf.setText(expConverter(res));
            } else {
                sumf.setText(res);
            }
        } else if (edf.getText().toString().equals("*")) {
            double m = Double.parseDouble(edm.getText().toString());
            double a = Double.parseDouble(edfa.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(m * a))));
            if (res.contains("E")) {
                sumf.setText(expConverter(res));
            } else {
                sumf.setText(res);
            }
        } else if (edfa.getText().toString().equals("*")) {
            double m = Double.parseDouble(edm.getText().toString());
            double f = Double.parseDouble(edf.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(f / m))));
            if (res.contains("E")) {
                sumf.setText(expConverter(res));
            } else {
                sumf.setText(res);
            }
        }
    }

    public void btnf(View view) {
        calcFunction();
    }
    }