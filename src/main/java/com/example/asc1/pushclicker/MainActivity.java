package com.example.asc1.pushclicker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.media.MediaPlayer;
import java.util.ArrayList;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    ImageButton imageButton;
    Integer count = 0;
    TextView score;
    Integer level = 1;
    TextView levelTracker;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
        score = (TextView) findViewById (R.id.scoreText);
        levelTracker = (TextView) findViewById (R.id.clevel);


        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener (new View.OnClickListener () {

            public void onClick(View v) {

                Intent myIntent = new Intent (v.getContext (), SecondActivity.class);
                startActivity(myIntent);
                //myIntent.putExtra ("", Score.getText ().toString ());

            }
        });


    }






    public void addListenerOnButton() {

        imageButton = (ImageButton) findViewById(R.id.imageButton1);



        imageButton.setOnClickListener(new OnClickListener() {

            MediaPlayer mp1 = MediaPlayer.create (getApplicationContext (), (R.raw.coins));
            MediaPlayer mp2 = MediaPlayer.create (getApplicationContext (), (R.raw.youwentthere));


            @Override
            public void onClick(View arg0) {

                ArrayList <String> frases = new ArrayList <String> ();
                frases.add ("Go There!");
                frases.add ("Did You Push?");
                frases.add ("Woah!");
                frases.add ("Did You Go There?!");
                frases.add ("Try It Now!");
                frases.add ("Check Moodle");
                frases.add ("Here's The Shesudle");

                mp1.start();


                    Toast.makeText(MainActivity.this,
                            frases.get((int) (Math.random() * (frases.size() - 1))), Toast.LENGTH_SHORT).show();


                        count+= level;
                        score.setText (Integer.toString (count));
                        levelTracker.setText (Integer.toString (level));


                if (count > (100 * level) + ((50 * level) /.8))
                {
                    level++;
                    mp2.start ();
                }



            }

        });



    }

}


