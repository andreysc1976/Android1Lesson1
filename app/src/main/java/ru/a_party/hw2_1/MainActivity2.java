package ru.a_party.hw2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        CalendarView calendarView =  findViewById(R.id.calendarView);

        Calendar calendar = Calendar.getInstance();
        calendar.set(1976,10-1,10);

        calendarView.setDate(calendar.getTimeInMillis(),true,true);

        TextView textView = findViewById(R.id.editTextPhone);
        textView.setText("+7(967)2599161");

    }
}