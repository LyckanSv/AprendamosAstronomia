package com.callejas.cesar.aprendamosastronomia;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class GamePosPlaneta extends AppCompatActivity {
    ImageButton bts1, bts2, bts3, bts4, bts5, bts6, bts7, bts8;
    String filas, cadena;
    TextView listado;
    int posicion = 0;
    MediaPlayer players;
    String memoria = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_pos_planeta);
        bts1 = (ImageButton) findViewById(R.id.bts1);
        bts2 = (ImageButton) findViewById(R.id.bts2);
        bts3 = (ImageButton) findViewById(R.id.bts3);
        bts4 = (ImageButton) findViewById(R.id.bts4);
        bts5 = (ImageButton) findViewById(R.id.bts5);
        bts6 = (ImageButton) findViewById(R.id.bts6);
        bts7 = (ImageButton) findViewById(R.id.bts7);
        bts8 = (ImageButton) findViewById(R.id.bts8);
        listado= (TextView) findViewById(R.id.listado);
        filas = " \n ";
        players = MediaPlayer.create(this, R.raw.song);
        players.setLooping(true);
        players.start();

    }

    public void boton1(View view){
        bts1.setEnabled(false);
        posicion += 1;
        cadena = posicion +". "+ getString(R.string.resPlaneta6) + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "F";

        comprobar();
    }

    public void boton2(View view){
        bts2.setEnabled(false);
        posicion += 1;
        cadena = posicion +". " +getString(R.string.resPlaneta4) + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "D";

        comprobar();
    }

    public void boton3(View view){
        bts3.setEnabled(false);
        posicion += 1;
        cadena = posicion +". "+ getString(R.string.resPlaneta1)+ filas;
        listado.setText(listado.getText() + cadena);
        memoria += "A";
        comprobar();
    }

    public void boton4(View view){
        bts4.setEnabled(false);
        posicion += 1;
        cadena = posicion +". "+ getString(R.string.resPlaneta7)+ filas;
        listado.setText(listado.getText() + cadena);
        memoria += "G";

        comprobar();
    }

    public void boton5(View view){
        bts5.setEnabled(false);
        posicion += 1;
        cadena = posicion +". "+ getString(R.string.resPlaneta5) + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "E";

        comprobar();
    }

    public void boton6(View view){
        bts6.setEnabled(false);
        posicion += 1;
        cadena = posicion +". "+getString(R.string.resPlaneta2)+ filas;
        listado.setText(listado.getText() + cadena);
        memoria += "B";
        comprobar();
    }

    public void boton7(View view){
        bts7.setEnabled(false);
        posicion += 1;
        cadena = posicion +". "+getString(R.string.resPlaneta3)+ filas;
        listado.setText(listado.getText() + cadena);
        memoria += "C";
        comprobar();

    }

    public void boton8(View view){
        bts8.setEnabled(false);
        posicion += 1;
        cadena = posicion +". "+getString(R.string.resPlaneta8) + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "H";

        comprobar();
    }

    public void comprobar(){
        if (posicion == 8){
            if ( memoria.equalsIgnoreCase("ABCDEFGH")){
                new AlertDialog.Builder(GamePosPlaneta.this)
                        .setTitle(getString(R.string.scoreTitle))
                        .setMessage(getString(R.string.scorePosYes))
                        .setPositiveButton(getText(R.string.scoreRest), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                GamePosPlaneta.this.recreate();
                            }
                        })
                        .setNegativeButton(getText(R.string.scoreEx), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                GamePosPlaneta.this.finish();
                            }
                        })
                        .show();

            }else{
                new AlertDialog.Builder(GamePosPlaneta.this)
                        .setTitle(getString(R.string.scoreTitle))
                        .setMessage(getString(R.string.scorePosNo))
                        .setPositiveButton(getText(R.string.scoreRest), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                GamePosPlaneta.this.recreate();
                            }
                        })
                        .setNegativeButton(getText(R.string.scoreEx), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                GamePosPlaneta.this.finish();
                            }
                        })
                        .show();
            }
        }
    }

    @Override
    public void onPause(){
        super.onPause();
        players.pause();
    }
    @Override
    public void onResume(){
        super.onResume();
        players.start();
    }


}
