package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_list);

        //creating ArrayList of word(custom class)
        ArrayList<word> words = new ArrayList<>();
        //adding word objects to list of word
        words.add(new word("father", "әpә"));
        words.add(new word("mother", "әṭa"));
        words.add(new word("son", "angsi"));
        words.add(new word("daughter", "tune"));
        words.add(new word("older brother", "taachi"));
        words.add(new word("younger brother", "chalitti"));
        words.add(new word("older sister", "teṭe"));
        words.add(new word("younger sister", "kolliti"));
        words.add(new word("grandmother ", "ama"));
        words.add(new word("grandfather", "paapa"));
        /**
         * need a custom ArrayAdapter which accepts words list
         * and accepts LinearLayout to display two TextViews i.e. override ArrayAdapter
         */
        wordAdapter adapter = new wordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.common_list_root);
        listView.setAdapter(adapter);
    }
}
