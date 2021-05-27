package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class MOS_LongitudinalStrain extends AppCompatActivity {
    private EditText lss;
    private EditText lsl;
    private EditText lsL;
    private TextView sumls;
    private static DecimalFormat df = new DecimalFormat("0.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_o_s__longitudinal_strain);
        lss = (EditText) findViewById(R.id.lss);
        lsL = (EditText) findViewById(R.id.lsL);
        lsl = (EditText) findViewById(R.id.lsl);
        sumls = (TextView) findViewById(R.id.sumls);
    }
    private void calcFunction() {
        if (lss.getText().toString().equals("*")) {
            double l = Double.parseDouble(lsl.getText().toString());
            double L = Double.parseDouble(lsL.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(L / l))));
            if (res.contains("E")) {
                sumls.setText(expConverter(res));
            } else {
                sumls.setText(res);
            }
        } else if (lsl.getText().toString().equals("*")) {
            double l = Double.parseDouble(lsL.getText().toString());
            double s = Double.parseDouble(lss.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(l / s))));
            if (res.contains("E")) {
                sumls.setText(expConverter(res));
            } else {
                sumls.setText(res);
            }
        } else if (lsL.getText().toString().equals("*")) {
            double l = Double.parseDouble(lsl.getText().toString());
            double s = Double.parseDouble(lss.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(s * l))));
            if (res.contains("E")) {
                sumls.setText(expConverter(res));
            } else {
                sumls.setText(res);
            }
        }
    }

    public void btnls(View view) {
        calcFunction();
    }
}