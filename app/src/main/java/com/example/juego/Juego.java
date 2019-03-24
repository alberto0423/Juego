package com.example.juego;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Juego extends AppCompatActivity {
    TextView    textViewUser,txtScore;
    ImageView   imageViewG,imageViewR,imageViewB,imageViewY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        textViewUser    =   (TextView)findViewById(R.id.txtNameUser);
        txtScore        =   (TextView)findViewById(R.id.txtScore);
        imageViewG      =   (ImageView)findViewById(R.id.imageViewGreen);
        imageViewR      =   (ImageView)findViewById(R.id.imageViewRed);
        imageViewB      =   (ImageView)findViewById(R.id.imageViewBlue);
        imageViewY      =   (ImageView)findViewById(R.id.imageViewYellow);


        Bundle  bundle  =   this.getIntent().getExtras();
        textViewUser.setText("Bienvenido: " + " " + bundle.get("Name"));

        imageViewG.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        imageViewG.setImageResource(R.color.imgGreen);
                        /*
                        MediaPlayer mediaPlayer;
                        mediaPlayer =   MediaPlayer.create(getApplicationContext(),R.raw.alarma);
                        mediaPlayer.start();
                        */
                        break;

                    case MotionEvent.ACTION_UP:
                        imageViewG.setImageResource(R.color.colorPrimary);
                }

                return true;
            }
        });


        imageViewR.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        imageViewR.setImageResource(R.color.imgRed);
                        /*
                        MediaPlayer mediaPlayer;
                        mediaPlayer =   MediaPlayer.create(getApplicationContext(),R.raw.alarma);
                        mediaPlayer.start();
                        */
                        break;

                    case MotionEvent.ACTION_UP:
                        imageViewR.setImageResource(R.color.colorAccent);
                }

                return true;
            }
        });
    }
}
