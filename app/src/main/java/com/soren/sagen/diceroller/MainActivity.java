package com.soren.sagen.diceroller;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDicy1;
    private ImageView imageViewDicy2;
    private Button rollingBtn;

    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy1 = findViewById(R.id.imgv_dice_l);
        imageViewDicy2 = findViewById(R.id.imgv_dice_r);


    }
    public void RollingFunction(View view)
    {
        rollOurDice1();
        rollOurDice2();
    }



    private void rollOurDice1() {
        int myRanNo = myRandomNumber.nextInt(6) + 1;

        switch (myRanNo) {
            case 1:
                imageViewDicy1.setImageResource(R.drawable.dice1);
                break;

            case 2:
                imageViewDicy1.setImageResource(R.drawable.dice2);
                break;

            case 3:
                imageViewDicy1.setImageResource(R.drawable.dice3);
                break;

            case 4:
                imageViewDicy1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicy1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicy1.setImageResource(R.drawable.dice6);
                break;

        }
    }
    private void rollOurDice2() {
        int myRanNo = myRandomNumber.nextInt(6) + 1;

        switch (myRanNo) {
            case 1:
                imageViewDicy2.setImageResource(R.drawable.diceone);
                break;

            case 2:
                imageViewDicy2.setImageResource(R.drawable.dicetwo);
                break;

            case 3:
                imageViewDicy2.setImageResource(R.drawable.dicethree);
                break;

            case 4:
                imageViewDicy2.setImageResource(R.drawable.dicefour);
                break;
            case 5:
                imageViewDicy2.setImageResource(R.drawable.docefive);
                break;
            case 6:
                imageViewDicy2.setImageResource(R.drawable.dicesix);
                break;

        }
    }
}
