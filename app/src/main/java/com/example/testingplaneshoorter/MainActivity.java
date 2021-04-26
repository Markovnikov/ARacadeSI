package com.example.testingplaneshoorter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startGame(View v)
    {
        Log.d("ImageButton","Clicked");
        Intent intent = new Intent(this,StartGame.class);
        startActivity(intent);
        finish();
    }
}