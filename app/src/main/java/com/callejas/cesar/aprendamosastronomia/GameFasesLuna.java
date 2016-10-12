package com.callejas.cesar.aprendamosastronomia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.Array;

public class GameFasesLuna extends AppCompatActivity {
    Button b1, b2, b3, b4;
    TextView puntaje, numpregunta;
    ImageView lunaPic;
    int preguntas[] = new int[4];
    String respuestas[] = new String[4];
    Boolean preguntasRealizadas[] = new Boolean[4];
    int contadorPuntaje = 0;
    int numeroPreguntas = 0;
    int ids;
    MediaPlayer players, wins, over;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_fases_luna);

        b1 = (Button) findViewById(R.id.boton1);
        b2 = (Button) findViewById(R.id.boton2);
        b3 = (Button) findViewById(R.id.boton3);
        b4 = (Button) findViewById(R.id.boton4);


        puntaje = (TextView) findViewById(R.id.puntage);
        numpregunta = (TextView) findViewById(R.id.numPregunta);
        lunaPic = (ImageView) findViewById(R.id.lunaPic);
        players = MediaPlayer.create(this, R.raw.song);
        wins = MediaPlayer.create(this, R.raw.win);
        over = MediaPlayer.create(this, R.raw.error);
        players.setLooping(true);
        players.start();
        arreglos();
        selector();
    }

    public void arreglos(){
        preguntas[0] = R.drawable.lunafase1nueva;
        preguntas[1] = R.drawable.lunafase2cuartocre;
        preguntas[2] = R.drawable.lunafase4llena;
        preguntas[3] = R.drawable.lunafase3cuartomeng;


        respuestas[0] = getString(R.string.resLuna1);
        respuestas[1] = getString(R.string.resLuna2);
        respuestas[2] = getString(R.string.resLuna3);
        respuestas[3] = getString(R.string.resLuna4);

        for (int i = 0; i < 4; i++){
            preguntasRealizadas[i] = true;
        }
    }

    public void selector(){
        double seleccionPregunta = Math.random();
        for (int i = 0; i <4; i++){
            if (seleccionPregunta >= (0.25*(i)) && seleccionPregunta < (0.25 * (i+1))){
                if( preguntasRealizadas[i]){
                    preguntasRealizadas[i] = false;
                    ids = i;
                    numeroPreguntas += 1;
                    numpregunta.setText(R.string.tituloLun);
                    constructorPreguntas(preguntas[(i)],respuestas[i]);
                }
                else{
                    selector();
                }


            }
        }
    }

    public String respuestasSeleccion(){
        double seleccionPregunta = Math.random();

        if(seleccionPregunta < 0.25){
            return respuestas[0];
        }
        if(seleccionPregunta >=0.25 && seleccionPregunta <= 0.50){
            return respuestas[1];
        }

        if(seleccionPregunta >=0.50 && seleccionPregunta <= 0.75){
            return respuestas[2];
        }

        else {
            return respuestas[3];
        }


    }

    public void constructorPreguntas(int preguntaSeleccionada,String respuestaSeleccionada){
        String  temRespuestaOK, temRespuestaE1, temRespuestaE2, temRespuestaE3;
        int tempPregunta;
        tempPregunta = preguntaSeleccionada;
        temRespuestaOK = respuestaSeleccionada;
        temRespuestaE1 = temRespuestaOK;
        temRespuestaE2 = temRespuestaOK;
        temRespuestaE3 = temRespuestaOK;

        while (temRespuestaOK == temRespuestaE1 ){

            temRespuestaE1 = respuestasSeleccion();
        }

        while (temRespuestaOK == temRespuestaE2 || temRespuestaE1 == temRespuestaE2 ){

            temRespuestaE2 = respuestasSeleccion();
        }

        while (temRespuestaOK == temRespuestaE3 || temRespuestaE1 == temRespuestaE3 || temRespuestaE2 == temRespuestaE3 ){
            temRespuestaE3 = respuestasSeleccion();
        }

        lunaPic.setImageResource(tempPregunta);

        double aleatorio = Math.random();

        if(aleatorio < 0.25){
            b1.setText(temRespuestaOK);
            b2.setText(temRespuestaE1);
            b3.setText(temRespuestaE2);
            b4.setText(temRespuestaE3);
        }

        if(aleatorio >= 0.25 && aleatorio <0.50){
            b2.setText(temRespuestaOK);
            b1.setText(temRespuestaE1);
            b3.setText(temRespuestaE2);
            b4.setText(temRespuestaE3);
        }

        if(aleatorio >= 0.50 && aleatorio <0.75){
            b3.setText(temRespuestaOK);
            b1.setText(temRespuestaE1);
            b2.setText(temRespuestaE2);
            b4.setText(temRespuestaE3);
        }

        if(aleatorio >= 0.75){
            b4.setText(temRespuestaOK);
            b1.setText(temRespuestaE1);
            b2.setText(temRespuestaE2);
            b3.setText(temRespuestaE3);
        }

    }

    public void boton1(View view){
        if(respuestas[ids] == b1.getText() ){
            Toast toast = Toast.makeText(getApplicationContext(), "Pregunta correcta", Toast.LENGTH_SHORT);
            wins.start();
            toast.show();
            contadorPuntaje += 10;
            puntaje.setText(String.valueOf(contadorPuntaje));
            overQuestions();
            selector();

        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Pregunta incorrecta", Toast.LENGTH_SHORT);
            toast.show();
            over.start();
        }
    }

    public void boton2(View view){
        if(respuestas[ids] == b2.getText() ){
            Toast toast = Toast.makeText(getApplicationContext(), "Pregunta correcta", Toast.LENGTH_SHORT);
            wins.start();
            toast.show();
            contadorPuntaje += 10;
            puntaje.setText(String.valueOf(contadorPuntaje));
            overQuestions();
            selector();

        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Pregunta incorrecta", Toast.LENGTH_SHORT);
            toast.show();
            over.start();
        }
    }

    public void boton3(View view){
        if(respuestas[ids] == b3.getText() ){
            Toast toast = Toast.makeText(getApplicationContext(), "Pregunta correcta", Toast.LENGTH_SHORT);
            wins.start();
            toast.show();
            contadorPuntaje += 10;
            puntaje.setText(String.valueOf(contadorPuntaje));
            overQuestions();
            selector();

        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Pregunta incorrecta", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void boton4(View view){
        if(respuestas[ids] == b4.getText() ){
            Toast toast = Toast.makeText(getApplicationContext(), "Pregunta correcta", Toast.LENGTH_SHORT);
            wins.start();
            toast.show();
            contadorPuntaje += 10;
            puntaje.setText(String.valueOf(contadorPuntaje));
            overQuestions();
            selector();
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Pregunta incorrecta", Toast.LENGTH_SHORT);
            toast.show();
            over.start();
        }
    }

    public void overQuestions(){
        if (numeroPreguntas == 4){
            Intent intent = new Intent(GameFasesLuna.this, MainActivity.class);
            startActivity(intent);

        }
    }


}