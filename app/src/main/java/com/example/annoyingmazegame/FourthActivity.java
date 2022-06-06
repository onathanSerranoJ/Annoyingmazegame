package com.example.annoyingmazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        configureForwardButton();
        configureBackButton();
    }
    private void configureForwardButton() {
        Button ForwardButton = (Button) findViewById(R.id.ForwardButton);
        double random = Math.random()*14;
        if(random < 2) {
            ForwardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            ForwardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            ForwardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            ForwardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            ForwardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            ForwardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            ForwardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureBackButton() {
        Button BackButton = (Button) findViewById(R.id.BackButton);
        double random = Math.random()*14;
        if(random < 2) {
            BackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            BackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            BackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            BackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            BackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            BackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            BackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FourthActivity.this, tenthActivity.class));
                }
            });
        }
    }
}