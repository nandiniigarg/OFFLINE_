package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class MOS_HookesLaw extends AppCompatActivity {
    private EditText hl;
    private EditText hle;
    private EditText hls;
    private TextView sumhl;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_o_s__hookes_law);
        hl = (EditText) findViewById(R.id.hl);
        hle = (EditText) findViewById(R.id.hle);
        hls = (EditText) findViewById(R.id.hls);
        sumhl = (TextView) findViewById(R.id.sumhl);
    }
    private void calcFunction() {
        if (hl.getText().toString().equals("*")) {
            double E = Double.parseDouble(hle.getText().toString());
            double e = Double.parseDouble(hls.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(E * e))));
            if (res.contains("E")) {
                sumhl.setText(expConverter(res));
            } else {
                sumhl.setText(res);
            }
        } else if (hle.getText().toString().equals("*")) {
            double s = Double.parseDouble(hl.getText().toString());
            double e = Double.parseDouble(hls.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(s / e))));
            if (res.contains("E")) {
                sumhl.setText(expConverter(res));
            } else {
                sumhl.setText(res);
            }
        } else if (hls.getText().toString().equals("*")) {
            double s = Double.parseDouble(hl.getText().toString());
            double E = Double.parseDouble(hle.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(s / E))));
            if (res.contains("E")) {
                sumhl.setText(expConverter(res));
            } else {
                sumhl.setText(res);
            }
        }
    }

    public void btnhl(View view) {
        calcFunction();
    }
}