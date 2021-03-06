package com.codehub.marvelheroesapp.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.codehub.marvelheroesapp.R;

public class About extends AppCompatActivity {
    Button linkedIn, gitHub;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        gitHub = findViewById(R.id.github);
        linkedIn = findViewById(R.id.linkedIn);
        gitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent git = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/NivedithaN1"));
                startActivity(git);
            }
        });

        linkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent linkedIn = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/k-niveditha-kamath-528378196/"));
                startActivity(linkedIn);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return true;
    }

}
