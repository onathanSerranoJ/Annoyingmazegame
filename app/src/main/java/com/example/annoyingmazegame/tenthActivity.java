package com.example.annoyingmazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        configureForwardButton();
        configureLeftButton();
        configureBackButton();
        configureRightButton();
    }
    private void configureRightButton() {
        Button RightButton4 = (Button) findViewById(R.id.RightButton4);
        double random = Math.random()*14;
        if(random < 2) {
            RightButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            RightButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            RightButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            RightButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            RightButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            RightButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            RightButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureBackButton() {
        Button BackButton7 = (Button) findViewById(R.id.BackButton7);
        double random = Math.random()*14;
        if(random < 2) {
            BackButton7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            BackButton7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            BackButton7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            BackButton7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            BackButton7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            BackButton7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            BackButton7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureLeftButton() {
        Button LeftButton4 = (Button) findViewById(R.id.LeftButton4);
        double random = Math.random()*14;
        if(random < 2) {
            LeftButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            LeftButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            LeftButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            LeftButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            LeftButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            LeftButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            LeftButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, tenthActivity.class));
                }
            });
        }
    }
    private void configureForwardButton() {
        Button ForwardButton4 = (Button) findViewById(R.id.ForwardButton4);
        double random = Math.random()*14;
        if(random < 2) {
            ForwardButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, FourthActivity.class));
                }
            });
        }
        else if(random < 4) {
            ForwardButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, FifthActivity.class));
                }
            });
        }
        else if(random < 6) {
            ForwardButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, SixthActivity.class));
                }
            });
        }
        else if(random < 8) {
            ForwardButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, SeventhActivity.class));
                }
            });
        }
        else if(random < 10) {
            ForwardButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, EighthActivity.class));
                }
            });
        }
        else if(random < 12) {
            ForwardButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, NinthActivity.class));
                }
            });
        }
        else {
            ForwardButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(tenthActivity.this, tenthActivity.class));
                }
            });
        }
    }
}