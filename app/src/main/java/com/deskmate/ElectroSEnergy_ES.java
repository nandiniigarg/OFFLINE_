package com.deskmate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ElectroSEnergy_ES extends AppCompatActivity {

    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private EditText entry4;
    private  TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electro_s_energy__e_s);
        entry1 = (EditText) findViewById(R.id.charge_ee);
        entry2 = (EditText) findViewById(R.id.distance_ee);
        entry3 = (EditText) findViewById(R.id.charge_ee2);
        entry4 = (EditText) findViewById(R.id.esEnergy);
        result = (TextView) findViewById(R.id.result_ee);
    }

    public void calcEE(View view) {
        Context context = getApplicationContext();
        String final_res = ElectroStatics.ElectroStaticEnergy(entry1.getText().toString(), entry3.getText().toString(),
                entry2.getText().toString(), entry4.getText().toString());
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
    public void homeIntent(View view){
        Intent intent = new Intent(ElectroSEnergy_ES.this, HomePage.class);
        startActivity(intent);
    }
}