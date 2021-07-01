package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SS_LOM_TEST_01 extends AppCompatActivity {
    private EditText ansq1;
    private TextView ans01;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss_lom_test01);
        ansq1 = (EditText) findViewById(R.id.ansq1);
        ans01 = (TextView) findViewById(R.id.ans01);
    }
    private void calcFunction() {
        double a = Double.parseDouble(ansq1.getText().toString());
        String res = String.valueOf(Double.toString(Double.parseDouble(df.format(a))));
        if (res.contains("9.8")) {
            ans01.setText("Correct");
        } else
            ans01.setText("Incorrect. ANSWER=" + 9.8);
    }

    public void buttonans1(View view) {
        calcFunction();
    }
}