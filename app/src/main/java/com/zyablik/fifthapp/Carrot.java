package com.zyablik.fifthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Carrot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrot);

        Spinner spin = findViewById(R.id.spinner);
        String [] carrots = getResources().getStringArray(R.array.carrots);
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, carrots);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
    }
}