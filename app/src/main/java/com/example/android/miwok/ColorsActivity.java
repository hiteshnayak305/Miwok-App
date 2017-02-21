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
        words.add(new word("red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new word("green", "chokokki", R.drawable.color_green));
        words.add(new word("brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new word("gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new word("black", "kululli", R.drawable.color_black));
        words.add(new word("white", "kelelli", R.drawable.color_white));
        words.add(new word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        /**
         * need a custom ArrayAdapter which accepts words list
         * and accepts LinearLayout to display two TextViews i.e. override ArrayAdapter
         */
        wordAdapter adapter = new wordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.common_list_root);
        listView.setAdapter(adapter);
    }
}
