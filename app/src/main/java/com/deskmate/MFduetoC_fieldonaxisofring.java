package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MFduetoC_fieldonaxisofring extends AppCompatActivity {
    private EditText eti1;
    private EditText etr1;
    private EditText etd1;
    private TextView tvResult10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_fdueto_c_fieldonaxisofring);
        eti1 = (EditText) findViewById(R.id.eti1);
        etr1 = (EditText) findViewById(R.id.etr1);
        etd1 = (EditText) findViewById(R.id.etd1);
        tvResult10 = (TextView) findViewById(R.id.tvResult10);
    }

    public void MFonAxisofRing(View view) {
        double i = Double.parseDouble(eti1.getText().toString());
        double r = Double.parseDouble(etr1.getText().toString());
        double d = Double.parseDouble(etd1.getText().toString());
        tvResult10.setText(String.valueOf(DeskmateRes.expConverter(Double.toString((4*(22/7)*Math.pow(10,-7))/(2*Math.pow(Math.pow(r,2)+Math.pow(d,2),1.5))   ))));
    }
    //        public void homeBTN(View view){
//        Intent intent = new Intent(EPndC_Capacitance.this, HomePage.class);
//        startActivity(intent);
//    }
}
