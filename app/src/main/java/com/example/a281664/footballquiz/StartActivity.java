package com.example.a281664.footballquiz;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StartActivity extends AppCompatActivity {

    //private ImageButton startbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

       // startbutton = (ImageButton) findViewById(R.id.startbutton);

    }

    public void startQuiz(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void quitQuiz(View view){
        //android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}
