package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.miwok.R.layout.activity_number;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_number);

        //creating ArrayList of word(custom class)
        ArrayList<word> words = new ArrayList<>();
        //adding word objects to list of word
        words.add(new word("one", "lutti"));
        words.add(new word("two", "lutti"));
        words.add(new word("three", "lutti"));
        words.add(new word("four", "lutti"));
        words.add(new word("five", "lutti"));
        words.add(new word("six", "lutti"));
        words.add(new word("seven", "lutti"));
        words.add(new word("eight", "lutti"));
        words.add(new word("nine", "lutti"));
        words.add(new word("ten", "lutti"));
        /**
         * need a custom ArrayAdapter which accepts words list
         * and accepts LinearLayout to display two TextViews i.e. override ArrayAdapter
         */
        wordAdapter adapter = new wordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.activity_number);
        listView.setAdapter(adapter);
    }
}
