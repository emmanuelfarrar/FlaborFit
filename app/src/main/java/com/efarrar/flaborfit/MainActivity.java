package com.efarrar.flaborfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    //Variables so we can determine what button is pressed
    /*
        public: anyone can access this var
        static: means that only one instance of this can exist in memory
        final: it cannot be edit.

        Using the category in such a way as EXERCISE_YOGA is a way to make
        looking up the variable easier as we code.

        Since they are constants it is all capitalized
        Since we are using static variables it is best practice to use the following format
        ClassName.variableName
     */
    public static final String EXERCISE_WEIGHTS = "Weight lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";
    public static final String EXTRA_ITEM_TITLE = "extra.item.title";       // will be used by the intent to pass the title  to get to the Details Activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning var to the ids
        RelativeLayout weightBtn = findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn = findViewById(R.id.cardioBtn);

        //creating onClickListener() for Btn
        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);

            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);

            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);

            }
        });



    }

    /*Function that will us the constants as reference and load the proper Activity
    we will pass in the constant

    We are saying Activity manager load this activity, store some data, and when the activity loads it will fetch said data
     */
    private void loadDetailActivity(String exerciseTitle) {

        /*using intent to talk with the OS to tell it that this  activity wants to load
        DetailsActivity
         */
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);

        //sending data via the intent; we are passing in the title of one of the three exercises.
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }
}
