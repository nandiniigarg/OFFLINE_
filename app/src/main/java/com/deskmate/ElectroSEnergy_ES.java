package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.deskmate.DeskmateRes.coulumbsCnst;
import static com.deskmate.DeskmateRes.expConverter;

public class ElectroSEnergy_ES extends AppCompatActivity {

    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private EditText entry4;
    private  TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electro_s_energy__e_s);
        entry1 = (EditText) findViewById(R.id.charge_ee);
        entry2 = (EditText) findViewById(R.id.distance_ee);
        entry3 = (EditText) findViewById(R.id.charge_ee2);
        entry4 = (EditText) findViewById(R.id.esEnergy);
        result = (TextView) findViewById(R.id.result_ee);
    }

    public void calcEE(View view) {
        if (entry1.getText().toString().equals("*")){
            double q2 = Double.parseDouble(entry2.getText().toString());
            double r = Double.parseDouble(entry3.getText().toString());
            double ee = Double.parseDouble(entry4.getText().toString());
            result.setText(expConverter((-1) * ( ee*(r * r)/coulumbsCnst* q2) + " C"));


        }else if (entry2.getText().toString().equals("*")) {
            double q = Double.parseDouble(entry1.getText().toString());
            double r = Double.parseDouble(entry3.getText().toString());
            double ee = Double.parseDouble(entry4.getText().toString());

            result.setText(expConverter((-1) * r * r * ee /  coulumbsCnst *q + " C"));


        }else if (entry3.getText().toString().equals("*")) {
            double q = Double.parseDouble(entry1.getText().toString());
            double q2 = Double.parseDouble(entry2.getText().toString());
            double ee = Double.parseDouble(entry4.getText().toString());

            result.setText(expConverter((-1) * Math.sqrt(coulumbsCnst * q * q2 / (ee)) + " m"));


        }else if (entry4.getText().toString().equals("*")) {
            double q = Double.parseDouble(entry1.getText().toString());
            double q2 = Double.parseDouble(entry3.getText().toString());
            double r = Double.parseDouble(entry2.getText().toString());

            result.setText(expConverter((-1) * (coulumbsCnst * q * q2 / (r * r)) + " J"));
        }
    }
}