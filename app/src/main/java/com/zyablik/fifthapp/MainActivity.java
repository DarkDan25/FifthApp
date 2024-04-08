package com.zyablik.fifthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] fruandveg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruandveg = getResources().getStringArray(R.array.fruandveg);

        ListView fruitsList = findViewById(R.id.fruits);
        ArrayAdapter<String> fruitsAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, fruandveg);
        fruitsList.setAdapter(fruitsAdapter);
        fruitsList.setOnItemClickListener((parent, view, position, id) -> {
            switch (position){
                case 0:
                    startActivity(new Intent(MainActivity.this, Apple.class));
                    break;
                case 1:
                    startActivity(new Intent(MainActivity.this, Tangerine.class));
                    break;
                case 2:
                    startActivity(new Intent(MainActivity.this, Pear.class));
                    break;
                case 3:
                    startActivity(new Intent(MainActivity.this, Tomato.class));
                    break;
                case 4:
                    startActivity(new Intent(MainActivity.this, Cucumber.class));
                    break;
                case 5:
                    startActivity(new Intent(MainActivity.this, Carrot.class));
                    break;
                default:
                    break;
            }

        });
    }
}