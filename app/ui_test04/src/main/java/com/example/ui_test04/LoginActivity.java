package com.example.ui_test04;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView tv_user;
    private TextView tv_pwd;
    private EditText dt_user;
    private EditText dt_pwd;
    private Button btn_login;
    private Button btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       btn_login=(Button) findViewById(R.id.btn_login);
        btn_reset=(Button)findViewById(R.id.btn_reset);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=((EditText) findViewById(R.id.text_user)).getText().toString();
                String pwd=((EditText)findViewById(R.id.text_pwd)).getText().toString();

                switch (v.getId()){
                    case R.id.btn_login:
                        if (user.equals("admin")&&pwd.equals("admin")){
                            Intent intent = new Intent(LoginActivity.this, SuccessActivity.class);
                            intent.putExtra("userName",user);
                            intent.putExtra("password",pwd);
                            startActivity(intent);
                        }
                        else{
                            AlertDialog.Builder dialog=new AlertDialog.Builder(LoginActivity.this);
                            dialog.setTitle("错误提示");
                            dialog.setMessage("用户名和密码不匹配");
                            dialog.setCancelable(false);
                            dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {


                                }
                            });
                            dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                            dialog.show();
                        }
                        break;
                    default:
                        break;

                }
            }
        });
    }
}