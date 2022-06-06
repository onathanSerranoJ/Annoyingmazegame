package com.example.annoyingmazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        configureRightButton();
        configureBackButton();
    }
    private void configureRightButton() {
        Button RightButton = (Button) findViewById(R.id.RightButton);
        double random = Math.random()*14;
        if(random < 2) {
            RightButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            RightButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            RightButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            RightButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            RightButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            RightButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            RightButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureBackButton() {
        Button BackButton2 = (Button) findViewById(R.id.BackButton2);
        double random = Math.random()*14;
        if(random < 2) {
            BackButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            BackButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            BackButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            BackButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            BackButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            BackButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            BackButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FifthActivity.this, tenthActivity.class));
                }
            });
        }
    }
}