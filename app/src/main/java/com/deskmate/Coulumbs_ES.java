package com.deskmate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import static com.deskmate.DeskmateRes.*;
import static com.deskmate.DeskmateRes.expConverter;

public class Coulumbs_ES extends AppCompatActivity {
    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private EditText entry4;
    private TextView result;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coulumbs__e_s);
        entry1 = (EditText) findViewById(R.id.charge1);
        entry2 = (EditText) findViewById(R.id.charge2);
        entry3 = (EditText) findViewById(R.id.dist);
        entry4 = (EditText) findViewById(R.id.force_cl);
        result = (TextView) findViewById(R.id.result_ef);
    }
    @SuppressLint("SetTextI18n")
    private void calcFunc(){
        Context context = getApplicationContext();
        if (entry3.getText().toString().equals("*")) {
            double q1 = Double.parseDouble(entry1.getText().toString());
            double q2 = Double.parseDouble(entry2.getText().toString());
            double f = Double.parseDouble(entry4.getText().toString());

            String res = Double.parseDouble(df.format(Math.sqrt(coulumbsCnst * q1 * q2 / f))) +" m";
            if (res.contains("E")){
                result.setText(expConverter(res));
            } else{
                result.setText(res);
            }
            System.out.print(res);

        } else if (entry1.getText().toString().equals("*")){
            double q1 = Double.parseDouble(entry2.getText().toString());
            double r = Double.parseDouble(entry3.getText().toString());
            double f = Double.parseDouble(entry4.getText().toString());
            String res = Double.parseDouble(df.format(f * (r * r) / (coulumbsCnst * q1))) +" C";
            if (res.contains("E")){
                result.setText(expConverter(res));
            } else{
                result.setText(res);
            }
            System.out.print(res);

        } else if (entry2.getText().toString().equals("*")){
            double q2 = Double.parseDouble(entry1.getText().toString());
            double r = Double.parseDouble(entry3.getText().toString());
            double f = Double.parseDouble(entry4.getText().toString());
            String res = Double.parseDouble(df.format(f * (r * r) / (coulumbsCnst * q2))) +" C";
            if (res.contains("E")){
                result.setText(expConverter(res));
            } else{
                result.setText(res);
            }
            System.out.print(res);

        } else if (entry4.getText().toString().equals("*")){
            double q1 = Double.parseDouble(entry1.getText().toString());
            double q2 = Double.parseDouble(entry2.getText().toString());
            double r = Double.parseDouble(entry3.getText().toString());
            String res = Double.parseDouble(df.format(Math.sqrt((coulumbsCnst * q1 * q2 / (r * r))))) +" N";
            if (res.contains("E")){
                result.setText(expConverter(res));
            } else{
                result.setText(res);
            }

            System.out.print(res);

        } else {
            Toast.makeText(context,
                    "Invalid Input! One of the entries have to be *",
                    Toast.LENGTH_LONG)
                    .show();
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
        //result.setText(String.valueOf(expConverter(Double.toString(9*Math.pow(10,9) * q1 * q2 / (r*r)))+" N"));
    }

    public void Coulumbs_es(View view){
// add variable calculators

//        double q1 = Double.parseDouble(entry1.getText().toString());
//        double q2 = Double.parseDouble(entry2.getText().toString());
//        double r = Double.parseDouble(entry3.getText().toString());
//        double f = Double.parseDouble(entry4.getText().toString());
        calcFunc();


    }

}