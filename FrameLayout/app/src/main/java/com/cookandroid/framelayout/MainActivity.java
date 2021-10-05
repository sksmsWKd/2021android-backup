package com.cookandroid.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView page1, page2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        page1 = (ImageView) findViewById(R.id.img1);
        page2 = (ImageView) findViewById(R.id.img2);

        page2.setVisibility(View.INVISIBLE);
    }

    public void onClicked(View view){
        switch (view.getId()){
            case R.id.btn_page1 :
                page1.setVisibility(View.VISIBLE);
                page2.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn_page2 :
                page2.setVisibility(View.VISIBLE);
                page1.setVisibility(View.INVISIBLE);
                break;

        }

    }


}