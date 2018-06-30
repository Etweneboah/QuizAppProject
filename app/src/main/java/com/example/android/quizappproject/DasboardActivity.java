package com.example.android.quizappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DasboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);
/**
 * These are the OnClickLister method created when the user click an object and it will direct him to next activity.
 *
 */
        ImageView b = (ImageView) findViewById(R.id.takeQuiz_id);
        ImageView b1 = (ImageView) findViewById(R.id.imageViewConcept_id);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DasboardActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(DasboardActivity.this, ConceptUsedActivity.class);
                startActivity(i1);
            }
        });
        ImageView aboutMe = (ImageView) findViewById(R.id.imageViewAboutMe_id);
        aboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(DasboardActivity.this, AboutMeActivity.class);
                startActivity(i2);
            }
        });
        ImageView credit = (ImageView) findViewById(R.id.imageViewCredit_id);
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(DasboardActivity.this, CreditActivity.class);
                startActivity(i2);
            }
        });
    }
}
