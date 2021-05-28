package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ohms_law extends AppCompatActivity {

    private EditText edtN1, edtN2, edtN3;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohms_law);
        edtN1 = (EditText) findViewById(R.id.edtN1);
        edtN2 = (EditText) findViewById(R.id.edtN2);
        edtN3 = (EditText) findViewById(R.id.edtN3);
        tvResult = (TextView) findViewById(R.id.tvResult);

    }

    public void btnCalc(View view) {
        String res = Current_Electricity.OhmsLaw(edtN3.getText().toString() , edtN1.getText().toString(), edtN2.getText().toString() );
        Context context = getApplicationContext();
        if (res.equals("ERROR")){
            Toast.makeText(context,
                    "Invalid Input! One of the entries have to be *",
                    Toast.LENGTH_LONG)
                    .show();
            Intent intent = getIntent();
            finish();

            startActivity(intent);
        } else{
            tvResult.setText(res);
        }
    }

    public void homeBTN(View view){
        Intent intent = new Intent(Ohms_law.this, HomePage.class);
        startActivity(intent);
    }
}