package com.example.annoyingmazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NinthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        configureBackButton();
        configureLeftButton();
        configureRightButton();
    }
    private void configureRightButton() {
        Button RightButton3 = (Button) findViewById(R.id.RightButton3);
        double random = Math.random()*14;
        if(random < 2) {
            RightButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            RightButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            RightButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            RightButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            RightButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            RightButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            RightButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureBackButton() {
        Button BackButton6 = (Button) findViewById(R.id.BackButton6);
        double random = Math.random()*14;
        if(random < 2) {
            BackButton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            BackButton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            BackButton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            BackButton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            BackButton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            BackButton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            BackButton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureLeftButton() {
        Button LeftButton3 = (Button) findViewById(R.id.LeftButton3);
        double random = Math.random()*14;
        if(random < 2) {
            LeftButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            LeftButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            LeftButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            LeftButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            LeftButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            LeftButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            LeftButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NinthActivity.this, tenthActivity.class));
                }
            });
        }
    }
}