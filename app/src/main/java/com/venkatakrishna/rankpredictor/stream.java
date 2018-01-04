package com.venkatakrishna.rankpredictor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.RadioButton;
import android.widget.RadioGroup;


public class stream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);

    }
    public void streamSelected(android.view.View view)
    {
        RadioGroup radioGroup= (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton radioButton;
        String  val;int val1;
        val1=radioGroup.getCheckedRadioButtonId();

        radioButton= (RadioButton) findViewById(val1);
        val= (String) radioButton.getText();

        Intent i=new Intent(this,enterDetails.class);
        i.putExtra("value",val);
        startActivity(i);

    }
}
