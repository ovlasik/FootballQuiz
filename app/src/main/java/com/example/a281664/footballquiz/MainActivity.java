package com.example.a281664.footballquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView countLabel;
    private TextView questionLabel;
    private Button answerBtn1;
    private Button answerBtn2;
    private Button answerBtn3;
    private Button answerBtn4;

    private String rightAswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            //{Country, right answer, choice1, choice2, choice3}
            {"Italy","Rome","London","Paris","Kyiv"}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countLabel = (TextView)findViewById(R.id.countLabel);
        questionLabel = (TextView)findViewById(R.id.questionLabel);
        answerBtn1 =(Button) findViewById(R.id.answerBtn1);
        answerBtn2 =(Button) findViewById(R.id.answerBtn2);
        answerBtn3 =(Button) findViewById(R.id.answerBtn3);
        answerBtn4 =(Button) findViewById(R.id.answerBtn4);

        //Tworze quizArray z quizData
        for(int i =0; i<quizData.length; i++)
        {
            //przygotowyje array
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]);//country
            tmpArray.add(quizData[i][1]);//right answer
            tmpArray.add(quizData[i][2]);//choice 1
            tmpArray.add(quizData[i][3]);//choice 2
            tmpArray.add(quizData[i][4]);//choice 3

            //dodaje tmpArray to quizArray
            quizArray.add(tmpArray);
        }

        showNextQuiz();
    }

    public void showNextQuiz(){

        //Update quizCountLabel
        countLabel.setText("Q" + quizCount);

        //Generate random number between 0 and 14 (qiuzArray's size-1)
        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());

        //Pick one qiuz set
        ArrayList<String> quiz = quizArray.get(randomNum);

        //Set questiom and right answer
        //Array format
        questionLabel.setText(quiz.get(0));
        rightAswer = quiz.get(1);

        //Remove Country from quiz and Shuffle choices
        quiz.remove(0);
        Collections.shuffle(quiz);

        //Set Choices
        answerBtn1.setText(quiz.get(0));
        answerBtn2.setText(quiz.get(1));
        answerBtn3.setText(quiz.get(2));
        answerBtn4.setText(quiz.get(3));

        //Remowe this quiz from quizArray
        quizArray.remove(randomNum);


    }
}
