package com.example.sssprogramer.shultetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onHelpClick(View view) {
        startActivity(new Intent(this, HelpActivity.class));
    }

    public void onGameClick(View view) {
        startActivity(new Intent(this, GameActivity.class));
    }
}
