package com.example.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloWorld;
    private String[] mColor = {"purple_200", "purple_500", "purple_700", "teal_200", "teal_700", "black", "white", "yellow", "red", "green", "blue", "maroon", "navy"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHelloWorld = findViewById(R.id.textView);
    }


    public void ChangeColor(View view) {
        Random random = new Random();
        String color  = mColor[random.nextInt(13)];

        int getcolor = getResources().getIdentifier(color, "color", getApplicationContext().getPackageName());
        //int resultColor = getResources().getColor();
        int resultcolor = ContextCompat.getColor(this, getcolor);
        mHelloWorld.setTextColor(resultcolor);
    }
}