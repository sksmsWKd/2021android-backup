package com.cookandroid.imagetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView text1,text2;
    CheckBox chkAgree;
    RadioGroup rdGroup;
    RadioButton rdBtn1, rdBtn2, rdBtn3;
    ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.Text1);
        text2 = (TextView)findViewById(R.id.Text2);
        chkAgree = (CheckBox)findViewById(R.id.agree);
        rdGroup = (RadioGroup)findViewById(R.id.selectGroup);
        rdBtn1 = (RadioButton)findViewById(R.id.rdDOG);
        rdBtn2 = (RadioButton)findViewById(R.id.rdCAT);
        rdBtn3 = (RadioButton)findViewById(R.id.rdRABBIT);
        img = (ImageView)findViewById(R.id.img);

        rdBtn1.setOnClickListener(change);
        rdBtn2.setOnClickListener(change);
        rdBtn3.setOnClickListener(change);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if(chkAgree.isChecked() == true){
                    text2.setVisibility(View.VISIBLE);
                    rdGroup.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);

                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rdGroup.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }



            }
        });





    }

    View.OnClickListener change = new View.OnClickListener() {
        public void onClick(View arg0) {
            switch (rdGroup.getCheckedRadioButtonId()) {
                case R.id.rdDOG :
                    img.setImageResource(R.drawable.dog);
                    break;
                case R.id.rdCAT:
                    img.setImageResource(R.drawable.cat);
                    break;
                case R.id.rdRABBIT:
                    img.setImageResource(R.drawable.rabbit);
                    break;

            }    }
    };




}