package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class LOMEq2 extends AppCompatActivity {
    private EditText lomeq2u;
    private EditText lomeq2s;
    private EditText lomeq2a;
    private EditText lomeq2t;
    private TextView sumeq2;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_m_eq2);
        lomeq2s = (EditText) findViewById(R.id.lomeq2s);
        lomeq2t = (EditText) findViewById(R.id.lomeq2t);
        lomeq2a= (EditText) findViewById(R.id.lomeq2a);
        lomeq2u = (EditText) findViewById(R.id.lomeq2u);
        sumeq2 = (TextView) findViewById(R.id.sumeq2);
    }
    private void calcFunction() {
        if (lomeq2s.getText().toString().equals("*")) {
            double u = Double.parseDouble(lomeq2u.getText().toString());
            double a = Double.parseDouble(lomeq2a.getText().toString());
            double t = Double.parseDouble(lomeq2t.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(u * t + 1/2 * a * t * t ))));
            if (res.contains("E")) {
                sumeq2.setText(expConverter(res));
            } else {
                sumeq2.setText(res);
            }
        } else if (lomeq2u.getText().toString().equals("*")) {
            double s = Double.parseDouble(lomeq2s.getText().toString());
            double a = Double.parseDouble(lomeq2a.getText().toString());
            double t = Double.parseDouble(lomeq2t.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((s - 1/2 * a * t * t) / t))));
            if (res.contains("E")) {
                sumeq2.setText(expConverter(res));
            } else {
                sumeq2.setText(res);
            }
        } else if (lomeq2a.getText().toString().equals("*")) {
            double s = Double.parseDouble(lomeq2s.getText().toString());
            double u = Double.parseDouble(lomeq2u.getText().toString());
            double t = Double.parseDouble(lomeq2t.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((2 * s - 2 * u * t)  / (t * t)))));
            if (res.contains("E")) {
                sumeq2.setText(expConverter(res));
            } else {
                sumeq2.setText(res);
            }
        }
    }

    public void btneq2(View view) {
        calcFunction();
    }
}