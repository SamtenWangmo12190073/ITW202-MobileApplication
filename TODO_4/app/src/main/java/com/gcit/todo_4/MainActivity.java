package com.gcit.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String  EXTRA_message = "com.gcit.todo_4";
    private EditText message;
    public static final int Textrequest = 1;
    private TextView replyheader;
    private TextView replymessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.editText1);
        replyheader = findViewById(R.id.textView3);
        replymessage = findViewById(R.id.textView4);
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