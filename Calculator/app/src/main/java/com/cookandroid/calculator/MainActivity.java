    package com.cookandroid.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btn1,btn2,btn3,btn4,btn5;
    TextView resultView;
    Double num1 ;
    Double num2  ;
    Double result =0.0;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = { R.id.BtnNum0,R.id.BtnNum1,R.id.BtnNum2,R.id.BtnNum3,R.id.BtnNum4,R.id.BtnNum5,
            R.id.BtnNum6,R.id.BtnNum7,R.id.BtnNum8,R.id.BtnNum9};
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btn1 = (Button) findViewById(R.id.BtnAdd);
        btn2 = (Button) findViewById(R.id.BtnSub);
        btn3 = (Button) findViewById(R.id.BtnMul);
        btn4 = (Button) findViewById(R.id.BtnDiv);
        btn5 = (Button) findViewById(R.id.BtnRem);

        resultView = (TextView) findViewById(R.id.TextResult);

//     btn1.setOnTouchListener(new View.OnTouchListener(){
//         @Override
//         public boolean onTouch(View view, MotionEvent motionEvent) {
//
//             num1 = edit1.getText().toString();
//             num2 = edit2.getText().toString();
//
//             result = Integer.parseInt(num1)+ Integer.parseInt(num2);
//             resultView.setText("계산 결과 : " + result.toString());
//             return false;
//         }
//     });

        for (i=0;i<numBtnIDs.length;i++){
            numButtons[i] = (Button)findViewById(numBtnIDs[i]);
        }
        for (i=0; i< numBtnIDs.length;i++){
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    if (edit1.isFocused()==true)
                    {
                        num1= Double.parseDouble(edit1.getText().toString() + numButtons[index].getText().toString());
                        edit1.setText(""+num1);
                    }
                    else if (edit2.isFocused()==true) {
                        num2 = Double.parseDouble(edit2.getText().toString() + numButtons[index].getText().toString());
                        edit2.setText(""+num2);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "먼저 에디트 텍스트를 선택해주세요",Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }

     btn1.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View view) {


             try {
                 num1 = Double.parseDouble(edit1.getText().toString().trim());
                 num2 = Double.parseDouble(edit2.getText().toString().trim());
             } catch (NumberFormatException e) {
                 e.printStackTrace();
             }

             if (num1==null||num2==null) {
                 Toast.makeText(getApplicationContext(),
                         "값을 입력하세요.",Toast.LENGTH_SHORT).show();
             } else {

            result = num1+num2;
            resultView.setText("계산 결과 : " + result);
         }
     }
     });

//     btn2.setOnTouchListener(new View.OnTouchListener(){
//         @Override
//         public boolean onTouch(View view, MotionEvent motionEvent) {
//
//             num1 = edit1.getText().toString();
//             num2 = edit2.getText().toString();
//             result = Integer.parseInt(num1) - Integer.parseInt(num2);
//             resultView.setText("계산 결과 : " + result.toString());
//             return false;
//         }
//     });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    num1 = Double.parseDouble(edit1.getText().toString().trim());
                    num2 = Double.parseDouble(edit2.getText().toString().trim());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                if (num1==null||num2==null) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요.",Toast.LENGTH_SHORT).show();
                } else {


                    result = num1 - num2;
                    resultView.setText("계산 결과 : " + result);
                }
            }
        });

//   btn3.setOnTouchListener(new View.OnTouchListener(){
//        @Override
//        public boolean onTouch(View view, MotionEvent motionEvent) {
//
//            num1 = edit1.getText().toString();
//            num2 = edit2.getText().toString();
//            result = Integer.parseInt(num1) * Integer.parseInt(num2);
//            resultView.setText("계산 결과 : " + result.toString());
//            return false;
//        }
//    });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    num1 = Double.parseDouble(edit1.getText().toString().trim());
                    num2 = Double.parseDouble(edit2.getText().toString().trim());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                if (num1==null||num2==null) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }  else {


                    result = num1* num2;
                    resultView.setText("계산 결과 : " + result);
                }
            }
        });

//        btn4.setOnTouchListener(new View.OnTouchListener(){
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) / Integer.parseInt(num2);
//                resultView.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    num1 = Double.parseDouble(edit1.getText().toString().trim());
                    num2 = Double.parseDouble(edit2.getText().toString().trim());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                if (num1==null||num2==null) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요.",Toast.LENGTH_SHORT).show();
                } else if (num2==0) {
                    Toast.makeText(getApplicationContext(),
                            "0으로 나눌수없습니다.", Toast.LENGTH_SHORT).show();
                } else {


                    result = num1 / num2;
                    resultView.setText("계산 결과 : " + result);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    num1 = Double.parseDouble(edit1.getText().toString().trim());
                    num2 = Double.parseDouble(edit2.getText().toString().trim());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                if (num1==null||num2==null) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요.",Toast.LENGTH_SHORT).show();
                } else if (num2==0) {
                    Toast.makeText(getApplicationContext(),
                            "0으로 나눌수없습니다.", Toast.LENGTH_SHORT).show();
                } else {


                    result = num1 % num2;
                    resultView.setText("계산 결과 : " + result);
                }
            }
        });


    }


}