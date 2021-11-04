package com.cookandroid.a1104_diary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker date;
    EditText edt;
    Button btn;
    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 일기장");

        date = (DatePicker)findViewById(R.id.date);
        edt = (EditText)findViewById(R.id.edt);
        btn = (Button)findViewById(R.id.btn);

        Calendar cal = Calendar.getInstance();
        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH );
        int cDay = cal.get(Calendar.DAY_OF_MONTH);

        date.init(cYear, cMonth, cDay, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
            title = Integer.toString(year)+"_"+Integer.toString(month)+"_"+Integer.toString(day);
            String str = readDiary(fileName);
            edtDiary.setText(str);
            btn.setEnabled(true);
            }
        });


    }

    String readDiary(String fName){


        return null;
    }
}