package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MFduetoC_fieldatCentreofArc extends AppCompatActivity {
    private EditText etc3;
    private EditText etr2;
    private  EditText eta;
    private TextView tvResult11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_fdueto_c_fieldat_centreof_arc);
        etc3 = (EditText) findViewById(R.id.etc3);
        etr2 = (EditText) findViewById(R.id.etr2);
        eta = (EditText) findViewById(R.id.eta);
        tvResult11 = (TextView) findViewById(R.id.tvResult11);
    }

    public void MFatCentreofArc(View view) {
        double i = Double.parseDouble(etc3.getText().toString());
        double r = Double.parseDouble(etr2.getText().toString());
        double a = Double.parseDouble(eta.getText().toString());
        tvResult11.setText(String.valueOf(DeskmateRes.expConverter(Double.toString((Math.pow(10,-7)*i*a)/r   ))));
       // (Math.pow(10,-7)*i*a)/r
    }
    //        public void homeBTN(View view){
//        Intent intent = new Intent(MFduetoC_fieldatCentreofArc.this, HomePage.class);
//        startActivity(intent);
//    }
}