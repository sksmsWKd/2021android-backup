package com.cookandroid.multiactivitycalculator;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.xml.transform.Result;

@SuppressWarnings("deprecation")
public class SecondActivity extends AppCompatActivity {


      //asdasdadqwedasdddasd


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second 액티비티");

        //★ 입력하기, 메인액티비티로부터 받은 두 값을 더한다
        Intent inIntent = getIntent();
        Integer Cal = inIntent.getIntExtra("Cal",0);
        int calValue  = 0;
        switch (Cal){

            case R.id.rdoAdd:

                calValue = inIntent.getIntExtra("Num1", 0)
                        + inIntent.getIntExtra("Num2", 0);
                break;

            case R.id.rdoSub:

                calValue = inIntent.getIntExtra("Num1", 0)
                        - inIntent.getIntExtra("Num2", 0);
                break;
            case R.id.rdoMul:

                calValue = inIntent.getIntExtra("Num1", 0)
                        * inIntent.getIntExtra("Num2", 0);
                break;
            case R.id.rdoDiv:

                calValue = inIntent.getIntExtra("Num1", 0)
                        / inIntent.getIntExtra("Num2", 0);
                break;


        }
        final int retValue = calValue;


        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //★ 입력하기, 인텐트를 생성하고 더한 값을 넣어 , setResult()로 메인 액티비티로 돌려준다.
                Intent outIntent = new Intent(getApplicationContext(),MainActivity.class);
                outIntent.putExtra("Hap", retValue);
                setResult(RESULT_OK,outIntent);
                finish();

            }
        });
    }




}