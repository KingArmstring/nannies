package com.annbelle.nanniesapp.nannies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.annbelle.nanniesapp.R;

import java.util.ArrayList;
import java.util.List;

public class NanniesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    NanniesListAd adapter;
    List<Nanny> nannies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nannies);

        //filling the list with some dummy data.
        nannies.add(new Nanny("Luna", "Lovegood", R.drawable.ic_nanny));
        nannies.add(new Nanny("Hermione", "Granger", R.drawable.ic_nanny));
        nannies.add(new Nanny("Name 3", "Desc 3", R.drawable.ic_nanny));
        nannies.add(new Nanny("Name 4", "Desc 4", R.drawable.ic_nanny));
        nannies.add(new Nanny("Name 5", "Desc 5", R.drawable.ic_nanny));
        nannies.add(new Nanny("Name 6", "Desc 6", R.drawable.ic_nanny));
        nannies.add(new Nanny("Name 6", "Desc 6", R.drawable.ic_nanny));
        nannies.add(new Nanny("Name 6", "Desc 6", R.drawable.ic_nanny));
        nannies.add(new Nanny("Name 6", "Desc 6", R.drawable.ic_nanny));
        nannies.add(new Nanny("Name 6", "Desc 6", R.drawable.ic_nanny));
        nannies.add(new Nanny("Name 6", "Desc 6", R.drawable.ic_nanny));

        //adapter creation, the adapter is the controller of the list.
        adapter = new NanniesListAd(this, nannies);

        //setting up the list.
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //attaching the adapter
        recyclerView.setAdapter(adapter);
    }
}