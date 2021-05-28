package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.deskmate.DeskmateRes.df;

public class EquivalentRes extends AppCompatActivity {
    private EditText entry;
    private EditText entry2;
    private TextView parallel;
    private TextView series;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equivalent_res);
        entry = (EditText) findViewById(R.id.parallelRes);
        entry2 = (EditText) findViewById(R.id.seriesRes);
        parallel = (TextView) findViewById(R.id.parallelResis);
        series = (TextView) findViewById(R.id.seriesResis);
    }
    public void ParallelRes(View view){
        String[] par = entry.getText().toString().split(",");
        float sum = 0;
        for (String i:par) {
            sum+=(1/Float.parseFloat(i));
        }

        parallel.setText(Float.toString(Float.parseFloat(df.format(sum))) + " Ohms");
    }
    public void SeriesRes(View view){
        String[] par = entry2.getText().toString().split(",");
        float sum = 0;
        for (String i:par) {
            sum+=Float.parseFloat(i);
        }

        series.setText(Float.toString(Float.parseFloat(df.format(sum))) +" Ohms");
    }
    public void Home_Btn(View view){
        Intent intent = new Intent(EquivalentRes.this, EPndC_cylindricalcapacitor.class);
        startActivity(intent);
    }
}