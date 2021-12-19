package com.cookandroid.guitarwithbeatnoerror;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
    }

    public void setFrag1(View v){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft=manager.beginTransaction();
        ft.replace(R.id.frame_container, new Fragment1(),"one");
        ft.commitAllowingStateLoss();

    }

    public void setFrag2(View v){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft=manager.beginTransaction();
        ft.replace(R.id.frame_container, new Fragment2(),"two");
        ft.commitAllowingStateLoss();
    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.btn1:
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.codelayout);
                dialog.setTitle("기타 코드표");
                dialog.show();
             return true;

            case R.id.btn2:

                moveTaskToBack(true);

                finish();

                android.os.Process.killProcess(android.os.Process.myPid());




                return true;
        }
        return false;
    }



}