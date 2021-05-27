package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class AC_RMSPeaktoPeak extends AppCompatActivity {
    private EditText rmspp;
    private EditText rmsVpp;
    private TextView sumvpp;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_c__r_m_s_peakto_peak);
        rmspp = (EditText) findViewById(R.id.rmspp);
        rmsVpp = (EditText) findViewById(R.id.rmsVpp);
        sumvpp = (TextView) findViewById(R.id.sumvpp);
    }
    private void calcFunction() {
        if (rmspp.getText().toString().equals("*")) {
            double v = Double.parseDouble(rmsVpp.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(v / (2 * Math.sqrt(2))))));
            if (res.contains("E")) {
                sumvpp.setText(expConverter(res));
            } else {
                sumvpp.setText(res);
            }
        } else if (rmsVpp.getText().toString().equals("*")) {
            double r = Double.parseDouble(rmspp.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(r * 2 * Math.sqrt(2)))));
            if (res.contains("E")) {
                sumvpp.setText(expConverter(res));
            } else {
                sumvpp.setText(res);
            }
        }
    }

    public void btnrmsvpp(View view) {
        calcFunction();
    }
}