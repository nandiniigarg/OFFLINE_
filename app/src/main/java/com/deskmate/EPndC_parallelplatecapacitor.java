package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EPndC_parallelplatecapacitor extends AppCompatActivity {
    private EditText etppca;
    private EditText etppcd;
    private TextView tvResult3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_pnd_c_parallelplatecapacitor);
        etppca = (EditText) findViewById(R.id.etppca);
        etppcd = (EditText) findViewById(R.id.etppcd);
        tvResult3 = (TextView) findViewById(R.id.tvResult3);
     }

    public void PPCapacitance(View view) {
        double n1 = Double.parseDouble(etppca.getText().toString());
        double n2 = Double.parseDouble(etppcd.getText().toString());
        tvResult3.setText(String.valueOf(DeskmateRes.expConverter(Double.toString(8.854*Math.pow(10,-12)*n1*n2))));

        
    }
//        public void homeBTN(View view){
//        Intent intent = new Intent(EPndC_energystoredincapacitor.this, HomePage.class);
//        startActivity(intent);
//    }
}