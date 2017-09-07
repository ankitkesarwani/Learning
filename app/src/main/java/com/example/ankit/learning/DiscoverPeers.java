package com.example.ankit.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DiscoverPeers extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_peers);

        mToolbar = (Toolbar) findViewById(R.id.discover_peers_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Discover Peers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
