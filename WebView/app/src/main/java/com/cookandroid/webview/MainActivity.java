package com.cookandroid.webview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3;
    LinearLayout baseLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        baseLayout = findViewById(R.id.baseLayout);


        registerForContextMenu(btn1);
        registerForContextMenu(btn2);
        registerForContextMenu(btn3);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//         super.onCreateOptionsMenu(menu);
//
//        MenuInflater mInflater = getMenuInflater();
//        mInflater.inflate(R.menu.menu,menu);
////  뒤의 인자에는 아무것도 없는menu 였는데 아무것도없는ㄴ곳에 전개
//        return true;
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected( MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.itemRed:
//                baseLayout.setBackgroundColor(Color.RED);
//                return true;
//            case R.id.itemGreen:
//                baseLayout.setBackgroundColor(Color.GREEN);
//                return true;
//            case R.id.itemBlue:
//                baseLayout.setBackgroundColor(Color.BLUE);
//                return true;
//
//            case R.id.subRotate:
//                btn1.setRotation(45);
//                return true;
//            case R.id.subSize:
//                btn1.setScaleX(2);
//                return true;
//
//
//        }return false;
//
//    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);



//        MenuInflater cInflater = getMenuInflater();
        if (v==btn1){
            menu.setHeaderTitle("배경색 변경");
//            cInflater.inflate(R.menu.menu,menu);
            menu.add(0,1,0,"배경빨강");
       

//            cInflater.inflate(R.menu.menu2,menu);
            menu.add(0,2,0,"배경초록");



//            cInflater.inflate(R.menu.menu3,menu);
            menu.add(0,3,0,"배경파랑");
        }
        if(v==btn2){
            menu.setHeaderTitle("버튼조작");
            menu.add(0,4,0,"45도회전");
            menu.add(0,5,0,"2배확대");
        }
        if(v==btn3){

            menu.add(0,6,0,"원래대로");
        }


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case 1:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case 2:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case 3:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;

            case 4:
                btn1.setRotation(45);
                return true;
            case 5:
                btn1.setScaleX(2);
                return true;
            case 6:
                btn1.setRotation(0);
                btn1.setScaleX(1);
                baseLayout.setBackgroundColor(Color.WHITE);
        }return false;

    }

    //
//    EditText edtUrl;
//    Button btnGo, btnBack;
//    WebView web;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setIcon(R.drawable.yju_logo);
//
//        edtUrl=  (EditText)findViewById(R.id.edtUrl1);
//        btnGo = (Button)findViewById(R.id.btnGo);
//        btnBack = (Button)findViewById(R.id.btnBack);
//        web = (WebView)findViewById(R.id.webView1);
//
//        web.setWebViewClient(new CookWebViewClient());
//
//        WebSettings webSet = web.getSettings();
//        webSet.setJavaScriptEnabled(true);
//
//
//        btnGo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                web.loadUrl(edtUrl.getText().toString());
//            }
//        });
//
//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                web.goBack();
//            }
//        });
//
//    }
//
//    class CookWebViewClient extends WebViewClient{
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            return super.shouldOverrideUrlLoading(view, url);
//        }
//    }


}