
package com.cookandroid.midterm1101143_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;



public class MainActivity extends AppCompatActivity {

    Chronometer chm;
    Button btnStart , btnEnd;
    RadioButton rdoCal, rdoTime;
    CalendarView calView;
    TimePicker tPicker;

    TextView tvYear, tvMonth, tvDay, tvHour, tvMin;
    int selectYear,selectMonth ,selectDay ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chm = (Chronometer)findViewById(R.id.chronometer1);
        btnStart = (Button)findViewById(R.id.btnStart);
        btnEnd = (Button)findViewById(R.id.btnEnd);
        rdoCal = (RadioButton)findViewById(R.id.rdoCal);
        rdoTime = (RadioButton)findViewById(R.id.rdoTime);
        tPicker = (TimePicker)findViewById(R.id.timePicker1);
        calView = (CalendarView)findViewById(R.id.calendarView1);
        tvYear = (TextView)findViewById(R.id.tvYear);
        tvMonth=(TextView)findViewById(R.id.tvMonth);
        tvDay=(TextView)findViewById(R.id.tvDay);
        tvHour=(TextView)findViewById(R.id.tvHour);
        tvMin=(TextView)findViewById(R.id.tvMinute);




        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chm.setBase(SystemClock.elapsedRealtime());
                chm.start();
                chm.setTextColor(Color.BLUE);


            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chm.stop();

                tvYear.setText(" "+selectYear);
                tvMonth.setText(" "+selectMonth);
                tvDay.setText(" "+selectDay);

                tvHour.setText(Integer.toString(tPicker.getCurrentHour()));
                tvMin.setText(Integer.toString(tPicker.getCurrentMinute()));



            }
        });

        rdoCal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calView.setVisibility(View.VISIBLE);
                tPicker.setVisibility(View.INVISIBLE);

            }
        });

        


        rdoTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.VISIBLE);
                calView.setVisibility(View.INVISIBLE);
            }
        });




        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                selectYear = year;
                selectMonth = month +1;
                selectDay = day;
            }
        });





    }







}