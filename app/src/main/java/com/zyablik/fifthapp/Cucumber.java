package com.zyablik.fifthapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cucumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cucumber);
        RecyclerView rView = findViewById(R.id.rlist);
        rView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> cucumbs = new ArrayList<>(Arrays.asList
                (getResources().getStringArray(R.array.cucumbers)));
        myAdapter adapter = new myAdapter(cucumbs);
        rView.setAdapter(adapter);
    }
}