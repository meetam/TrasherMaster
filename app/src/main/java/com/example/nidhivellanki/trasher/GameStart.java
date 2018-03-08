package com.example.nidhivellanki.trasher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GameStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);
        skate();
    }

    public void skate()
    {
        //plays the game
        int item = (int) (Math.random() * 8);

        switch(item)
        {
            case 0:
                Intent intent = new Intent(this, Apple.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, Banana.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, Can.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, Newspaper.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, Bottle.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, Battery.class);
                startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(this, TrashBag.class);
                startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(this, Chips.class);
                startActivity(intent7);
                break;
            default:
                break;
        }
    }

}
