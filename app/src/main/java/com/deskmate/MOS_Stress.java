package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class MOS_Stress extends AppCompatActivity {
    private EditText cs;
    private EditText csf;
    private EditText csa;
    private TextView sumcs;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_o_s__stress);
        cs = (EditText) findViewById(R.id.cs);
        csf = (EditText) findViewById(R.id.csf);
        csa = (EditText) findViewById(R.id.csa);
        sumcs = (TextView) findViewById(R.id.sumcs);
    }
    private void calcFunction() {
        if (cs.getText().toString().equals("*")) {
            double F = Double.parseDouble(csf.getText().toString());
            double A = Double.parseDouble(csa.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(F / A))));
            if (res.contains("E")) {
                sumcs.setText(expConverter(res));
            } else {
                sumcs.setText(res);
            }
        } else if (csf.getText().toString().equals("*")) {
            double A = Double.parseDouble(csa.getText().toString());
            double s = Double.parseDouble(cs.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(A * s))));
            if (res.contains("E")) {
                sumcs.setText(expConverter(res));
            } else {
                sumcs.setText(res);
            }
        } else if (csa.getText().toString().equals("*")) {
            double F = Double.parseDouble(csf.getText().toString());
            double s = Double.parseDouble(cs.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(s * F))));
            if (res.contains("E")) {
                sumcs.setText(expConverter(res));
            } else {
                sumcs.setText(res);
            }
        }
    }

    public void btns(View view) {
        calcFunction();
    }
}
