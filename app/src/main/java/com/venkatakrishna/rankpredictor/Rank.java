package com.venkatakrishna.rankpredictor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Rank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);
        double d = getIntent().getExtras().getDouble("rank");
        int flag= getIntent().getExtras().getInt("flag");
        int a = (int) d;
        TextView textViewRank = (TextView) findViewById(R.id.textViewRank);
        if (a <= 1000 && flag==0) {
            textViewRank.setText("Hurray! Your rank is \n" + a);
        } else if (a>1000 && flag==0){
            textViewRank.setText("Your rank is:\n"+a);
        }else if(flag==-1){
            textViewRank.setText("You are not eligible");
        }
    }
}