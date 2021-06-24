package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class LOMEq1 extends AppCompatActivity {
    private EditText lomeq1u;
    private EditText lomeq1v;
    private EditText lomeq1t;
    private EditText lomeq1a;
    private TextView sumlomeq1;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_m_eq1);
        lomeq1u = (EditText) findViewById(R.id.lomeq1u);
        lomeq1v = (EditText) findViewById(R.id.lomeq1v);
        lomeq1t = (EditText) findViewById(R.id.lomeq1t);
        lomeq1a = (EditText) findViewById(R.id.lomeq1a);
        sumlomeq1 = (TextView) findViewById(R.id.sumlomeq1);

    }
    private void calcFunction() {
        if (lomeq1v.getText().toString().equals("*")) {
            double u = Double.parseDouble(lomeq1u.getText().toString());
            double a = Double.parseDouble(lomeq1a.getText().toString());
            double t = Double.parseDouble(lomeq1t.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(u + a * t ))));
            if (res.contains("E")) {
                sumlomeq1.setText(expConverter(res));
            } else {
                sumlomeq1.setText(res);
            }
        } else if (lomeq1u.getText().toString().equals("*")) {
            double v = Double.parseDouble(lomeq1v.getText().toString());
            double a = Double.parseDouble(lomeq1a.getText().toString());
            double t = Double.parseDouble(lomeq1t.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(v - a * t))));
            if (res.contains("E")) {
                sumlomeq1.setText(expConverter(res));
            } else {
                sumlomeq1.setText(res);
            }
        } else if (lomeq1a.getText().toString().equals("*")) {
            double v = Double.parseDouble(lomeq1v.getText().toString());
            double u = Double.parseDouble(lomeq1u.getText().toString());
            double t = Double.parseDouble(lomeq1t.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((v - u)  / t))));
            if (res.contains("E")) {
                sumlomeq1.setText(expConverter(res));
            } else {
                sumlomeq1.setText(res);
            }
        } else if (lomeq1t.getText().toString().equals("*")) {
            double u = Double.parseDouble(lomeq1u.getText().toString());
            double a = Double.parseDouble(lomeq1a.getText().toString());
            double v = Double.parseDouble(lomeq1v.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((v - u)  / a))));
            if (res.contains("E")) {
                sumlomeq1.setText(expConverter(res));
            } else {
                sumlomeq1.setText(res);
            }
        }
    }

    public void btnCALCULATE(View view) {
        calcFunction();
    }
}