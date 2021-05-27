package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class LinearMomentum extends AppCompatActivity {
    private EditText edp;
    private EditText edpm;
    private EditText edpv;
    private TextView sumlm;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearmomentum);
        edp = (EditText) findViewById(R.id.edp);
        edpm = (EditText) findViewById(R.id.edpm);
        edpv = (EditText) findViewById(R.id.edpv);
        sumlm = (TextView) findViewById(R.id.sumlm);
    }
    private void calcFunction() {
        if (edp.getText().toString().equals("*")) {
            double m = Double.parseDouble(edpm.getText().toString());
            double v = Double.parseDouble(edpv.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(m * v))));
            if (res.contains("E")) {
                sumlm.setText(expConverter(res));
            } else {
                sumlm.setText(res);
            }
        } else if (edpm.getText().toString().equals("*")) {
            double p = Double.parseDouble(edp.getText().toString());
            double v = Double.parseDouble(edpv.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format( p/ v))));
            if (res.contains("E")) {
                sumlm.setText(expConverter(res));
            } else {
                sumlm.setText(res);
            }
        } else if (edpv.getText().toString().equals("*")) {
            double m = Double.parseDouble(edpm.getText().toString());
            double p = Double.parseDouble(edp.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(p / m))));
            if (res.contains("E")) {
                sumlm.setText(expConverter(res));
            } else {
                sumlm.setText(res);
            }
        }
    }

    public void btnlm(View view) {
        calcFunction();
    }
}
