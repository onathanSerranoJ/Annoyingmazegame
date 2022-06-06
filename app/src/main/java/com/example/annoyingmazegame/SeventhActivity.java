package com.example.annoyingmazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        configureBackButton();
        configureForwardButton();
        configureRightButton();
    }
    private void configureRightButton() {
        Button RightButton2 = (Button) findViewById(R.id.RightButton2);
        double random = Math.random()*14;
        if(random < 2) {
            RightButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            RightButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            RightButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            RightButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            RightButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            RightButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            RightButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureBackButton() {
        Button BackButton4 = (Button) findViewById(R.id.BackButton4);
        double random = Math.random()*14;
        if(random < 2) {
            BackButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            BackButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            BackButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            BackButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            BackButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            BackButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            BackButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureForwardButton() {
        Button ForwardButton2 = (Button) findViewById(R.id.ForwardButton2);
        double random = Math.random()*14;
        if(random < 2) {
            ForwardButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            ForwardButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            ForwardButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            ForwardButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            ForwardButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            ForwardButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            ForwardButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SeventhActivity.this, tenthActivity.class));
                }
            });
        }
    }
}