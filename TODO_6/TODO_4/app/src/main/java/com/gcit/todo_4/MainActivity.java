 package com.gcit.todo_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.security.Key;
 
 public class MainActivity extends AppCompatActivity {
    public static final String  EXTRA_message = "com.gcit.todo_4";
    private EditText message;
    public static final int Textrequest = 1;
    private TextView replyheader;
    private TextView replymessage;

    private static final String LOG_TAG = MainActivity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.editText1);
        replyheader = findViewById(R.id.textView3);
        replymessage = findViewById(R.id.textView4);
        Log.d(LOG_TAG, "onCreate");

        //to save the instance displaying activity
        if(savedInstanceState != null){
            boolean isVisible = savedInstanceState.getBoolean("reply_state");
            if (isVisible){
                replyheader.setVisibility(View.VISIBLE);
                replymessage.setText(savedInstanceState.getString("reply_state_message"));
                replymessage.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG,"onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG,"onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(LOG_TAG,"onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG,"onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG,"onDestroy");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG,"onRestart");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        if(replymessage.getVisibility() == View.VISIBLE){
            outState.putBoolean("reply_state", true);
            outState.putString("reply_state_message", replymessage.getText().toString());
        }
    }


    public void send(View view) {
        Intent obj = new Intent(this,MainActivity2.class);
        String sendmessage = message.getText().toString();
        obj.putExtra(EXTRA_message, sendmessage);
        startActivityForResult(obj, Textrequest);
    }
     public void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Textrequest){
            if(resultCode == RESULT_OK){
                String final_mssg = data.getStringExtra(MainActivity2.EXTRA_replymessage);
                replyheader.setVisibility(View.VISIBLE);
                replymessage.setText(final_mssg);
                replymessage.setVisibility(View.VISIBLE);
            }
        }
     }
}