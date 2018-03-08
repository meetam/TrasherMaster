package com.example.nidhivellanki.trasher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Newspaper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newspaper);
    }

    public void continueGame (View v) {
        Button b = (Button) v;
        String classification = b.getText().toString();

        if (classification.equals("Recycle"))
        {
            Intent intent = new Intent(this, GameStart.class);
            startActivity(intent);
        }

        else
        {
            //gameover
            Intent over = new Intent(this, GameOver.class);
            startActivity(over);
        }

    }
}