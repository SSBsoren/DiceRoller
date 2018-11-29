package com.soren.sagen.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDicy;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy = findViewById(R.id.imageView);
        imageViewDicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollOurDice();
            }
        });
    }

    private void rollOurDice() {
        int myRanNo = myRandomNumber.nextInt(6) + 1;

        switch (myRanNo) {
            case 1:
                imageViewDicy.setImageResource(R.drawable.diceone);
                break;

            case 2:
                imageViewDicy.setImageResource(R.drawable.dicetwo);
                break;

            case 3:
                imageViewDicy.setImageResource(R.drawable.dicethree);
                break;

            case 4:
                imageViewDicy.setImageResource(R.drawable.dicefour);
                break;
            case 5:
                imageViewDicy.setImageResource(R.drawable.docefive);
                break;
            case 6:
                imageViewDicy.setImageResource(R.drawable.dicesix);
                break;

        }
    }
}
