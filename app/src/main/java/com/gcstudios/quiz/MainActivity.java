package com.gcstudios.quiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.humananatomyquiz.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*this method will create objects for the radiobuttons bearing the correct answer
     * and all the checkboxes then assigns them to a Boolean variable to confirm
     * that its checked*/
    public void Submit(View view) {

        RadioButton question1optionc = (RadioButton) findViewById(R.id.question1optionc);
        boolean question1optioncRight = question1optionc.isChecked();
        RadioButton question2optiond = (RadioButton) findViewById(R.id.question2optiond);
        boolean question2optiondRight = question2optiond.isChecked();
        RadioButton question3optionc = (RadioButton) findViewById(R.id.question3optionc);
        boolean question3optioncRight = question3optionc.isChecked();
        RadioButton question4optiond = (RadioButton) findViewById(R.id.question4optiond);
        boolean question4optiondRight = question4optiond.isChecked();
        RadioButton question5optionb = (RadioButton) findViewById(R.id.question5optionb);
        boolean question5optionbRight = question5optionb.isChecked();
        RadioButton question6optiona = (RadioButton) findViewById(R.id.question6optiona);
        boolean question6optionaRight = question6optiona.isChecked();
        RadioButton question7optiona = (RadioButton) findViewById(R.id.question7optiona);
        boolean question7optionaRight = question7optiona.isChecked();

        CheckBox question8optiona = (CheckBox) findViewById(R.id.question8optiona);
        boolean question8optionaRight = question8optiona.isChecked();
        CheckBox question8optionb = (CheckBox) findViewById(R.id.question8optionb);
        boolean question8optionbRight = question8optionb.isChecked();
        CheckBox question8optionc = (CheckBox) findViewById(R.id.question8optionc);
        boolean question8optioncRight = question8optionc.isChecked();
        CheckBox question8optiond = (CheckBox) findViewById(R.id.question8optiond);
        boolean question8optiondRight = question8optiond.isChecked();
        CheckBox question9optiona = (CheckBox) findViewById(R.id.question9optiona);
        boolean question9optionaRight = question9optiona.isChecked();
        CheckBox question9optionb = (CheckBox) findViewById(R.id.question9optionb);
        boolean question9optionbRight = question9optionb.isChecked();
        CheckBox question9optionc = (CheckBox) findViewById(R.id.question9optionc);
        boolean question9optioncRight = question9optionc.isChecked();
        CheckBox question9optiond = (CheckBox) findViewById(R.id.question9optiond);
        boolean question9optiondRight = question9optiond.isChecked();


        EditText question10ans = (EditText) findViewById(R.id.question10ans);
        String question10 = question10ans.getText().toString();
        boolean question10Right = question10.equals("Kidney");
        boolean question10Right2 = question10.equals("kidney");
        boolean question10Right3 = question10.equals("KIDNEY");



        /*to call the calculation process while assigning it to an int variable score*/
        int score = calculation(question1optioncRight, question2optiondRight, question3optioncRight,
                question4optiondRight, question5optionbRight, question6optionaRight, question7optionaRight,
                question8optionaRight, question8optionbRight, question8optioncRight, question8optiondRight,
                question9optionaRight, question9optionbRight, question9optioncRight, question9optiondRight, question10Right,
                question10Right2, question10Right3);


        String scoreValue = getString(R.string.scoreMessage, score);

        Toast.makeText(this, scoreValue, Toast.LENGTH_LONG).show();
    }


    /*this method does the calculation*/
    public int calculation(boolean question1optioncRight, boolean question2optiondRight, boolean question3optioncRight,
                           boolean question4optiondRight, boolean question5optionbRight, boolean question6optionaRight,
                           boolean question7optionaRight, boolean question8optionaRight, boolean question8optionbRight,
                           boolean question8optioncRight, boolean question8optiondRight, boolean question9optionaRight,
                           boolean question9optionbRight, boolean question9optioncRight, boolean question9optiondRight,
                           boolean question10Right, boolean question10Right2, boolean question10Right3) {
        int totalScore = 0;
        if (question1optioncRight) {
            totalScore += 1;
        }
        if (question2optiondRight) {
            totalScore += 1;
        }
        if (question3optioncRight) {
            totalScore += 1;
        }
        if (question4optiondRight) {
            totalScore += 1;
        }
        if (question5optionbRight) {
            totalScore += 1;
        }
        if (question6optionaRight) {
            totalScore += 1;
        }
        if (question7optionaRight) {
            totalScore += 1;
        }
        if (question8optionaRight && question8optionbRight && question8optioncRight && !question8optiondRight) {
            totalScore += 1;
        }
        if (question9optionaRight && question9optionbRight && !question9optioncRight && !question9optiondRight) {
            totalScore += 1;
        }
        if (question10Right || question10Right2 || question10Right3) {
            totalScore += 1;
        }
        return totalScore;
    }
}

