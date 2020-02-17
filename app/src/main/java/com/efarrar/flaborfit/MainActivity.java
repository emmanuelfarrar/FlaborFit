package com.efarrar.flaborfit;

import androidx.appcompat.app.AppCompatActivity;

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
     */
    private void loadDetailActivity(String exercistTitle) {

    }
}
