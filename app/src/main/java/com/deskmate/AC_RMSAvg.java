package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class AC_RMSAvg extends AppCompatActivity {
    private EditText rmsavg;
    private EditText rmsVavg;
    private TextView sumrmsavg;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_c__r_m_s_avg);
        rmsavg = (EditText) findViewById(R.id.rmsavg);
        rmsVavg = (EditText) findViewById(R.id.rmsVavg);
        sumrmsavg = (TextView) findViewById(R.id.sumrmsavg);
    }
    private void calcFunction() {
        if (rmsavg.getText().toString().equals("*")) {
            double v = Double.parseDouble(rmsVavg.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(3.14159 * v / (2 * Math.sqrt(2))))));
            if (res.contains("E")) {
                sumrmsavg.setText(expConverter(res));
            } else {
                sumrmsavg.setText(res);
            }
        } else if (rmsVavg.getText().toString().equals("*")) {
            double r = Double.parseDouble(rmsavg.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(r * 2 * Math.sqrt(2) / 3.14159))));
            if (res.contains("E")) {
                sumrmsavg.setText(expConverter(res));
            } else {
                sumrmsavg.setText(res);
            }
        }
    }

    public void btnavg(View view) {
        calcFunction();
    }
}