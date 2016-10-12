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
        cadena = posicion +" Saturno" + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "F";

        comprobar();
    }

    public void boton2(View view){
        bts2.setEnabled(false);
        posicion += 1;
        cadena = posicion +" Marte" + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "D";

        comprobar();
    }

    public void boton3(View view){
        bts3.setEnabled(false);
        posicion += 1;
        cadena = posicion +" Mercurio" + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "A";
        comprobar();
    }

    public void boton4(View view){
        bts4.setEnabled(false);
        posicion += 1;
        cadena = posicion +" Urano"+ filas;
        listado.setText(listado.getText() + cadena);
        memoria += "G";

        comprobar();
    }

    public void boton5(View view){
        bts5.setEnabled(false);
        posicion += 1;
        cadena = posicion +" Jupiter" + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "E";

        comprobar();
    }

    public void boton6(View view){
        bts6.setEnabled(false);
        posicion += 1;
        cadena = posicion +" Venus" + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "B";
        comprobar();
    }

    public void boton7(View view){
        bts7.setEnabled(false);
        posicion += 1;
        cadena = posicion +" Tierra" + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "C";
        comprobar();

    }

    public void boton8(View view){
        bts8.setEnabled(false);
        posicion += 1;
        cadena = posicion +" Neptuno" + filas;
        listado.setText(listado.getText() + cadena);
        memoria += "H";

        comprobar();
    }

    public void comprobar(){
        if (posicion == 8){
            if ( memoria.equalsIgnoreCase("ABCDEFGH")){
                //Toast toast = Toast.makeText(getApplicationContext(), "Es correcto", Toast.LENGTH_SHORT);
                //toast.show();
                new AlertDialog.Builder(GamePosPlaneta.this)
                        .setTitle("Tu Puntaje")
                        .setMessage("Resultado Correcto. ¡Felicidades!")
                        .setNeutralButton("Aceptar y salir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                GamePosPlaneta.this.finish();
                            }
                        })
                        .show();

            }else{
                //Toast toast = Toast.makeText(getApplicationContext(), "Respuesta incorrecta", Toast.LENGTH_SHORT);
                //toast.show();
                new AlertDialog.Builder(GamePosPlaneta.this)
                        .setTitle("Tu Puntaje")
                        .setMessage("Resultado Incorrecto! Intente denuevo")
                        .setNeutralButton("Aceptar y salir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
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
