package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MFduetoC_fieldaatCentreofRing extends AppCompatActivity {
    private EditText etc4;
    private EditText etr3;
    private TextView tvResult12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_fdueto_c_fieldaat_centreof_ring);
        etc4 = (EditText) findViewById(R.id.etc4);
        etr3 = (EditText) findViewById(R.id.etr3);
        tvResult12 = (TextView) findViewById(R.id.tvResult12);
    }

    public void MFatCentreofRing(View view) {
        double i = Double.parseDouble(etc4.getText().toString());
        double r = Double.parseDouble(etr3.getText().toString());
        tvResult12.setText(String.valueOf(DeskmateRes.expConverter(Double.toString((2*(22/7)*Math.pow(10,-7)*i)/r   ))));
        //(2*(22/7)*Math.pow(10,-7)*i)/r
    }
    //        public void homeBTN(View view){
//        Intent intent = new Intent(MFduetoC_fieldaatCentreofRing.this, HomePage.class);
//        startActivity(intent);
//    }
}