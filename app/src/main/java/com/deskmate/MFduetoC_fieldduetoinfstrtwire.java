package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MFduetoC_fieldduetoinfstrtwire extends AppCompatActivity {
    private EditText eti;
    private EditText etd;
    private TextView tvResult9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_fdueto_c_fieldduetoinfstrtwire);
        eti = (EditText) findViewById(R.id.eti);
        etd = (EditText) findViewById(R.id.etd);
        tvResult9 = (TextView) findViewById(R.id.tvResult9);

    }

    public void MFinfSTRTwire(View view) {
        double i = Double.parseDouble(eti.getText().toString());
        double d = Double.parseDouble(etd.getText().toString());
        //double result = (2*Math.pow(10,-7)*i)/d;
        tvResult9.setText(String.valueOf(DeskmateRes.expConverter(Double.toString((2*Math.pow(10,-7)*i)/d))));
    }
    //        public void homeBTN(View view){
//        Intent intent = new Intent(MFduetoC_fieldduetoinfstrtwire.this, HomePage.class);
//        startActivity(intent);
//    }
}