package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class AC_Reactance extends AppCompatActivity {
    private EditText rect;
    private EditText recti;
    private EditText rectv;
    private TextView sumrect;
    private static DecimalFormat df = new DecimalFormat("0.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_reactance);
        rect = (EditText) findViewById(R.id.rect);
        recti = (EditText) findViewById(R.id.recti);
        rectv = (EditText) findViewById(R.id.rectv);
        sumrect = (TextView) findViewById(R.id.sumrect);
    }
    private void calcFunction() {
        if (rect.getText().toString().equals("*")) {
            double I = Double.parseDouble(recti.getText().toString());
            double V = Double.parseDouble(rectv.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(V * I))));
            if (res.contains("E")) {
                sumrect.setText(expConverter(res));
            } else {
                sumrect.setText(res);
            }
        } else if (recti.getText().toString().equals("*")) {
            double R = Double.parseDouble(rect.getText().toString());
            double V = Double.parseDouble(rectv.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(R / V))));
            if (res.contains("E")) {
                sumrect.setText(expConverter(res));
            } else {
                sumrect.setText(res);
            }
        } else if (rectv.getText().toString().equals("*")) {
            double R = Double.parseDouble(rect.getText().toString());
            double I = Double.parseDouble(recti.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(R / I))));
            if (res.contains("E")) {
                sumrect.setText(expConverter(res));
            } else {
                sumrect.setText(res);
            }
        }
    }

    public void btnrect(View view) {
        calcFunction();
    }
}