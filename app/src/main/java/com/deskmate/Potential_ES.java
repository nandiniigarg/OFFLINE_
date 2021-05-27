package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class Potential_ES extends AppCompatActivity {
    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private TextView result;
    private static DecimalFormat df = new DecimalFormat("0.00");
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potential__e_s);
        entry1 = (EditText) findViewById(R.id.charge_ep);
        entry2 = (EditText) findViewById(R.id.dist_ep);
        entry3 = (EditText) findViewById(R.id.electrop);
        result = (TextView) findViewById(R.id.result_ep);
    }

    public void calcPotential_ES(View view) {
        result.setText(ElectroStatics.PotentialES(entry1.getText().toString(), entry2.getText().toString(), entry3.getText().toString() ));
    }
}
