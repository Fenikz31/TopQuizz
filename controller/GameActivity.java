package com.fenikz.topquizz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.fenikz.topquizz.R;

public class GameActivity extends AppCompatActivity {

    private TextView mQuestionText;
    private Button mGameAnswer1;
    private Button mGameAnswer2;
    private Button mGameAnswer3;
    private Button mGameAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        mGameAnswer1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mGameAnswer2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mGameAnswer3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mGameAnswer4 = (Button) findViewById(R.id.activity_game_answer4_btn);



    }
}
