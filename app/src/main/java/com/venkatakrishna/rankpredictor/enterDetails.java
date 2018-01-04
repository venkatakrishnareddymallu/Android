package com.venkatakrishna.rankpredictor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class enterDetails extends AppCompatActivity {
    EditText et1, et2;
    int val;
    static double rank;
    int emarks, ipemarks;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_details);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

    }

    public void rankDisplay(View view) {
        Intent i = new Intent(this, com.venkatakrishna.rankpredictor.Rank.class);

        emarks = Integer.valueOf(et1.getText().toString());
        ipemarks = Integer.valueOf(et2.getText().toString());

        if ((!et1.getText().toString().isEmpty() && !et2.getText().toString().isEmpty())) {
            String a = getIntent().getStringExtra("value");
            if ((emarks >= 0 && emarks <= 160) && (ipemarks >= 0 && ipemarks <= 25)) {
                if (a.equals("Engineering"))//engg
                {
                    if (emarks < 40) {
                        rank = -1;
                        flag = -1;
                        i.putExtra("flag", -1);
                        i.putExtra("rank", -1);
                        startActivity(i);
                    } else {
                        rank = (-243.0009 * emarks) + (-6541.074 * ipemarks) + 202408;
                        i.putExtra("rank", rank);
                        i.putExtra("0", flag);
                        startActivity(i);
                    }
                } else//medicine
                {
                    if (emarks < 40) {
                        rank = -1;
                        flag = -1;
                        i.putExtra("flag", -1);
                        i.putExtra("rank", -1);
                        startActivity(i);
                    } else {
                        rank = (-302.6840* emarks) + (-6999.074 * ipemarks) + 223408;
                        i.putExtra("rank", rank);
                        i.putExtra("0", flag);
                        startActivity(i);
                    }
                }


            } else {
                Toast.makeText(this, "enter marks within Range", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Enter the details properly", Toast.LENGTH_SHORT).show();
        }


    }
}
