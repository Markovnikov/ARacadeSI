package com.example.space_invaders_menu;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

import com.google.ar.sceneform.ux.ArFragment;

public class game_view extends AppCompatActivity {

    private ArFragment arFragment;
    private Button shoot;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_view);
        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arFragment);

        arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {});

        shoot = (Button) findViewById(R.id.shootButton);
        shoot.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                shoot();
                //stub for adding to the users score on a successful hit
                if(true) {
                    score = addScore(3,score);
                }
            }
        });

    }

    public void shoot() {

        final MediaPlayer laser = MediaPlayer.create(this,R.raw.laser);
        Log.i("shootButton","clicked");
        laser.start();

    }

    public int addScore(int enemyType, int currentScore) {

        currentScore += (enemyType * 10);
        Log.i("Score:", String.valueOf(currentScore));
        return currentScore;
        
    }

}
