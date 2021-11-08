package com.cookandroid.a1102;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView name, email, textMessage;
    Button btn1;
    EditText edt1, edt2;

    View dialog1, toast1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView)findViewById(R.id.name);
        email = (TextView)findViewById(R.id.email);

        btn1 = (Button)findViewById(R.id.btn1);





        btn1.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {




                dialog1 = (View)View.inflate(MainActivity.this, R.layout.dialog1,null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_menu_allfriends);
                dlg.setView(dialog1);
                edt1 = (EditText)dialog1.findViewById(R.id.edt1);
                edt2 = (EditText)dialog1.findViewById(R.id.edt2);
                edt1.setText(name.getText().toString());
                edt2.setText(email.getText().toString());

                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        name.setText(edt1.getText().toString());
                        email.setText(edt2.getText().toString());
                    }
                });
                dlg.setNegativeButton(" 취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = new Toast(MainActivity.this);
                        // 윗줄의 용도는???
                        toast1 = (View)View.inflate(MainActivity.this,R.layout.toast1,null);
                        textMessage = (TextView)toast1.findViewById(R.id.textMessage);

                        textMessage.setText("취소했습니다");

                        toast.setView(toast1);
                        toast.show();

                    }
                });
                dlg.show();


            }
        });

    }
}