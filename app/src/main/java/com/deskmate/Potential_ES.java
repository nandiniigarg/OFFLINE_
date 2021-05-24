package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.coulumbsCnst;
import static com.deskmate.DeskmateRes.expConverter;

public class Potential_ES extends AppCompatActivity {
    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private TextView result;
    private static DecimalFormat df = new DecimalFormat("0.00");
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potential__e_s);
        entry1 = (EditText) findViewById(R.id.charge_ep);
        entry2 = (EditText) findViewById(R.id.dist_ep);
        entry3 = (EditText) findViewById(R.id.electrop);
        result = (TextView) findViewById(R.id.result_ep);
    }

    public void calcPotenial_ES(View view) {
        String res = "";
        if (entry1.getText().toString().equals("*")) {
            double r = Double.parseDouble(entry2.getText().toString());
            double v = Double.parseDouble(entry3.getText().toString());

            res += String.valueOf(Double.toString(Double.parseDouble(df.format(r * v / coulumbsCnst)))) + " C";
            if (res.contains("E")) {
                result.setText(expConverter(res));
            } else {
                result.setText(res);
            }
        } else if (entry2.getText().toString().equals("*")) {
            double q = Double.parseDouble(entry1.getText().toString());
            double v1 = Double.parseDouble(entry3.getText().toString());

            res += String.valueOf(Double.toString(Double.parseDouble(df.format(coulumbsCnst * q / v1)))) + " m";
            if (res.contains("E")) {
                result.setText(expConverter(res));
            } else {
                result.setText(res);
            }
        } else if (entry3.getText().toString().equals("*")) {
            double q = Double.parseDouble(entry1.getText().toString());
            double r1 = Double.parseDouble(entry2.getText().toString());

            res += String.valueOf(Double.toString(Double.parseDouble(df.format(coulumbsCnst * q / r1)))) + " J";
            if (res.contains("E")) {
                result.setText(expConverter(res));
            } else {
                result.setText(res);
            }
        }
    }
}
