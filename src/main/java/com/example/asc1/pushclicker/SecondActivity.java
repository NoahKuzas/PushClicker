package com.example.asc1.pushclicker;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;



import java.util.ArrayList;


public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


                Intent intent = getIntent();


            }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*public void addListenerOnButton() {

        Button Button = (Button) findViewById(R.id.button);
        Button Button1 = (Button) findViewById(R.id.button2);
        Button Button2 = (Button) findViewById(R.id.button3);
        Button Button3 = (Button) findViewById(R.id.button4);
        Button Button4 = (Button) findViewById(R.id.button5);
        Button Button5 = (Button) findViewById(R.id.button6);
        Button Button6 = (Button) findViewById(R.id.button7);
        Button Button7 = (Button) findViewById(R.id.button8);


        Button.setOnClickListener(new View.OnClickListener() {

            //MediaPlayer mp1 = MediaPlayer.create (getApplicationContext (), (R.raw.coins));


            @Override

        });
    }*/
}
