package com.example.dennoh.appman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       Button btn_login=(Button) findViewById(R.id.login_btn);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeintent=new Intent(activity_login.this, MainActivity.class);
                startActivity(homeintent);
            }
        });
        Button btn_reg=(Button) findViewById(R.id.reg_btn);
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logactivity=new Intent(activity_login.this, (activity_signup.class));
                startActivity(logactivity);
            }
        });
        EditText txta=(EditText)findViewById(R.id.txta);
        EditText txt=(EditText) findViewById(R.id.txt);

    }

}
