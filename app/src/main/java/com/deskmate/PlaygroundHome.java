package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PlaygroundHome extends AppCompatActivity {

    Button cals_Btn, chest_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playground_home);

        cals_Btn = findViewById(R.id.cals_Btn);
        chest_btn = findViewById(R.id.chestW_Btn);
        cals_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaygroundHome.this, Intermediate_Calesthenics.class);
                startActivity(intent);
            }


        });
        chest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaygroundHome.this, Intermediate_BodyBuilding.class);
                startActivity(intent);
            }
        });

    }
    // manifest for notification
    // firebase for chat data
    // share pictures inside a chat room
    // scroll(constraint) for normal
    // scroll(relative) for chat
    // push login inside playground
    // firebase login/register
    // calendar for monitor your progress (graphQL)
    // Spotify api for study time music
    // reminders for students
    // Complete calendar experience

}