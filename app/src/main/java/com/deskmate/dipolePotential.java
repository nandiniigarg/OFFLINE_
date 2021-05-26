package com.deskmate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.coulumbsCnst;
import static com.deskmate.DeskmateRes.expConverter;

public class dipolePotential extends AppCompatActivity {
    private static DecimalFormat df = new DecimalFormat("0.00");
    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private EditText entry4;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipole_potential);
        entry1 = (EditText) findViewById(R.id.theta_edp);
        entry2 = (EditText) findViewById(R.id.dipole_edp);
        entry3 = (EditText) findViewById(R.id.dist_edp);
        entry4 = (EditText) findViewById(R.id.edp_edp);
        result = (TextView) findViewById(R.id.result_dip);
    }
    public void Calc_edp(View view){
        String res = "";
        Context context = getApplicationContext();
        if (entry1.getText().toString().equals("*")){
            double p = Double.parseDouble(entry2.getText().toString());
            double r = Double.parseDouble(entry2.getText().toString());
            double v = Double.parseDouble(entry3.getText().toString());
            res += df.format(Math.acos(v*r*r/ (coulumbsCnst*p)))+" Rad";
            if (res.contains("E")){
                result.setText(expConverter(res));
            } else{
                result.setText(res);
            }
        } else if (entry2.getText().toString().equals("*")){
            double theta = Math.toRadians(Double.parseDouble(entry1.getText().toString()));
            double dist = Double.parseDouble(entry3.getText().toString());
            double pote = Double.parseDouble(entry4.getText().toString());
            res += df.format(Math.acos(pote*dist*dist/ (coulumbsCnst*Math.cos(theta))))+" C-m";
            if (res.contains("E")){
                result.setText(expConverter(res));
            } else{
                result.setText(res);
            }
        } else if (entry3.getText().toString().equals("*")){
            double theta = Math.toRadians(Double.parseDouble(entry1.getText().toString()));
            double dip = Double.parseDouble(entry2.getText().toString());
            double pote = Double.parseDouble(entry4.getText().toString());
            res += df.format(coulumbsCnst*dip*Math.cos(theta)/pote)+" m";
            if (res.contains("E")){
                result.setText(expConverter(res));
            } else{
                result.setText(res);
            }
        } else if (entry4.getText().toString().equals("*")){
            double theta = Math.toRadians(Double.parseDouble(entry1.getText().toString()));
            double dip = Double.parseDouble(entry2.getText().toString());
            double r = Double.parseDouble(entry2.getText().toString());
            res += df.format(coulumbsCnst*dip*Math.cos(theta)/r*r)+" D";
            if (res.contains("E")){
                result.setText(expConverter(res));
            } else result.setText(res);
        } else {
            Toast.makeText(context,
                    "Invalid Input! One of the entries have to be *",
                    Toast.LENGTH_LONG)
                    .show();
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }


    } public void homeIntent(View view){
        Intent intent = new Intent(dipolePotential.this, HomePage.class);
        startActivity(intent);
    }
}