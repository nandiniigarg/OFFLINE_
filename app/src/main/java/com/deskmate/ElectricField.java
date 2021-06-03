package com.deskmate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ElectricField extends AppCompatActivity {
    private EditText chrg;
    private EditText dista;
    private EditText efo;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Context context = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric_field);
        chrg = (EditText) findViewById(R.id.charge);
        dista = (EditText) findViewById(R.id.distance);
        efo = (EditText) findViewById(R.id.distance2);
        res = (TextView) findViewById(R.id.result_ef);

    }public void calc_EF (View view){
        Context context = getApplicationContext();

        String final_res= ElectroStatics.ElectricField(chrg.getText().toString(), dista.getText().toString(), efo.getText().toString());
        if (final_res.equals("ERROR")){
            Toast.makeText(context,
                    "Invalid Input! One of the entries have to be *",
                    Toast.LENGTH_LONG)
                    .show();
            Intent intent = getIntent();
            finish();

            startActivity(intent);
        } else{
            res.setText(final_res);
        }
    }
    public void homeBTn(View view){
        Intent intent = new Intent(ElectricField.this, HomePage.class);
        startActivity(intent);
    }
}