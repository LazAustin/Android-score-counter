package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAThreePointer(View v) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

        public void teamBThreePointer(View v){
            scoreB += 3;
            displayForTeamB(scoreB);
    }

    public void teamATwoPointer(View v){
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void teamBTwoPointer(View v){
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void teamAFreeThrow(View v){
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    public void teamBFreeThrow(View v){
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void resetScore(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
