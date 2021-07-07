package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SS_LOM_TEST04 extends AppCompatActivity {
    private EditText ansq4;
    private TextView ans4;
    private static DecimalFormat df = new DecimalFormat("0.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss_lom_test04);
        ansq4 = (EditText) findViewById(R.id.ansq4);
        ans4 = (TextView) findViewById(R.id.ans4);
    }
    private void calcFunction() {
        double a = Double.parseDouble(ansq4.getText().toString());
        String res = String.valueOf(Double.toString(Double.parseDouble(df.format(a))));
        if (res.contains("3")) {
            ans4.setText("Correct");
        } else
            ans4.setText("Incorrect. ANSWER=" + 3 + " Kg");
    }

    public void buttonans4(View view) {
        calcFunction();
    }
}