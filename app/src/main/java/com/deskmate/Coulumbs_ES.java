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

public class Coulumbs_ES extends AppCompatActivity {
    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private EditText entry4;
    private TextView result;
    public static final DecimalFormat df = new DecimalFormat("0.00");

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
    private void calcFunc() {
        Context context = getApplicationContext();
        String final_res = ElectroStatics.CoulumbsLaw(entry1.getText().toString(), entry2.getText().toString(),
                entry3.getText().toString(), entry4.getText().toString());
        if (final_res.equals("ERROR")){
            Toast.makeText(context,
                    "Invalid Input! One of the entries have to be *",
                    Toast.LENGTH_LONG)
                    .show();
            Intent intent = getIntent();
            finish();

            startActivity(intent);
        } else{
            result.setText(final_res);
        }
    }

    public void Coulumbs_es(View view){

        calcFunc();


    }
    public void homeIntent(View view){
        Intent intent = new Intent(Coulumbs_ES.this, HomePage.class);
        startActivity(intent);
    }

}