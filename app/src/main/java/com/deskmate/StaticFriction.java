package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class StaticFriction extends AppCompatActivity {
    private EditText edfrs;
    private EditText edfrsu;
    private EditText edfrsn;
    private TextView sumfrs;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_friction);
        edfrs = (EditText) findViewById(R.id.edfrs);
        edfrsu = (EditText) findViewById(R.id.edfrsu);
        edfrsn = (EditText) findViewById(R.id.edfrsn);
        sumfrs = (TextView) findViewById(R.id.sumfrs);
    }
    private void calcFunction() {
        if (edfrsn.getText().toString().equals("*")) {
            double F = Double.parseDouble(edfrs.getText().toString());
            double u = Double.parseDouble(edfrsu.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(F / u))));
            if (res.contains("E")) {
                sumfrs.setText(expConverter(res));
            } else {
                sumfrs.setText(res);
            }
        } else if (edfrsu.getText().toString().equals("*")) {
            double F = Double.parseDouble(edfrs.getText().toString());
            double n = Double.parseDouble(edfrsn.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(F / n ))));
            if (res.contains("E")) {
                sumfrs.setText(expConverter(res));
            } else {
                sumfrs.setText(res);
            }
        } else if (edfrs.getText().toString().equals("*")) {
            double n = Double.parseDouble(edfrsn.getText().toString());
            double u = Double.parseDouble(edfrsu.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(n * u))));
            if (res.contains("E")) {
                sumfrs.setText(expConverter(res));
            } else {
                sumfrs.setText(res);
            }
        }
    }

    public void btnfrs(View view) {
        calcFunction();
    }
}