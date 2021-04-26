package com.example.space_invaders_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class highscores_page extends AppCompatActivity {

    private Button back2Home; // button for going back to the home page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscores_page);


        // this code sets up the button back to the home page
        back2Home = (Button) findViewById(R.id.backHomebutton);
        back2Home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openHome2();
            }
        });

    }

    // this code is the function to go back to the home page
    public void openHome2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}