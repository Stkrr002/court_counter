package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public int team1=0;
  public  int team2=0;
    public void display1(int text) {
        TextView t = (TextView) findViewById(R.id.team1score);
        t.setText(text+"" );
    }

    public void team1plus3(View view)
    {
        team1+=3;
        display1(team1);

    }
    public void team2plus3(View view)
    {
        team2+=3;
        display2(team2);

    }
    public void team1plus2(View view)
    {
        team1+=2;
        display1(team1);

    }
    public void team2plus2(View view)
    {
        team2+=2;
        display2(team2);

    }
    public void team1plus1(View view)
    {
        team1+=1;
        display1(team1);

    }
    public void team2plus1(View view)
    {
        team2+=1;
        display2(team2);

    }

    public void display2(int text) {
        TextView t = (TextView) findViewById(R.id.team2score);
        t.setText(text+"" );
    }
    public void resetit(View view) {
        team1=0;
        team2=0;
        TextView t = (TextView) findViewById(R.id.team2score);
        t.setText("0" );
        TextView t1 = (TextView) findViewById(R.id.team1score);
        t1.setText("0" );
        TextView t2 = (TextView) findViewById(R.id.result);
        t2.setText(" PRESS SHOW FOR RESULT : )" );
    }
    @SuppressLint("SetTextI18n")
    public void showit(View view){
        if(team1>team2){
            int score=team1-team2;
            TextView t1 = (TextView) findViewById(R.id.result);
            t1.setText("TEAM 1 WON BY :- "+ score);
        }
        else if(team1<team2) {
            int score = team2 - team1;
            TextView t1 = (TextView) findViewById(R.id.result);
            t1.setText("TEAM 2 WON BY :- " + score);
        }
        else{

            TextView t1 = (TextView) findViewById(R.id.result);
            t1.setText("MATCH DRAW BOTH TEAM SCORED  "+ team1);
        }



    }
}