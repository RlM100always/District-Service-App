package com.example.districtservice.splash_screen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.districtservice.division_recycler_view.DivissionActivity;
import com.example.districtservice.R;

public class SplashActivity extends AppCompatActivity {

    private static final int DURATION =1000 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar= getSupportActionBar();
        if(actionBar !=null){
            actionBar.hide();
        }

        Thread thred=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5*DURATION);
                    Intent intent = new Intent(SplashActivity.this, DivissionActivity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });thred.start();







    }
}