package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button rollbutton;
    private TextView tv;
    private ImageView iv_dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollbutton = (Button) findViewById(R.id.rollbutton);
        tv = (TextView) findViewById(R.id.tv);
        iv_dice = (ImageView) findViewById(R.id.iv_dice);

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int rolledNumber;

                rolledNumber = r.nextInt(6) + 1;
                tv.setText("You rolled a " + rolledNumber);

                switch (rolledNumber) {
                    case 1: {
                        iv_dice.setImageResource(R.drawable.d1);
                        break;
                    }
                    case 2: {
                        iv_dice.setImageResource(R.drawable.d2);
                        break;
                    }
                    case 3: {
                        iv_dice.setImageResource(R.drawable.d3);
                        break;
                    }
                    case 4: {
                        iv_dice.setImageResource(R.drawable.d4);
                        break;
                    }
                    case 5: {
                        iv_dice.setImageResource(R.drawable.d5);
                        break;
                    }
                    case 6: {
                        iv_dice.setImageResource(R.drawable.d6);
                        break;
                    }
                }
            }
        });
    }
    }






