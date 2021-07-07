package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SS_LOM_TEST03 extends AppCompatActivity {
    private EditText ansq3;
    private TextView ans3;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss_lom_test03);
        ansq3 = (EditText) findViewById(R.id.ansq3);
        ans3 = (TextView) findViewById(R.id.ans3);
    }
    private void calcFunction() {
        double a = Double.parseDouble(ansq3.getText().toString());
        String res = String.valueOf(Double.toString(Double.parseDouble(df.format(a))));
        if (res.contains("20")) {
            ans3.setText("Correct");
        } else
            ans3.setText("Incorrect. ANSWER=" + 20 + " N");
    }

    public void buttonans3(View view) {
        calcFunction();
    }
}