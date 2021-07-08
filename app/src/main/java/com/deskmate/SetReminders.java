package com.deskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class SetReminders extends AppCompatActivity {

    ImageView cal;
    int y, m, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_reminders);

        cal = (findViewById(R.id.cal));

        final Calendar c = Calendar.getInstance();
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y = c.get(Calendar.YEAR);
                m = c.get(Calendar.MONTH)+1;
                d = c.get(Calendar.DAY_OF_MONTH);
            }
        });
    }
}