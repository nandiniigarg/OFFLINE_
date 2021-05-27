package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LOMEq1 extends AppCompatActivity {
    private EditText edu;
    private EditText eda;
    private EditText edt;
    private TextView sumeq1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_m_eq1);
        edu = (EditText) findViewById(R.id.edu);
        eda = (EditText) findViewById(R.id.eda);
        edt = (EditText) findViewById(R.id.edt);
        sumeq1 = (TextView) findViewById(R.id.sumeq1);
    }
    
    public void btnCALCULATE(View view) {
        double n1 = Double.parseDouble(edu.getText().toString());
        double n2 = Double.parseDouble(eda.getText().toString());
        double n3 = Double.parseDouble(edt.getText().toString());
        sumeq1.setText(String.valueOf(Double.toString(n1 + (n2*n3)) + " m/s"));
    }
}