package com.efarrar.flaborfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //connecting elements by id
        TextView exerciseTitle = findViewById(R.id.exerciseTitle);
        ImageView exerciseImg = findViewById(R.id.exerciseImage);



    }
}
