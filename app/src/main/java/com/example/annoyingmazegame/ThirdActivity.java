package com.example.annoyingmazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        configureReconsiderButton();
    }
    private void configureReconsiderButton()
    {
        Button ReconsiderButton = (Button) findViewById(R.id.ReconsiderButton);
        ReconsiderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ThirdActivity.this, MainActivity.class));
            }
        });
    }
}