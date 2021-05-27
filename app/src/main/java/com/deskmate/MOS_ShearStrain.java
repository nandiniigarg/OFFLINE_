package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class MOS_ShearStrain extends AppCompatActivity {
    private EditText ss;
    private EditText ssx;
    private EditText ssl;
    private TextView sumss;
    private static DecimalFormat df = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_o_s__shear_strain);
        ss = (EditText) findViewById(R.id.ss);
        ssx = (EditText) findViewById(R.id.ssx);
        ssl = (EditText) findViewById(R.id.ssl);
        sumss = (TextView) findViewById(R.id.sumss);
    }
    private void calcFunction() {
        if (ss.getText().toString().equals("*")) {
            double x = Double.parseDouble(ssx.getText().toString());
            double L = Double.parseDouble(ssl.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(x / L))));
            if (res.contains("E")) {
                sumss.setText(expConverter(res));
            } else {
                sumss.setText(res);
            }
        } else if (ssx.getText().toString().equals("*")) {
            double s = Double.parseDouble(ss.getText().toString());
            double L = Double.parseDouble(ssl.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(s * L))));
            if (res.contains("E")) {
                sumss.setText(expConverter(res));
            } else {
                sumss.setText(res);
            }
        } else if (ssl.getText().toString().equals("*")) {
            double x = Double.parseDouble(ssx.getText().toString());
            double s = Double.parseDouble(ss.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(x / s))));
            if (res.contains("E")) {
                sumss.setText(expConverter(res));
            } else {
                sumss.setText(res);
            }
        }
    }

    public void btnss(View view) {
        calcFunction();
    }
}