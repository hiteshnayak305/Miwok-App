package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_list);

        //creating ArrayList of word(custom class)
        final ArrayList<word> words = new ArrayList<>();
        //adding word objects to list of word
        words.add(new word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new word("nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new word("ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));

        /**
         * need a custom ArrayAdapter which accepts words list
         * and accepts LinearLayout to display two TextViews i.e. override ArrayAdapter
         */
        wordAdapter adapter = new wordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.common_list_root);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word currentWord = words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(NumberActivity.this, currentWord.getAudioId());
                mediaPlayer.start();
            }
        });
    }
}
