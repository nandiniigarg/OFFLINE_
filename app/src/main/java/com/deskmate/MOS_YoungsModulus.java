package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class MOS_YoungsModulus extends AppCompatActivity {
    private EditText ym;
    private EditText ymL;
    private EditText yml;
    private EditText yma;
    private EditText ymf;
    private TextView sumym;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_o_s__youngs_modulus);
        ym = (EditText) findViewById(R.id.ym);
        ymL = (EditText) findViewById(R.id.ymL);
        yma = (EditText) findViewById(R.id.yma);
        yml = (EditText) findViewById(R.id.yml);
        ymf = (EditText) findViewById(R.id.ymf);
        sumym = (TextView) findViewById(R.id.sumym);
    }

    private void calcFunction() {
        if (ym.getText().toString().equals("*")) {
            double L = Double.parseDouble(ymL.getText().toString());
            double l = Double.parseDouble(yml.getText().toString());
            double a = Double.parseDouble(yma.getText().toString());
            double F = Double.parseDouble(ymf.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((F * L) / (a * l)))));
            if (res.contains("E")) {
                sumym.setText(expConverter(res));
            } else {
                sumym.setText(res);
            }

        } else if (yml.getText().toString().equals("*")) {
            double L = Double.parseDouble(ymL.getText().toString());
            double a = Double.parseDouble(yma.getText().toString());
            double F = Double.parseDouble(ymf.getText().toString());
            double y = Double.parseDouble(ym.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((F * L) / (a * y)))));
            if (res.contains("E")) {
                sumym.setText(expConverter(res));
            } else {
                sumym.setText(res);
            }
        } else if (ymL.getText().toString().equals("*")) {
            double l = Double.parseDouble(yml.getText().toString());
            double a = Double.parseDouble(yma.getText().toString());
            double y = Double.parseDouble(ym.getText().toString());
            double F = Double.parseDouble(ymf.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((y * a * l) / F))));
            if (res.contains("E")) {
                sumym.setText(expConverter(res));
            } else {
                sumym.setText(res);
            }
        } else if (ymf.getText().toString().equals("*")) {
            double l = Double.parseDouble(yml.getText().toString());
            double a = Double.parseDouble(yma.getText().toString());
            double y = Double.parseDouble(ym.getText().toString());
            double L = Double.parseDouble(ymL.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((y * a * l) / L))));
            if (res.contains("E")) {
                sumym.setText(expConverter(res));
            } else {
                sumym.setText(res);
            }
        } else if (yma.getText().toString().equals("*")) {
            double l = Double.parseDouble(yml.getText().toString());
            double F = Double.parseDouble(ymf.getText().toString());
            double y = Double.parseDouble(ym.getText().toString());
            double L = Double.parseDouble(ymL.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((F * L) / (y * l)))));
            if (res.contains("E")) {
                sumym.setText(expConverter(res));
            } else {
                sumym.setText(res);
            }
        }
    }

    public void btnym(View view) {
        calcFunction();
    }
}