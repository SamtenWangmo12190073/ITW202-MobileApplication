package com.example.todo_17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private int mScore_1;
    private int mScore_2;
    private TextView mScoreText1;
    private TextView mScoreText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the textview by id
        mScoreText1  = (TextView)findViewById(R.id.score_1);
        mScoreText2  = (TextView)findViewById(R.id.score_2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.night_mode){
            int nightmode = AppCompatDelegate.getDefaultNightMode();
            if (nightmode == AppCompatDelegate.MODE_NIGHT_YES){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
            else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    public void onDecrease(View view) {
        int ViewId = view.getId();
        switch (ViewId){

            case R.id.decreaseTeam1:
                mScore_1--;
                mScoreText1.setText(String.valueOf(mScore_1));
                break;

            case R.id.decreaseTeam2:
                mScore_2--;
                mScoreText2.setText(String.valueOf(mScore_2));
                break;


        }
    }

    public void onIncrease(View view) {
        int ViewId = view.getId();
        switch (ViewId){
            case R.id.increaseTeam1:
                mScore_1++;
                mScoreText1.setText(String.valueOf(mScore_1));
                break;

            case R.id.increaseTeam2:
                mScore_2++;
                mScoreText2.setText(String.valueOf(mScore_2));
                break;

        }

    }
}