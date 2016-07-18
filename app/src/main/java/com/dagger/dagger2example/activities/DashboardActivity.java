package com.dagger.dagger2example.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.dagger.dagger2example.R;
import com.dagger.dagger2example.application.DaggerApplication;
import com.dagger.dagger2example.services.GreetingsService;

import javax.inject.Inject;

public class DashboardActivity extends AppCompatActivity {

    @Inject
    GreetingsService greetingsService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DaggerApplication.components().inject(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "" + greetingsService.getMyVariableValue(), Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }
}
