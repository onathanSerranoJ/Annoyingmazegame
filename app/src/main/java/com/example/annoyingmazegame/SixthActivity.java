package com.example.annoyingmazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        configureLeftButton();
        configureBackButton();
    }
    private void configureLeftButton() {
        Button LeftButton = (Button) findViewById(R.id.LeftButton);
        double random = Math.random()*14;
        if(random < 2) {
            LeftButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            LeftButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            LeftButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            LeftButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            LeftButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            LeftButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            LeftButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureBackButton() {
        Button BackButton3 = (Button) findViewById(R.id.BackButton3);
        double random = Math.random()*14;
        if(random < 2) {
            BackButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            BackButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            BackButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            BackButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            BackButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            BackButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            BackButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SixthActivity.this, tenthActivity.class));
                }
            });
        }
    }
}