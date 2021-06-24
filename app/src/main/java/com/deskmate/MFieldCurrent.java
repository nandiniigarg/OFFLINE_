package com.deskmate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MFieldCurrent extends AppCompatActivity {
    private EditText entry1;
    private EditText entry2;
    private EditText entry3;
    private EditText entry4;
    private EditText entry5;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mfield_current);
        entry1 = (EditText) findViewById(R.id.CurrentMFC);
        entry2 = (EditText) findViewById(R.id.DistMFC);
        entry3 = (EditText) findViewById(R.id.Theta1MFC);
        entry4 = (EditText) findViewById(R.id.Theta2MFC);
        entry5 = (EditText) findViewById(R.id.MF_MFC);
        result = (TextView) findViewById(R.id.result_MFC);
    }


    public void MFieldCurrentBtn(View view){

        String final_res = Magnetics.magneticFieldStCurrent(entry2.getText().toString(), entry1.getText().toString(),
                entry3.getText().toString(), entry4.getText().toString(), entry5.getText().toString());
        if (final_res.equals("ERROR")){
            Context context = getApplicationContext();
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
        Intent intent = new Intent(MFieldCurrent.this, HomePage.class);
        startActivity(intent);
    }
}