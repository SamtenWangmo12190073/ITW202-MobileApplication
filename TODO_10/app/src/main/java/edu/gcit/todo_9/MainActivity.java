package edu.gcit.todo_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText, nEditText;
    private TextView mTextView;
    private Calculator mCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.edittext1);
        nEditText = findViewById(R.id.edittext2);
        mTextView = findViewById(R.id.textview);
        mCalculator = new Calculator();
    }

    public void add(View view) {
        String value1 = mEditText.getText().toString();
        String value2 = nEditText.getText().toString();
        double resultAdd = mCalculator.add(Double.valueOf(value1),Double.valueOf(value2));
        mTextView.setText(String.valueOf(resultAdd));

        Log.d("Debugging", "Hello");
    }

    public void sub(View view) {
        String value1 = mEditText.getText().toString();
        String value2 = nEditText.getText().toString();
        double resultSub = mCalculator.sub(Double.valueOf(value1),Double.valueOf(value2));
        mTextView.setText(String.valueOf(resultSub));

        Log.d("Debugging", "Hello");
    }

    public void mul(View view) {
        String value1 = mEditText.getText().toString();
        String value2 = nEditText.getText().toString();
        double resultMul = mCalculator.mul(Double.valueOf(value1),Double.valueOf(value2));
        mTextView.setText(String.valueOf(resultMul));

        Log.d("Debugging", "Hello");
    }

    public void div(View view) {
        String value1 = mEditText.getText().toString();
        String value2 = nEditText.getText().toString();
        double resultDiv = mCalculator.div(Double.valueOf(value1),Double.valueOf(value2));
        mTextView.setText(String.valueOf(resultDiv));

        Log.d("Debugging", "Hello");
    }
}