package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

import static com.example.android.miwok.R.layout.activity_number;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_number);

        //creating List of words
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        ArrayAdapter<String> numberAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);
        GridView listView = (GridView) findViewById(R.id.activity_number);
        listView.setAdapter(numberAdapter);
    }
}
