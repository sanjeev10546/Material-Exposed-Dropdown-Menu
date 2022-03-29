package com.example.materialexposeddropdownmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextInputLayout til_season;
    AutoCompleteTextView act_seasons;
    ArrayList<String> arrayList_season;
    ArrayAdapter<String> arrayAdapter_season;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        til_season=(TextInputLayout)findViewById(R.id.tit_season);
        act_seasons=(AutoCompleteTextView)findViewById(R.id.act_seasons);
        arrayList_season=new ArrayList<>();
        arrayList_season.add("winter");
        arrayList_season.add("spring");
        arrayList_season.add("summer");
        arrayList_season.add("Monsoon");
        arrayList_season.add("Autumn");

        arrayAdapter_season=new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arrayList_season);
        act_seasons.setAdapter(arrayAdapter_season);
        act_seasons.setThreshold(1);


    }
}