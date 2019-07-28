package com.example.st1_normalmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void move (View view) {
        View vCircle= findViewById(R.id.vCircle);

        if (i==0) {
            Animation translate= AnimationUtils.loadAnimation(this, R.anim.translate);
            vCircle.startAnimation(translate);
            i++;
        }

        else {
            Animation translatereverse= AnimationUtils.loadAnimation(this, R.anim.translatereverse);
            vCircle.startAnimation(translatereverse);
            i--;
        }
    }
}
