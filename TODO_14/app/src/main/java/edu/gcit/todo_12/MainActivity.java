package edu.gcit.todo_12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.os.IResultReceiver;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MSG = "edu.gcit.todo12";
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

    }
    public void donut(View view) {
        msg = getString(R.string.donut_order_message);
        displayToast(msg);
    }

    public void ice(View view) {
        msg = getString(R.string.ice_cream_order_message);
        displayToast(msg);
    }

    public void foryo(View view) {
        msg = getString(R.string.froyo_order_message);
        displayToast(msg);

    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void onClick(View view) {
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:77354374"));

        Intent intent = new Intent(MainActivity.this, todo13.class);
        intent.putExtra(EXTRA_MSG, msg);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.order:
                Intent intent = new Intent(this, todo13.class);
                intent.putExtra(EXTRA_MSG, msg);
                startActivity(intent);
                return true;
            case R.id.favourite:
                displayToast("You  selected favourite");
                return true;
            case R.id.contact:
                displayToast("you selected contact");
                return true;
            case R.id.setting:
                displayToast("you selected settings");
                return true;
            default:
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}