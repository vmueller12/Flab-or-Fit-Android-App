package com.vitalimueller.flaborfit;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseTitle = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImg = (ImageView)findViewById(R.id.exerciseImage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);

        String exTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseTitle.setText(exTitle);

        if(exTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHT)){
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.weight,
                    getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }else if(exTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)){
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.lotus,
                    getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#916BCD"));
        }else{
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.heart,
                    getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }

    }
}
