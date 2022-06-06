package com.example.annoyingmazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EighthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        configureBackButton();
        configureForwardButton();
        configureLeftButton();
    }
    private void configureLeftButton() {
        Button LeftButton2 = (Button) findViewById(R.id.LeftButton2);
        double random = Math.random()*14;
        if(random < 2) {
            LeftButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            LeftButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            LeftButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            LeftButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            LeftButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            LeftButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            LeftButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureBackButton() {
        Button BackButton5 = (Button) findViewById(R.id.BackButton5);
        double random = Math.random()*14;
        if(random < 2) {
            BackButton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            BackButton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            BackButton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            BackButton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            BackButton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            BackButton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            BackButton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureForwardButton() {
        Button ForwardButton3 = (Button) findViewById(R.id.ForwardButton3);
        double random = Math.random()*14;
        if(random < 2) {
            ForwardButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            ForwardButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            ForwardButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            ForwardButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            ForwardButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            ForwardButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            ForwardButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(EighthActivity.this, tenthActivity.class));
                }
            });
        }
    }
}