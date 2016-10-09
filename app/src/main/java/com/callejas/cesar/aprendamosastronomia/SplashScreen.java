package com.callejas.cesar.aprendamosastronomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread temp = new Thread() {
            public void run(){
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent main = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(main);
                }
            }
        };
        temp.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();

    }
}
