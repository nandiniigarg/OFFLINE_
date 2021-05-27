package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.expConverter;

public class LOMEacc extends AppCompatActivity {
    private EditText edua;
    private EditText edva;
    private EditText edta;
    private EditText edaa;
    private TextView sumacc;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_m_eacc);
        edua = (EditText) findViewById(R.id.edua);
        edaa = (EditText) findViewById(R.id.edaa);
        edta = (EditText) findViewById(R.id.edta);
        edva = (EditText) findViewById((R.id.edva));
        sumacc = (TextView) findViewById(R.id.sumacc);
    }

    private void calcFunction() {
        if (edaa.getText().toString().equals("*")) {
            double v = Double.parseDouble(edva.getText().toString());
            double u = Double.parseDouble(edua.getText().toString());
            double t = Double.parseDouble(edta.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((v - u) / t))));
            if (res.contains("E")) {
                sumacc.setText(expConverter(res));
            } else {
                sumacc.setText(res);
            }

        } else if (edua.getText().toString().equals("*")) {
            double v = Double.parseDouble(edva.getText().toString());
            double a = Double.parseDouble(edaa.getText().toString());
            double t = Double.parseDouble(edta.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(v - a * t))));
            if (res.contains("E")) {
                sumacc.setText(expConverter(res));
            } else {
                sumacc.setText(res);
            }
        } else if (edta.getText().toString().equals("*")) {
            double v = Double.parseDouble(edva.getText().toString());
            double a = Double.parseDouble(edaa.getText().toString());
            double u = Double.parseDouble(edua.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format((v - u) / a))));
            if (res.contains("E")) {
                sumacc.setText(expConverter(res));
            } else {
                sumacc.setText(res);
            }
        } else if (edva.getText().toString().equals("*")) {
            double t = Double.parseDouble(edta.getText().toString());
            double a = Double.parseDouble(edaa.getText().toString());
            double u = Double.parseDouble(edua.getText().toString());
            String res = String.valueOf(Double.toString(Double.parseDouble(df.format(u + a * t))));
            if (res.contains("E")) {
                sumacc.setText(expConverter(res));
            } else {
                sumacc.setText(res);
            }
        }

    }

    public void btnacc(View view) {
        calcFunction();
    }
}
