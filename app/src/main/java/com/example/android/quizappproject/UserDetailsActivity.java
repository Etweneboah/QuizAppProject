package com.example.android.quizappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UserDetailsActivity extends AppCompatActivity {

    //--------Declaring variable for the TextView Object---------
    TextView tv;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        //------This is a method for moving to Take quiz page---------
        Button b = (Button) findViewById(R.id.startQuiz);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserDetailsActivity.this, QuestionsActivity.class);
                startActivity(i);
                finish();
            }
        });

        //---------Instantiating the variable created--------
        tv = (TextView) findViewById(R.id.textViewUserInfo_id);
        st = getIntent().getExtras().getString("value");
        tv.setText(st);
    }


}
