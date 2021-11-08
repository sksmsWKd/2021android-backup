package com.cookandroid.a1104_diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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





        title = Integer.toString(cYear)+"_"+Integer.toString(cMonth)+"_"+Integer.toString(cDay);
        String str = readDiary(title);
        edt.setText(str);
        btn.setEnabled(true);



        date.init(cYear, cMonth, cDay, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {

            title = Integer.toString(year)+"_"+Integer.toString(month)+"_"+Integer.toString(day);
            String str = readDiary(title);
                edt.setText(str);
            btn.setEnabled(true);
            }


        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileOutputStream outFs = openFileOutput(title, Context.MODE_PRIVATE);
                    String str = edt.getText().toString();
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), title+" 이 저장", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

    }




    String readDiary(String fName){
        String content = null;
        FileInputStream infs;
        try{
            infs = openFileInput(title);
            byte[] txt = new byte[50];
            infs.read(txt);
            infs.close();
            content = (new String(txt));
            btn.setText("수정하기");
        }catch (IOException e){
            edt.setHint("일기 없음");
            btn.setText("새로 저장");
        }
        return content;
    }
}