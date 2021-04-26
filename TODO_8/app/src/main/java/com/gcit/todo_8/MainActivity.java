package com.gcit.todo_8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button sendbutton;
    EditText leditText;
    Button button;
    EditText shareText;
    Button sharebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.website);
        sendbutton = findViewById(R.id.web);
        leditText = findViewById(R.id.location);
        button = findViewById(R.id.loc);
        shareText = findViewById(R.id.sharetext);
        sharebutton = findViewById(R.id.share);

    }

    public void website(View view) {
        String txt = editText.getText().toString();
        Uri url = Uri.parse(txt);
        Intent obj = new Intent(Intent.ACTION_VIEW, url);
        if(obj.resolveActivity(getPackageManager())!=null){
            startActivity(obj);
        }
        else{

            Log.d("ImplicitIntent", "ERROR");
        }

    }

    public void location(View view) {
        String txt = leditText.getText().toString();
        Uri url = Uri.parse("geo:0,0?q="+txt);
        Intent obj = new Intent(Intent.ACTION_VIEW, url);
        if(obj.resolveActivity(getPackageManager())!=null){
            startActivity(obj);
        }
        else{

            Log.d("ImplicitIntent", "ERROR");
        }
    }


    public void share(View view) {
        String txt = shareText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with")
                .setText(txt)
                .startChooser();
    }
}