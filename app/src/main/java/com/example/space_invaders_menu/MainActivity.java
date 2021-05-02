package com.example.space_invaders_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;




public class MainActivity extends AppCompatActivity {

    private Button toStart; // button to start the game
    private Button toSettings; // button to settings page
    private Button toScores;  // button to the scores page

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // code that sets up the settings button
        toSettings = (Button) findViewById(R.id.settings_button);
        toSettings.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                openSettings();
            }
        });


        // code that sets up the scores button
        toScores = (Button) findViewById(R.id.scores_button);
        toScores.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openScores();
            }
        });


        toStart = (Button) findViewById(R.id.start_button);
        toStart.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { toStart(); }
        });

    }

    // code for the settings button function
    public void openSettings() {
        Intent intent = new Intent(this, settings_page.class);
        startActivity(intent);
    }

    public void toStart() {
        Intent intent = new Intent(this,game_view.class);
        startActivity(intent);
    }


    // code for the scores button function
    public void openScores() {
        Intent intent = new Intent(this, highscores_page.class);
        startActivity(intent);
    }
}