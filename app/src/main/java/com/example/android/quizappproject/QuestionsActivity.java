package com.example.android.quizappproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.NumberFormat;

public class QuestionsActivity extends AppCompatActivity {
    //Declaring a score as a global variable
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    /**
     * @SubmitResults is the  meyhod for submitting the results.
     * inside the methods contains instantiated objects for example textview and button
     * It also contains logical statements
     */
    public void submitResults(View view) {
        RadioButton correctRadioButton1 = (RadioButton) findViewById(R.id.question_1_correct_answer_id);
        boolean correctRadioButtonHasChecked1 = correctRadioButton1.isChecked();

        RadioButton correctRadioButton2 = (RadioButton) findViewById(R.id.question_2_correct_answer_id);
        boolean correctRadioButtonHasChecked2 = correctRadioButton2.isChecked();

        RadioButton correctRadioButton3 = (RadioButton) findViewById(R.id.question_3_correct_answer_id);
        boolean correctRadioButtonHasChecked3 = correctRadioButton3.isChecked();

        RadioButton correctRadioButton4 = (RadioButton) findViewById(R.id.question_4_correct_answer_id);
        boolean correctRadioButtonHasChecked4 = correctRadioButton4.isChecked();

        RadioButton correctRadioButton5 = (RadioButton) findViewById(R.id.question_5_correct_answer_id);
        boolean correctRadioButtonHasChecked5 = correctRadioButton5.isChecked();

        if (correctRadioButtonHasChecked1) {
            score += 20;
        } else {
            score = score;
        }
        if (correctRadioButtonHasChecked2) {
            score += 20;
        } else {
            score = score;
        }
        if (correctRadioButtonHasChecked3) {
            score += 20;
        } else {
            score = score;
        }
        if (correctRadioButtonHasChecked4) {
            score += 20;
        } else {
            score = score;
        }
        if (correctRadioButtonHasChecked5) {
            score += 20;
        }
        displayResults(score);
        if (score >= 50) {
            displayRemarks("You passed this quiz with score more than 50 marks");
        } else {
            displayRemarks("You failed this quiz because your score is below 50 ");
        }
        //==================This the method for disabelling the submit button when it clicked  =======
        Button buttonSum = (Button) findViewById(R.id.submitAnswer_id);
        buttonSum.setEnabled(false);
    }
//-------------------------------End of the submit Results Method...................

    //-----------Method for displaying results----------------------------
    private void displayResults(int priceNumber) {
        TextView displayMessageTextView = (TextView) findViewById(R.id.totalScore_id);
        displayMessageTextView.setText("" + priceNumber);
    }
    //--------------Method for displaying total marks scored--------------------

    private void displayRemarks(String remarks) {
        TextView displayMessageTextView = (TextView) findViewById(R.id.remarks_id);
        displayMessageTextView.setText(remarks);
    }
}
