package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.deskmate.DeskmateRes.*;

public class Coulumbs_ES extends AppCompatActivity {
    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private EditText entry4;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coulumbs__e_s);
        entry1 = (EditText) findViewById(R.id.charge1);
        entry2 = (EditText) findViewById(R.id.charge2);
        entry3 = (EditText) findViewById(R.id.dist);
        //entry4 = (EditText) findViewById(R.id.force_cl);
        result = (TextView) findViewById(R.id.result_ef);
    }
    private void calcFunc(double q1, double q2, double r){

//        if (entry3.getText().toString().isEmpty()) {
//            result.setText(String.valueOf(com.deskmate.DeskmateRes.expConverter(Double.toString(Math.sqrt(DeskmateRes.coulumbsCnst * q1 * q2 / f)))+"m"));
//        } else if (entry1.getText().toString().isEmpty()){
//            result.setText(String.valueOf(com.deskmate.DeskmateRes.expConverter(Double.toString(f* (r * r)/(DeskmateRes.coulumbsCnst *q1)))+"C"));
//        } else if (entry2.getText().toString().isEmpty()){
//            result.setText(String.valueOf(com.deskmate.DeskmateRes.expConverter(Double.toString(f* (r * r)/(DeskmateRes.coulumbsCnst *q2)))+"C"));
//        } else if (entry4.getText().toString().isEmpty()){
//            result.setText(String.valueOf(com.deskmate.DeskmateRes.expConverter(Double.toString(Math.sqrt(DeskmateRes.coulumbsCnst * q1 * q2 / (r*r))))+"N"));
//        }
        result.setText(String.valueOf(expConverter(Double.toString(9*Math.pow(10,9) * q1 * q2 / (r*r)))+" N"));
    }

    public void Coulumbs_es(View view){
// add variable calculators

        double q1 = Double.parseDouble(entry1.getText().toString());
        double q2 = Double.parseDouble(entry2.getText().toString());
        double r = Double.parseDouble(entry3.getText().toString());
        //double f = Double.parseDouble(entry4.getText().toString());
        calcFunc(q1, q2, r);


    }

}