package com.annbelle.nanniesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.annbelle.nanniesapp.nannies.NanniesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hiding the status and action bars.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
    }

    /**
     * Navigating to the list of nannies screen.
     * @param view
     */
    public void searchNanniesButtonClickHandler(View view) {
        Intent intent = new Intent(MainActivity.this, NanniesActivity.class);
        startActivity(intent);
    }
}