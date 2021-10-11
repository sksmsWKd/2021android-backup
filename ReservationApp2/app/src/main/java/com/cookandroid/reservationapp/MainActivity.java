
package com.cookandroid.reservationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;



public class MainActivity extends AppCompatActivity {

    Chronometer chrono;
//    Button btnStart , btnEnd;
    RadioButton rdoCal, rdoTime;
//    CalendarView calView;
    TimePicker tPicker;
    DatePicker dPicker;
    TextView tvYear, tvMonth, tvDay, tvHour, tvMin;
    int selectYear,selectMonth ,selectDay ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chrono = (Chronometer)findViewById(R.id.chronometer1);
//        btnStart = (Button)findViewById(R.id.btnStart);
//        btnEnd = (Button)findViewById(R.id.btnEnd);
        rdoCal = (RadioButton)findViewById(R.id.rdoCal);
        rdoTime = (RadioButton)findViewById(R.id.rdoTime);
        dPicker = (DatePicker) findViewById(R.id.datePicker1);
        tPicker = (TimePicker)findViewById(R.id.timePicker1);

        tvYear = (TextView)findViewById(R.id.tvYear);
        tvMonth=(TextView)findViewById(R.id.tvMonth);
        tvDay=(TextView)findViewById(R.id.tvDay);
        tvHour=(TextView)findViewById(R.id.tvHour);
        tvMin=(TextView)findViewById(R.id.tvMin);
        rdoCal.setVisibility(View.INVISIBLE);
        rdoTime.setVisibility(View.INVISIBLE);
        tPicker.setVisibility(View.INVISIBLE);
//        calView.setVisibility(View.INVISIBLE);
        dPicker.setVisibility(View.INVISIBLE);


        rdoCal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.INVISIBLE);
                dPicker.setVisibility(View.VISIBLE);
            }
        });


        rdoTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.VISIBLE);
                dPicker.setVisibility(View.INVISIBLE);
            }
        });

        chrono.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);

                rdoCal.setVisibility(View.VISIBLE);
                rdoTime.setVisibility(View.VISIBLE);
              
            }
        });

        tvYear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);

                tvYear.setText(Integer.toString(dPicker.getYear()));
                tvMonth.setText(Integer.toString(1 + dPicker.getMonth()));
                tvDay.setText(Integer.toString(dPicker.getDayOfMonth()));

                tvHour.setText(Integer.toString(tPicker.getCurrentHour()));
                tvMin.setText(Integer.toString(tPicker.getCurrentMinute()));

                rdoCal.setVisibility(View.INVISIBLE);
                rdoTime.setVisibility(View.INVISIBLE);
                tPicker.setVisibility(View.INVISIBLE);
                dPicker.setVisibility(View.INVISIBLE);
            return false;
            }
        });

//        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
//                selectYear = year;
//                selectMonth = month +1;
//                selectDay = day;
//            }
//        });





    }







}