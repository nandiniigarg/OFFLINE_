package com.deskmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SetReminders extends AppCompatActivity {

    ImageView cal;
    int y, m, d;
    Button homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_reminders);

        cal = (findViewById(R.id.cal));

//        final Calendar c = Calendar.getInstance();
//        cal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                y = c.get(Calendar.YEAR);
//                m = c.get(Calendar.MONTH)+1;
//                d = c.get(Calendar.DAY_OF_MONTH);
////                DatePickerDialog g = new DatePickerDialog(SetReminders.this, new DatePickerDialog.OnDateSetListener() {
////                    @Override
////                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
////
////                        //ringAlarm()
////                    }
////                });
//            }
//        });
        getActionBar().hide();
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(SetReminders.this, HomePage.class);
                    startActivity(intent);
            }
        });
    }
}