package com.cookandroid.textviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MyListenerClass lin = new MyListenerClass();
        Button btn1;
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              Toast.makeText(getApplicationContext(),"클릭했네요",Toast.LENGTH_SHORT).show();
            }
        });

    }



//    class MyListenerClass implements View.OnClickListener{
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(getApplicationContext(),"클릭했네요",Toast.LENGTH_SHORT).show();
//           //앱의 중요내용을 주겠다 / 띄울 메시지 / 시간
//        }
//    }

//    public void test(View view){
//        Toast.makeText(getApplicationContext(),"클릭했네요",Toast.LENGTH_SHORT).show();
//                //앱의 중요내용을 주겠다 / 띄울 메시지 / 시간
//    }


}