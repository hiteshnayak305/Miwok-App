package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        //adding views to activity
        LinearLayout rootView = (LinearLayout) findViewById(R.id.activity_number);
        for (int i = 0; i < words.size(); i++) {
            TextView word = new TextView(this);
            word.setText(words.get(i));
            rootView.addView(word);
        }
    }
}
