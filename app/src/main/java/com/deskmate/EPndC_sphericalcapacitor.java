package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EPndC_sphericalcapacitor extends AppCompatActivity {
    private EditText etir;
    private  EditText etor;
    private TextView tvResult4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_pnd_c_sphericalcapacitor);
        etir = (EditText) findViewById(R.id.etir);
        etor = (EditText) findViewById(R.id.etor);
        tvResult4 = (TextView) findViewById(R.id.tvResult4);

    }

    public void SCapacitance(View view) {
        double r1 = Double.parseDouble(etir.getText().toString());
        double r2 = Double.parseDouble(etor.getText().toString());
        tvResult4.setText(String.valueOf(DeskmateRes.expConverter(Double.toString((4*(22/7)*8.854*Math.pow(10,-12)*r1*r2)/(r2-r1)))));
//        double scap = (4*(22/7)*8.854*Math.pow(10,-12)*r1*r2)/(r2-r1);
//        tvResult4.setText(String.valueOf(scap));
    }
}