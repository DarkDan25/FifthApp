package com.zyablik.fifthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class Apple extends AppCompatActivity {
    ArrayList<String> apples = new ArrayList<>();
    ArrayList<String> selectedApples = new ArrayList<>();
    ListView appl;
    ArrayAdapter<String> applesA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
        appl = findViewById(R.id.applelist);
        String [] allApples = getResources().getStringArray(R.array.apples);
        Collections.addAll(apples,allApples);

        applesA = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_multiple_choice, apples);
        appl.setAdapter(applesA);
        appl.setOnItemClickListener((parent, view, position, id) -> {
            String apple = applesA.getItem(position);
            if (appl.isItemChecked(position))
                selectedApples.add(apple);
            else
                selectedApples.remove(apple);
        });
    }
    public void add(View view){
        EditText appleSort = findViewById(R.id.editTextText2);
        String asort = appleSort.getText().toString();
        if(!asort.isEmpty()){
            applesA.add(asort);
            applesA.notifyDataSetChanged();
        }
    }
    public void remove(View view){
        for(int i=0; i < selectedApples.size();i++){
            applesA.remove(selectedApples.get(i));
        }
        appl.clearChoices();
        selectedApples.clear();
        applesA.notifyDataSetChanged();
    }
}