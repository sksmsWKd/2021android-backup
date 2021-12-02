package com.cookandroid.basicthread;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressBar pb1, pb2;
        final Button btn;
        pb1 = (ProgressBar) findViewById(R.id.pb1);
        pb2 = (ProgressBar) findViewById(R.id.pb2);
        btn = (Button) findViewById(R.id.button1);

        //★ 입력하기.  btn 클릭시 100번 반복.


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread() {
                    @Override
                    public void run() {
                        for (int i = pb1.getProgress(); i < 100; i += 2) {
                            pb1.setProgress(pb1.getProgress() + 2);
                            SystemClock.sleep(300);
                        }
                    }
                }.start();


//            runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            });

                new Thread() {
                    @Override
                    public void run() {
                        for (int i = pb2.getProgress(); i < 100; i += 1) {
                            pb2.setProgress(pb2.getProgress() + 1);
                            SystemClock.sleep(300);
                        }
                    }
                }.start();
            }
        });


        }
    }

