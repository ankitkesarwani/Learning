package com.example.ankit.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class InviteFriendsActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friends);

        mToolbar = (Toolbar) findViewById(R.id.invite_friends_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Invite Friends");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
