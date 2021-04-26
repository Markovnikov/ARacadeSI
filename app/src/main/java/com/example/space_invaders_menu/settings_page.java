package com.example.space_invaders_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class settings_page extends AppCompatActivity {

    private Button toHome; // button back to the home page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);

        // this code sets up the button back to the home page
        toHome = (Button) findViewById(R.id.settings_back_button);
        toHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openHome();
            }
        });
    }

    // this code is the function to go back to the home page
    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}