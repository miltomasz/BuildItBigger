package com.plumya.jokesandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by miltomasz on 03/06/18.
 */

public class JokesTellingActivity extends AppCompatActivity {

    public static final String JOKE_FROM_LIB = "JokeFromLib";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_telling);
        Intent intent = getIntent();
        String jokeFromJavaLib = intent.getStringExtra(JOKE_FROM_LIB);
        TextView textView = findViewById(R.id.jokeTv);
        textView.setText(jokeFromJavaLib);
    }
}
