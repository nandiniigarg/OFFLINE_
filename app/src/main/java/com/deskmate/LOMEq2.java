package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LOMEq2 extends AppCompatActivity {
    private EditText edu2;
    private EditText eda2;
    private EditText edt2;
    private TextView sumeq2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_m_eq2);
        edu2 = (EditText) findViewById(R.id.edu2);
        eda2 = (EditText) findViewById(R.id.eda2);
        edt2 = (EditText) findViewById(R.id.edt2);
        sumeq2 = (TextView) findViewById(R.id.sumeq2);
    }

    public void btneq2(View view) {
        double n1 = Double.parseDouble(edu2.getText().toString());
        double n2 = Double.parseDouble(eda2.getText().toString());
        double n3 = Double.parseDouble(edt2.getText().toString());
        sumeq2.setText(String.valueOf(Double.toString(n1 * n3 + 1/2 *n2 * n3 * n1 ) + " m"));

    }
}