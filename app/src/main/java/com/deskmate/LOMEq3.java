package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LOMEq3 extends AppCompatActivity {
    private EditText edu3;
    private EditText eda3;
    private EditText eds3;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_m_eq3);
        edu3= (EditText) findViewById(R.id.edu3);
        eda3 = (EditText) findViewById(R.id.eda3);
        eds3 = (EditText) findViewById(R.id.eds3);
        result = (TextView) findViewById(R.id.sumeq3);
    }

    public void btneq3(View view) {
        double n1 = Double.parseDouble(edu3.getText().toString());
        double n2 = Double.parseDouble(eda3.getText().toString());
        double n3 = Double.parseDouble(eds3.getText().toString());
        double sum = n1 * n1 + 2 * n2 * n3;
        result.setText(Double.toString(Math.sqrt(sum))+ " m");
    }
}