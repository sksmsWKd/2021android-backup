package com.cookandroid.a1109ch10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvID,tvPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        tvID=findViewById(R.id.tvId);
        tvPassword=findViewById(R.id.tvPassword);
        Button btnReturn = (Button)findViewById(R.id.btnReturn);

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        Integer pw = intent.getIntExtra("password",0000);

        tvID.setText(id.toString());
        tvPassword.setText(pw.toString());

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                finish();
            }
        });
    }
}