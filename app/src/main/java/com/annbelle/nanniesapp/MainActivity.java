package com.annbelle.nanniesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.annbelle.nanniesapp.nannies.NanniesActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hiding the status and action bars.
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();

        //initializing the textview called textIntro, we will need that reference to change it's background
        setContentView(R.layout.activity_main);
        txtIntro = findViewById(R.id.text_intro);
    }

    /**
     * Navigating to the list of nannies screen.
     * @param view
     */
    public void searchNanniesButtonClickHandler(View view) {
        navigateToNannies();
    }

    /**
     * Navigating to the list of nannies screen.
     */
    private void navigateToNannies() {
        Intent intent = new Intent(MainActivity.this, NanniesActivity.class);
        startActivity(intent);
    }

    /**
     * Inflating the whole menu
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    /**
     * Handling the menu items that will be clicked based on id.
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            //changing the background of the intro text into red.
            case R.id.id_menu_red:
                txtIntro.setBackgroundColor(getResources().getColor(R.color.red));
                return true;
            //changing the background of the intro text into green.
            case R.id.id_menu_green:
                txtIntro.setBackgroundColor(getResources().getColor(R.color.green));
                return true;
            //changing the background of the intro text into blue.
            case R.id.id_menu_blue:
                txtIntro.setBackgroundColor(getResources().getColor(R.color.blue));
                return true;
            //navigate to nannies activity
            case R.id.id_menu_nannies:
                navigateToNannies();
                return true;
            //this one is placeholder maybe will need it later
            case R.id.id_menu_extra:
                navigateToNannies(); // this will be changed in the future
                return true;
            //this one is placeholder maybe will need it later
            case R.id.id_menu_extra_2:
                navigateToNannies(); // this will be changed in the future, it's just a placeholder
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}