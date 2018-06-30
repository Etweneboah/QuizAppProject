package com.example.android.quizappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    //-------------Declaring variables for the objects created as a public
    EditText edt;
    Button btn;
    String st; //----End of declaration---------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
/**
 * This is a method  for passing data from login page to other activity
 */
        btn = (Button) findViewById(R.id.loginUser_id);
        edt = (EditText) findViewById(R.id.enetrName_id);
        //-----This method is use to pass data on to user details activity after loging in----------
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, UserDetailsActivity.class);
                st = edt.getText().toString();
                i.putExtra("value", st);
                startActivity(i);
                finish();
            }
        });

    }
}
