package com.cookandroid.a1109ch10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edI, edP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNewActivity = (Button)findViewById(R.id.btnNewActivity);
        RadioButton rd1 = (RadioButton)findViewById(R.id.second);
        RadioButton rd2 = (RadioButton)findViewById(R.id.third);

        edI = (EditText) findViewById(R.id.etID);
        edP = (EditText)findViewById(R.id.etPassword);


        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;

                if(rd1.isChecked()==true){

                    intent = new Intent(getApplicationContext(),SecondActivity.class);

                    intent.putExtra("id",edI.getText().toString());
                    intent.putExtra("password",Integer.parseInt(edP.getText().toString()));

                    startActivity(intent);


                }else if(rd2.isChecked()==true){
                    intent = new Intent(getApplicationContext(),ThirdActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}