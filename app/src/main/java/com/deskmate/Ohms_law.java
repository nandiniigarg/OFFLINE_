package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ohms_law extends AppCompatActivity {

    private EditText edtN1, edtN2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohms_law);
        edtN1 = (EditText) findViewById(R.id.edtN1);
        edtN2 = (EditText) findViewById(R.id.edtN2);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    public void btnCalc(View view) {

        Double I = Double.parseDouble(edtN1.getText().toString());
        double R = Double.parseDouble(edtN2.getText().toString());
        double V = I * R;
        tvResult.setText(String.valueOf(V + "V"));

    }

    public void homeBTN(View view){
        Intent intent = new Intent(Ohms_law.this, HomePage.class);
        startActivity(intent);
    }
}