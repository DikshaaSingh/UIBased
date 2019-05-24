package com.example.uibased;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    TextView mydate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = findViewById(R.id.calendarView);
        mydate = findViewById(R.id.text);
       calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
           private CalendarView view;
           private int i1;
           private int i2;
           private int i3;

           @Override
           public void onSelectedDayChange(CalendarView view, int i1, int i2, int i3) {
               this.view = view;
               this.i1 = i1;
               this.i2 = i2;
               this.i3 = i3;
               String date=(i1+1)+"/" +i2 + "/" +i3;
              mydate.setText(date);
       }
       });
    }
}