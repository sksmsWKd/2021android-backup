package com.cookandroid.viewfliffer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {


    Button autoStart,autoStop;
    ViewFlipper viewFlipper1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button autoStart = (Button)findViewById(R.id.autoStart);
        Button autoStop = (Button)findViewById(R.id.autoStop);

        ViewFlipper viewFlipper1 = (ViewFlipper)findViewById(R.id.viewFlipper1);


       viewFlipper1.setFlipInterval(1000);

        autoStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            viewFlipper1.startFlipping();

            }
        });

        autoStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper1.stopFlipping();

            }
        });
    }
}