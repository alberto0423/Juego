package com.example.juego;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    TableLayout tableLayout;
    ImageView   imageViewInicial;
    EditText    txtNameUser;
    Button      btnComenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewInicial    =   (ImageView)findViewById(R.id.imgInicial);
        txtNameUser         =   (EditText)findViewById(R.id.txtName);
        btnComenzar         =   (Button)findViewById(R.id.btnStart);

        final String    nameUser    =   txtNameUser.getText().toString();

        btnComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNameUser.getText().toString().equals("")){
                    txtNameUser.setText("Error, debe ingresar un nombre para poder comenzar el juego");
                    Log.i("Ingresar","Debe ingresar un nombre");
                }else {
                    Intent  intent  =   new Intent(getBaseContext(),Juego.class);
                    intent.putExtra("Name",txtNameUser.getText().toString());
                    startActivity(intent);
                    Log.i("Bien","Muy bien: " + " " + txtNameUser.getText().toString());
                }
            }
        });



        //MediaPlayer mediaPlayer;
    //mediaPlayer =   MediaPlayer.create(getApplicationContext(),R.raw.alarma);
    //mediaPlayer.start();


    new CountDownTimer(10000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            Log.e("Conteo"," " + millisUntilFinished/1000);
        }

        @Override
        public void onFinish() {
            Log.e("Terminado","Terminado");
        }

    }.start();
    }
}
