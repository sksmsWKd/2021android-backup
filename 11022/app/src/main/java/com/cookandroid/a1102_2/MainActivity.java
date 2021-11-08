package com.cookandroid.a1102_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    Button btnWrite, btnRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWrite = (Button)findViewById(R.id.btnwrite);
        btnRead = (Button)findViewById(R.id.btnread);

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileOutputStream outFs = openFileOutput("file2.txt", Context.MODE_PRIVATE);
                    String str = "송재현";
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), "file생성됨", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {

/*
파일읽기 : openFileInput() 메소드 사용 -> FileInputStream을 반환한다. -> write()메소드사용
파일쓰기 : openFileOutput() 메소드 사용 -> FileOutputStream을 반환한다. -> read()메소드사용
 */
                }
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    FileInputStream inFs = openFileInput("file.text");
                    byte[] txt = new byte[30];
                    inFs.read(txt);
                    String str = new String(txt);
                    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                    inFs.close();

                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "파일 없음", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}