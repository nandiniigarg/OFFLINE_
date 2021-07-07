package com.deskmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SS_LOM_TEST02 extends AppCompatActivity {
    private EditText ansq2;
    private TextView ans2;
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss_lom_test02);
        ansq2 = (EditText) findViewById(R.id.ansq2);
        ans2 = (TextView) findViewById(R.id.ans2);
    }

    private void calcFunction() {
        double a = Double.parseDouble(ansq2.getText().toString());
        String res = String.valueOf(Double.toString(Double.parseDouble(df.format(a))));
        if (res.contains("45")) {
            ans2.setText("Correct");
        } else
            ans2.setText("Incorrect. ANSWER=" + 45);
    }

    public void buttonans2(View view) {
        calcFunction();
    }
}