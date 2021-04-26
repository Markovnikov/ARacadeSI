package com.example.testingplaneshoorter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Plane {
    Bitmap plane[] = new Bitmap[15];
    int planeX,planeY,velocity,planeFrame;
    int basePlaneY = 0;
    Random random;

    public Plane(Context context) {
        plane[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.spaceship_2);
        random = new Random();
        resetPosition();
    }
    public Bitmap getBitmap(){
        return plane[planeFrame];
    }
    public int getWidth(){
        return plane[0].getWidth();
    }
    public int getHeight(){
        return plane[0].getHeight();
    }
    public void resetPosition(){
        planeX = GameView.dWidth + random.nextInt(1200);
        planeY = basePlaneY + random.nextInt(300);
        velocity = 8 + random.nextInt(13);
        planeFrame = 0;
        basePlaneY += 50;
    }
}
