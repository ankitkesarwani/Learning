package com.example.ankit.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class QuizFactoryActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_factory);

        mToolbar = (Toolbar) findViewById(R.id.quiz_factory_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Quiz Factory");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
