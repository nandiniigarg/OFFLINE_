package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SS_LOM_TEST_05 extends AppCompatActivity {
    private EditText ansq5;
    private TextView ans5;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss_lom_test05);
        ansq5 = (EditText) findViewById(R.id.ansq5);
        ans5 = (TextView) findViewById(R.id.ans5);

    }
    private void calcFunction() {
        double a = Double.parseDouble(ansq5.getText().toString());
        String res = String.valueOf(Double.toString(Double.parseDouble(df.format(a))));
        if (res.contains("2.5")) {
            ans5.setText("Correct");
        } else
            ans5.setText("Incorrect. ANSWER=" + 2.5 + " N");
    }

    public void buttonans5(View view) {
        calcFunction();
    }
}