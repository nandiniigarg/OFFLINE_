package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MFduetoC_fieldinsideaToroid extends AppCompatActivity {
    private EditText etn;
    private EditText etr4;
    private EditText etc5;
    private TextView tvResult13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_fdueto_c_fieldinsidea_toroid);
        etn = (EditText) findViewById(R.id.etn);
        etr4 = (EditText) findViewById(R.id.etr4);
        etc5 = (EditText) findViewById(R.id.etc5);
        tvResult13 = (TextView) findViewById(R.id.tvResult13);

    }

    public void MFinsideToroid(View view) {
        double N = Double.parseDouble(etn.getText().toString());
        double r = Double.parseDouble(etr4.getText().toString());
        double i = Double.parseDouble(etc5.getText().toString());
        tvResult13.setText(String.valueOf(DeskmateRes.expConverter(Double.toString((2*Math.pow(10,-7)*N*i)/r  ))));
        //(2*Math.pow(10,-7)*N*i)/r
    }
    //        public void homeBTN(View view){
//        Intent intent = new Intent(EPndC_Capacitance.this, HomePage.class);
//        startActivity(intent);
//    }
}