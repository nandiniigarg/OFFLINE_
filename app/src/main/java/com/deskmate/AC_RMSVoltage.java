package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class AC_RMSVoltage extends AppCompatActivity {
    private EditText rms;
    private EditText rmsVp;
    private TextView sumVp;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_c__r_m_s_voltage);
        rms = (EditText) findViewById(R.id.rms);
        rmsVp = (EditText) findViewById(R.id.rmsVp);
        sumVp = (TextView) findViewById(R.id.sumVp);
    }
    private void calcFunction() {
        if (rms.getText().toString().equals("*")) {
            double v = Double.parseDouble(rmsVp.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(v / Math.sqrt(2)))));
            if (res.contains("E")) {
                sumVp.setText(expConverter(res));
            } else {
                sumVp.setText(res);
            }
        } else if (rmsVp.getText().toString().equals("*")) {
            double r = Double.parseDouble(rms.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(r * Math.sqrt(2)))));
            if (res.contains("E")) {
                sumVp.setText(expConverter(res));
            } else {
                sumVp.setText(res);
            }
        }
    }

    public void btnrmsVp(View view) {
        calcFunction();
    }
}