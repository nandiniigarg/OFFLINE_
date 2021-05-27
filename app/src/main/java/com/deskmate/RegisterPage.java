
package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage);
    }
    public void homeBtn(View view) {
        Intent intent = new Intent(RegisterPage.this, HomePage.class);
        startActivity(intent);
    }
}