package com.example.paysafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.*;

public class MainActivity extends AppCompatActivity {
    private static int WELCOME_TIMEOUT = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent signIn = new Intent(MainActivity.this, SignIn.class);
                startActivity(signIn);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, WELCOME_TIMEOUT);
    }
}
