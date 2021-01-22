package com.annbelle.nanniesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.rbddevs.splashy.Splashy;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        splash();
    }
    public void splash() {
        new Splashy(this)
            .setLogo(R.drawable.ic_nanny)
            .setBackgroundColor(R.color.purple_200)
            .setTitle("Nannies")
            .setSubTitle("implementation by Annabelle")
            .setSubTitleColor(R.color.white)
            .setSubTitleItalic(true)
            .setTitleColor(R.color.black)
            .setProgressColor(R.color.black)
            .setAnimation(Splashy.Animation.SLIDE_IN_TOP_BOTTOM, 1000)
            .setDuration(4000)
            .showProgress(true)
            .setFullScreen(false)
            .show();
        Splashy.Companion.onComplete(new Splashy.OnComplete() {
            @Override
            public void onComplete() {
                startActivity(new Intent(
                    SplashActivity.this,
                    MainActivity.class
                ));
                finish();
            }
        });
    }
}