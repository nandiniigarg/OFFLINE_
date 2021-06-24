package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Wbridge extends AppCompatActivity {

    private EditText edtN1, edtN2, edtN3,edtN4;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wbridge);
        edtN1 = (EditText) findViewById(R.id.R1);
        edtN2 = (EditText) findViewById(R.id.R2);
        edtN3 = (EditText) findViewById(R.id.R3);
        edtN4 = (EditText) findViewById(R.id.R4);
        tvResult =  (TextView) findViewById(R.id.TvResult);
    }


    public void btnCalc(View view) {

        String res = Current_Electricity.Wbridge(edtN1.getText().toString() , edtN2.getText().toString(), edtN3.getText().toString(),edtN4.getText().toString() );
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

    public void homeBTN(View view) {
        Intent intent = new Intent(Wbridge.this, HomePage.class);
        startActivity(intent);
    }
}