package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamBlue = 0;
    int scoreTeamRed = 0;
    int scoreBarrel = 0;
    int scoreStop = 0;
    int scoreArchery = 0;
    int scoreChicken = 0;
    int scoreTv = 0;
    int scoreCar = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void barrel_point(View v) {
        scoreTeamBlue += 5;
        scoreBarrel += 1;
        displayForTeamBlue(scoreTeamBlue);
        displayForBarrel(scoreBarrel);
    }

    public void stop_point(View v) {
        scoreTeamBlue += 3;
        scoreStop += 1;
        displayForTeamBlue(scoreTeamBlue);
        displayForStop(scoreStop);
    }

    public void archery_point(View v) {
        scoreTeamBlue += 1;
        scoreArchery += 1;
        displayForTeamBlue(scoreTeamBlue);
        displayForArchery(scoreArchery);
    }

    public void car_point(View v) {
        scoreTeamRed += 5;
        scoreCar += 1;
        displayForTeamRed(scoreTeamRed);
        displayForCar(scoreCar);
    }

    public void chicken_point(View v) {
        scoreTeamRed += 3;
        scoreChicken += 1;
        displayForTeamRed(scoreTeamRed);
        displayForChicken(scoreChicken);
    }

    public void tv_point(View v) {
        scoreTeamRed += 1;
        scoreTv += 1;
        displayForTeamRed(scoreTeamRed);
        displayForTv(scoreTv);
    }

    public void displayForTeamBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Team_blue_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Team_red_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBarrel(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barrel_count);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForArchery(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archery_count);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForStop(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stop_count);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTv(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tv_count);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForChicken(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chicken_count);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForCar(int score) {
        TextView scoreView = (TextView) findViewById(R.id.car_count);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v) {
        scoreTeamBlue = 0;
        scoreTeamRed = 0;
        scoreBarrel = 0;
        scoreStop = 0;
        scoreArchery = 0;
        scoreChicken = 0;
        scoreTv = 0;
        scoreCar = 0;
        displayForTeamRed(scoreTeamRed);
        displayForTeamBlue(scoreTeamBlue);
        displayForTv(scoreTv);
        displayForChicken(scoreChicken);
        displayForCar(scoreCar);
        displayForArchery(scoreArchery);
        displayForStop(scoreStop);
        displayForBarrel(scoreBarrel);
    }
}
