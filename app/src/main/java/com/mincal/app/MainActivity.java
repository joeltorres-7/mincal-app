package com.mincal.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Redirect to Home Activity

        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep(5*1000);

                    // After 5 seconds redirect to another intent

                    Intent i = new Intent(getBaseContext(), WelcomeActivity.class);
                    startActivity(i);

                    //Remove activity

                    finish();
                } catch (Exception e) {
                    Log.e(e.toString(), e.getMessage());
                }
            }
        };
        // start thread
        background.start();
    }
}