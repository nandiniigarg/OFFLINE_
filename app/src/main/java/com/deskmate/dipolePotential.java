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
        Context context = getApplicationContext();
        String final_res = ElectroStatics.DipolePotential(entry1.getText().toString(), entry2.getText().toString(), entry3.getText().toString(), entry4.getText().toString());
        if (final_res.equals("ERROR")){
            Toast.makeText(context,
                    "Invalid Input! One of the entries have to be *",
                    Toast.LENGTH_LONG)
                    .show();
            Intent intent = getIntent();
            finish();

            startActivity(intent);
        } else{
            result.setText(final_res);
        }
    }
    public void homeIntent(View view){
        Intent intent = new Intent(dipolePotential.this, HomePage.class);
        startActivity(intent);
    }
}