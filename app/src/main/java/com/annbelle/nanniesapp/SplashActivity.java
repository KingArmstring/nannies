package com.annbelle.nanniesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.rbddevs.splashy.Splashy;

public class SplashActivity extends AppCompatActivity {

    /**
     * The onCreate method, the first method to be executed in any Activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hiding the toolbar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        splash(); // accomplishing the splash action
    }

    /**
     * The method responsible for the splash action
     */
    public void splash() {
        new Splashy(this)
            .setLogo(R.drawable.ic_nanny) // adding the logo which to be added I had to get svg image and create vector asset out of it.
            .setBackgroundColor(R.color.purple_200) // background color is coming from the colors xml file
            .setTitle("Nannies")
            .setSubTitle("implementation by Annabelle")
            .setSubTitleColor(R.color.white)
            .setSubTitleItalic(true) //changing the subtitle to italic
            .setTitleColor(R.color.black)
            .showProgress(true) //showing progressBar
            .setProgressColor(R.color.black) // changing the color of the progressBar to black
            .setAnimation(Splashy.Animation.SLIDE_IN_TOP_BOTTOM, 1)
            .setDuration(4000) //setting the duration of the animation because the duration field associated with setAnimation method is not working.
            .show();

        setCallback();
    }

    /**
     * This method is responsible for providing callback method to be executed once the animation ends.
     */
    private void setCallback() {
        Splashy.Companion.onComplete(() -> {
            //travelling to next activity
            startActivity(new Intent(
                SplashActivity.this,
                MainActivity.class
            ));
            //destroying this activity so that when the use clicks the back button, he/she does not come back here.
            finish();
        });
    }
}