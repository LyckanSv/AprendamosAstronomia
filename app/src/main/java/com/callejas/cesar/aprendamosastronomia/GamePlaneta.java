package com.callejas.cesar.aprendamosastronomia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.Array;

public class GamePlaneta extends AppCompatActivity {
    Button b1, b2, b3, b4;
    TextView puntaje, numpregunta, pregunta;
    String preguntas[] = new String[10];
    String respuestas[] = new String[10];
    Boolean preguntasRealizadas[] = new Boolean[10];
    int contadorPuntaje = 0;
    int numeroPreguntas = 0;
    int ids;
    MediaPlayer players, wins, over;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_planeta);
        b1 = (Button) findViewById(R.id.boton1);
        b2 = (Button) findViewById(R.id.boton2);
        b3 = (Button) findViewById(R.id.boton3);
        b4 = (Button) findViewById(R.id.boton4);
        puntaje = (TextView) findViewById(R.id.puntage);
        numpregunta = (TextView) findViewById(R.id.numPregunta);
        pregunta = (TextView) findViewById(R.id.pregunta);
        players = MediaPlayer.create(this, R.raw.song);
        wins = MediaPlayer.create(this, R.raw.win);
        over = MediaPlayer.create(this, R.raw.error);
        players.setLooping(true);
        players.start();
        arreglos();
        selector();
    }

    public void arreglos(){
        preguntas[0] = getString(R.string.pregunta1);
        preguntas[1] = getString(R.string.pregunta2);
        preguntas[2] = getString(R.string.pregunta3);
        preguntas[3] = getString(R.string.pregunta4);
        preguntas[4] = getString(R.string.pregunta5);
        preguntas[5] = getString(R.string.pregunta6);
        preguntas[6] = getString(R.string.pregunta7);
        preguntas[7] = getString(R.string.pregunta8);
        preguntas[8] = getString(R.string.pregunta9);
        preguntas[9] = getString(R.string.pregunta10);

        respuestas[0] = getString(R.string.respuesta1);
        respuestas[1] = getString(R.string.respuesta2);
        respuestas[2] = getString(R.string.respuesta3);
        respuestas[3] = getString(R.string.respuesta4);
        respuestas[4] = getString(R.string.respuesta5);
        respuestas[5] = getString(R.string.respuesta6);
        respuestas[6] = getString(R.string.respuesta7);
        respuestas[7] = getString(R.string.respuesta8);
        respuestas[8] = getString(R.string.respuesta9);
        respuestas[9] = getString(R.string.respuesta10);

        for (int i = 0; i < 10 ; i++){
            preguntasRealizadas[i] = true;
        }
    }

    public void selector(){
        double seleccionPregunta = Math.random();
        for (int i = 0; i <10; i++){
            if (seleccionPregunta >= (0.1*(i)) && seleccionPregunta < (0.1 * (i+1))){
                if( preguntasRealizadas[i]){
                    preguntasRealizadas[i] = false;
                    ids = i;
                    numeroPreguntas += 1;
                    numpregunta.setText("Pregunta " + String.valueOf(numeroPreguntas));
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


        if(seleccionPregunta < 0.10){
            return respuestas[0];
        }
        else if(seleccionPregunta >0.10 && seleccionPregunta < 0.20){
            return respuestas[1];
        }

        else if(seleccionPregunta >0.20 && seleccionPregunta < 0.30){
            return respuestas[2];
        }

        else if(seleccionPregunta >0.30 && seleccionPregunta < 0.40){
            return respuestas[3];
        }

        else if(seleccionPregunta >0.40 && seleccionPregunta < 0.50){
            return respuestas[4];
        }

        else if(seleccionPregunta >0.50 && seleccionPregunta < 0.60){
            return respuestas[5];
        }

        else if(seleccionPregunta >0.60 && seleccionPregunta < 0.70){
            return respuestas[6];
        }

        else if(seleccionPregunta >0.70 && seleccionPregunta < 0.80){
            return respuestas[7];
        }

        else if(seleccionPregunta >0.80 && seleccionPregunta < 0.90){
            return respuestas[8];
        }

        else {
            return respuestas[9];
        }

    }

    public void constructorPreguntas(String preguntaSeleccionada,String respuestaSeleccionada){
        String tempPregunta, temRespuestaOK, temRespuestaE1, temRespuestaE2, temRespuestaE3;
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

        pregunta.setText(tempPregunta);

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
        if (numeroPreguntas == 10){
            Intent intent = new Intent(GamePlaneta.this, MainActivity.class);
            startActivity(intent);
        }
    }


}
