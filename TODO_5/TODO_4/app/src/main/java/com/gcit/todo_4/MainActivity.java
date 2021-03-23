 package com.gcit.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        Log.d(LOG_TAG,"onResume");
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