package com.example.testingplaneshoorter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Plane2 extends Plane{

    Bitmap[] plane = new Bitmap[10];

    public Plane2(Context context){
        super(context);
        plane[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.rock_50);
        resetPosition();
    }

    @Override
    public Bitmap getBitmap() {
        return plane[planeFrame];
    }

    @Override
    public int getWidth() {
        return plane[0].getWidth();
    }

    @Override
    public int getHeight() {
        return plane[0].getHeight();
    }

    @Override
    public void resetPosition() {
        planeX = -(200+random.nextInt(1500));
        planeY = 800+ random.nextInt(200);
        velocity = 5 + random.nextInt(21);
    }
}
