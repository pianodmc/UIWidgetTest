package com.example.ui_test04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {
    private TextView tv_user;
    private TextView tv_pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent=getIntent();
        String userName=intent.getStringExtra("userName");
        String password=intent.getStringExtra("password");
        tv_user=(TextView) findViewById(R.id.tv_user);
        tv_pwd=(TextView) findViewById(R.id.tv_pwd);
        tv_user.setText(userName);
        tv_pwd.setText(password);
    }
}