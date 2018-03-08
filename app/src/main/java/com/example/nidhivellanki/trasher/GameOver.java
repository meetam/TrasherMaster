package com.example.nidhivellanki.trasher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
    }

    public void retry(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
