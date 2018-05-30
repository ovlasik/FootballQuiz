package com.example.a281664.footballquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StartActivity extends AppCompatActivity {
MediaPlayer mysong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mysong = MediaPlayer.create(StartActivity.this,R.raw.music);
    }

    public void startQuiz(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void quitQuiz(View view){
        //android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    public void PlayIT(View v){
        mysong.start();
    }

    //@Override
    //otected void onPause()
    //{
      //  super.onPause();
        //mysong.release();
    //}

}
