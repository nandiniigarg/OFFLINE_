package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EPndC_Capacitance extends AppCompatActivity {
    private EditText etq1;
    private EditText etV1;
    private TextView tvResult8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_pnd_c__capacitance);
        etq1 = (EditText) findViewById(R.id.etq1);
        etV1 = (EditText) findViewById(R.id.etV1);
        tvResult8 = (TextView) findViewById(R.id.tvResult8);
    }

    public void Capacitance(View view) {
        double q = Double.parseDouble(etq1.getText().toString());
        double V = Double.parseDouble(etV1.getText().toString());
        double Result = q/V;
        tvResult8.setText(String.valueOf(Result)+"F");
    }
            public void homeBTN(View view){
        Intent intent = new Intent(EPndC_Capacitance.this, HomePage.class);
        startActivity(intent);
    }
}