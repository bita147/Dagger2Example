package com.dagger.dagger2example.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dagger.dagger2example.R;
import com.dagger.dagger2example.application.DaggerApplication;
import com.dagger.dagger2example.services.GreetingsService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private Button btnSubmit;

    @Inject
    public GreetingsService greetingsService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.et_name);
        btnSubmit = (Button) findViewById(R.id.btn_submit);

        DaggerApplication.components().inject(this);
        greetingsService.setMyVariableValue(199);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String greet = greetingsService.getGreetLine(etName.getText().toString());
                Toast.makeText(MainActivity.this, "" + greet, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, DashboardActivity.class));
            }
        });
    }
}
