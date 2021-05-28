package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LOM_Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lom_nav);
    }
    public void FirstEquationBtn(View view){
        Intent intent = new Intent(LOM_Nav.this, LOMEq1.class);
        startActivity(intent);
    }
    public void SecEquationBtn(View view){
        Intent intent = new Intent(LOM_Nav.this, LOMEq2.class);
        startActivity(intent);
    }
    public void ThirdEquationBtn(View view){
        Intent intent = new Intent(LOM_Nav.this, LOMEq3.class);
        startActivity(intent);
    }
}