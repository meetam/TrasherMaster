package com.example.nidhivellanki.trasher;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.skaterboy);
        mediaPlayer.start();
    }

    public void startGame (View view) {
        Intent intent = new Intent(this, GameStart.class);
        startActivity(intent);
    }
}
