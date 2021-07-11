package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StudyHome extends AppCompatActivity {

    Button LOMStudy_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_home);
        LOMStudy_btn = findViewById(R.id.LOMStudyTheory_btn);
        LOMStudy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyHome.this, SS_LOM_THEORY_01.class);
                startActivity(intent);
            }

        });
    }
//    public void homeIntent(View view){
//        Intent intent = new Intent(StudyHome.this, HomePage.class);
//        startActivity(intent);
//    }
//    public void lomStudyBtn (View view) {
//        Intent intent = new Intent(StudyHome.this, SS_LOM_THEORY_01.class);
//        startActivity(intent);
//    }
}