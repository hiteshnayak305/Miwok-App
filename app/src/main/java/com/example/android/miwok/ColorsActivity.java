package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_list);

        //creating ArrayList of word(custom class)
        ArrayList<word> words = new ArrayList<>();
        //adding word objects to list of word
        words.add(new word("red", "weṭeṭṭi"));
        words.add(new word("green", "chokokki"));
        words.add(new word("brown", "ṭakaakki"));
        words.add(new word("gray", "ṭopoppi"));
        words.add(new word("black", "kululli"));
        words.add(new word("white", "kelelli"));
        words.add(new word("dusty yellow", "ṭopiisә"));
        words.add(new word("mustard yellow", "chiwiiṭә"));
        /**
         * need a custom ArrayAdapter which accepts words list
         * and accepts LinearLayout to display two TextViews i.e. override ArrayAdapter
         */
        wordAdapter adapter = new wordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.common_list_root);
        listView.setAdapter(adapter);
    }
}
