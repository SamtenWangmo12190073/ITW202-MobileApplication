package com.gcit.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_replymessage = "com.gcit.todo_4";
    private EditText reply_Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent obj = getIntent();
        String receivemessage = obj.getStringExtra(MainActivity.EXTRA_message);
        TextView receive = findViewById(R.id.textView2);
        receive.setText(receivemessage);
        reply_Message = findViewById(R.id.editText1);
    }

    public void reply(View view) {
        Intent returnobj = new Intent();
        String mssg_reply = reply_Message.getText().toString();
        returnobj.putExtra(EXTRA_replymessage, mssg_reply);
        setResult(RESULT_OK, returnobj);
        finish();
    }
}