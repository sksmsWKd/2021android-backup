package com.cookandroid.multiactivitycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.concurrent.RunnableScheduledFuture;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");


        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        RadioGroup rdoGroup = (RadioGroup) findViewById(R.id.rdoGroup);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText edtNum1 = (EditText) findViewById(R.id.edtNum1);
                EditText edtNum2 = (EditText) findViewById(R.id.edtNum2);

               Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
               intent.putExtra("Num1",Integer.parseInt(edtNum1.getText().toString()));
                intent.putExtra("Num2",Integer.parseInt(edtNum2.getText().toString()));

                Integer Cal = rdoGroup.getCheckedRadioButtonId();
                intent.putExtra("Cal",Integer.parseInt(String.valueOf(Cal)));
                startActivityForResult(intent,0);


            }
        });
    }

    //★입력하기. 세컨트 액티비티에서 setResult() 로 값을 돌려주면,  onActivityResult()가 실행
    // setResult()가 보낸 값이 RESULT_OK이면 인텐트에서 돌려 받은 값을 토스트 메시지로 출력


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode==RESULT_OK){
            int hap = data.getIntExtra("Hap",0);
            Toast.makeText(getApplicationContext(), "합계 : " + hap, Toast.LENGTH_SHORT).show();

        }
    }
}
