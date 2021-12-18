package com.cookandroid.guitarwithbeat;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {



    Button buttonC5;
    Button buttonG7,buttonAs5,
            buttonA,   buttonE,
            buttonC2,
            buttonD2,
            buttonA2,
            buttonG2,
            buttonB,
            buttonD3,
            buttonA3,
            buttonE2,
            buttonB2,
            buttonFs,
            buttonC3,
            buttonG3,
            buttonAs2,
            buttonF2,
            buttonC4,
            buttonDs2,
            buttonD4,
            buttonF3,
            buttonG4,
            buttonD7,
            buttonAs4,
            buttonA4,
            buttonD5,
            buttonF4,
            buttonG6,
            buttonD8,
            buttonAs3,
            buttonA6,
            buttonE3,
            buttonB3,
            buttonD6,
            buttonA5,
            buttonE4,
            buttonG5,
            buttonF,
            buttonC,
            buttonGs,
            buttonDs,
            buttonAs,
            buttonF6,
            buttonD,
            buttonG,
            buttonF5,
            button1;



    MediaPlayer mp;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);




        setContentView(R.layout.activity_main);








    }

    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        button1 = (Button) findViewById(R.id.button1);

        buttonF= (Button) findViewById(R.id.buttonF);
        buttonC= (Button) findViewById(R.id.buttonC);
        buttonGs= (Button) findViewById(R.id.buttonGs);
        buttonDs= (Button) findViewById(R.id.buttonDs);
        buttonAs= (Button) findViewById(R.id.buttonAs);
        buttonF6= (Button) findViewById(R.id.buttonF6);
        buttonD= (Button) findViewById(R.id.buttonD);
        buttonG= (Button) findViewById(R.id.buttonG);
        buttonF5= (Button) findViewById(R.id.buttonF5);
        buttonC5= (Button) findViewById(R.id.buttonC5);
        buttonG7= (Button) findViewById(R.id.buttonG7);
        buttonAs5= (Button) findViewById(R.id.buttonAs5);
        buttonA= (Button) findViewById(R.id.buttonA);
        buttonE= (Button) findViewById(R.id.buttonE);
        buttonC2= (Button) findViewById(R.id.buttonC2);
        buttonD2= (Button) findViewById(R.id.buttonD2);
        buttonA2= (Button) findViewById(R.id.buttonA2);
        buttonG2= (Button) findViewById(R.id.buttonG2);
        buttonB= (Button) findViewById(R.id.buttonB);
        buttonD3= (Button) findViewById(R.id.buttonD3);
        buttonA3= (Button) findViewById(R.id.buttonA3);
        buttonE2= (Button) findViewById(R.id.buttonE2);
        buttonB2= (Button) findViewById(R.id.buttonB2);
        buttonFs= (Button) findViewById(R.id.buttonFs);
        buttonC3= (Button) findViewById(R.id.buttonC3);
        buttonG3= (Button) findViewById(R.id.buttonG3);
        buttonAs2= (Button) findViewById(R.id.buttonAs2);
        buttonF2= (Button) findViewById(R.id.buttonF2);
        buttonC4= (Button) findViewById(R.id.buttonC4);
        buttonDs2= (Button) findViewById(R.id.buttonDs2);
        buttonD4= (Button) findViewById(R.id.buttonD4);
        buttonF3= (Button) findViewById(R.id.buttonF3);
        buttonG4= (Button) findViewById(R.id.buttonG4);
        buttonD7= (Button) findViewById(R.id.buttonD7);
        buttonAs4= (Button) findViewById(R.id.buttonAs4);
        buttonA4= (Button) findViewById(R.id.buttonA4);
        buttonD5= (Button) findViewById(R.id.buttonD5);
        buttonF4= (Button) findViewById(R.id.buttonF4);
        buttonG6= (Button) findViewById(R.id.buttonG6);
        buttonD8= (Button) findViewById(R.id.buttonD8);
        buttonAs3= (Button) findViewById(R.id.buttonAs3);
        buttonA6= (Button) findViewById(R.id.buttonA6);
        buttonE3= (Button) findViewById(R.id.buttonE3);
        buttonB3= (Button) findViewById(R.id.buttonB3);
        buttonD6= (Button) findViewById(R.id.buttonD6);
        buttonA5= (Button) findViewById(R.id.buttonA5);
        buttonE4= (Button) findViewById(R.id.buttonE4);
        buttonG5= (Button) findViewById(R.id.buttonG5);




        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.f1);
                mp.start();
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.c1);
                mp.start();
            }
        });
        buttonGs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.g2);
                mp.start();
            }
        });
        buttonDs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d1);
                mp.start();
            }
        });
        buttonAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a1);
                mp.start();
            }
        });
        buttonF6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.f2);
                mp.start();
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d1);
                mp.start();
            }
        });
        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.g2);
                mp.start();
            }
        });
        buttonF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.f3);
                mp.start();
            }
        });
        buttonC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.c1);
                mp.start();
            }
        });
        buttonG7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.g3);
                mp.start();
            }
        });
        buttonAs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a3);
                mp.start();
            }
        });
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a4);
                mp.start();
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.e1);
                mp.start();
            }
        });
        buttonC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.c2);
                mp.start();
            }
        });
        buttonD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d3);
                mp.start();
            }
        });
        buttonA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a2);
                mp.start();
            }
        });
        buttonG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.g4);
                mp.start();
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.b1);
                mp.start();
            }
        });
        buttonD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d4);
                mp.start();
            }
        });
        buttonA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a4);
                mp.start();
            }
        });
        buttonE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.e2);
                mp.start();
            }
        });
        buttonB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.b2);
                mp.start();
            }
        });
        buttonFs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.f4);
                mp.start();
            }
        });
        buttonC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.c3);
                mp.start();
            }
        });
        buttonG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.g5);
                mp.start();
            }
        });
        buttonAs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a4);
                mp.start();
            }
        });
        buttonF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.f3);
                mp.start();
            }
        });
        buttonC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.c4);
                mp.start();
            }
        });
        buttonDs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d3);
                mp.start();
            }
        });
        buttonD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d4);
                mp.start();
            }
        });
        buttonF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.f4);
                mp.start();
            }
        });
        buttonG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.g4);
                mp.start();
            }
        });
        buttonD7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d5);
                mp.start();
            }
        });
        buttonAs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a4);
                mp.start();
            }
        });
        buttonA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a5);
                mp.start();
            }
        });
        buttonD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d6);
                mp.start();
            }
        });
        buttonF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.f5);
                mp.start();
            }
        });
        buttonG6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.g6);
                mp.start();
            }
        });
        buttonD8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d6);
                mp.start();
            }
        });
        buttonAs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a4);
                mp.start();
            }
        });
        buttonA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a5);
                mp.start();
            }
        });
        buttonE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.e5);
                mp.start();
            }
        });
        buttonB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.b4);
                mp.start();
            }
        });
        buttonD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.d5);
                mp.start();
            }
        });
        buttonA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.a6);
                mp.start();
            }
        });
        buttonE4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.e5);
                mp.start();
            }
        });
        buttonG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(getApplicationContext(),R.raw.g5);
                mp.start();
            }
        });
    }

}


//
//
//        프래그먼트나 그 안에서 Intent 등을 생성하면 getContext(), getApplicationContext()
//        둘 다 안먹힙니다!!
//        그럴 때는 getActivity().getApplicationContext() 사용하면 됩니다~!
//        Intent에서 getContext(), this 가 안먹힌다면
//        getActivity() 를 사용하면 됩니다~~!

