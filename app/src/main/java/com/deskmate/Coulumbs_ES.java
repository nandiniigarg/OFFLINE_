package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Coulumbs_ES extends AppCompatActivity {
    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private TextView result;
    static final double k = 9*Math.pow(10,9);
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coulumbs__e_s);
        entry1 = (EditText) findViewById(R.id.charge1);
        entry2 = (EditText) findViewById(R.id.charge2);
        entry3 = (EditText) findViewById(R.id.dist);
        result = (TextView) findViewById(R.id.result_ef);
    }
    private double calcFunc(double q1, double q2, double f){

        double q1 = Double.parseDouble(entry1.getText().toString());
        double q2 = Double.parseDouble(entry2.getText().toString());

    }
    public void Coulumbs_es(View view){


        double r = Double.parseDouble(entry3.getText().toString());
        result.setText(String.valueOf(com.deskmate.DeskmateRes.expConverter(Double.toString(k * q1 * q2 / (r * r)))));


    }

}