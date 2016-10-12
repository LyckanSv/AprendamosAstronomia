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

public class GamePlaneta extends AppCompatActivity {
    Button b1, b2, b3, b4;
    TextView puntaje, numpregunta;
    ImageView pregunta;
    String preguntas[] = new String[8];
    String respuestas[] = new String[8];
    Boolean preguntasRealizadas[] = new Boolean[8];
    int imagen[] = new int[8] ;
    int contadorPuntaje = 0;
    int numeroPreguntas = 0;
    int ids;
    MediaPlayer players, wins, over;
    double valor_anterior;
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
        pregunta = (ImageView) findViewById(R.id.imagenPic);
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


        respuestas[0] = getString(R.string.resPlaneta1);
        respuestas[1] = getString(R.string.resPlaneta2);
        respuestas[2] = getString(R.string.resPlaneta3);
        respuestas[3] = getString(R.string.resPlaneta4);
        respuestas[4] = getString(R.string.resPlaneta5);
        respuestas[5] = getString(R.string.resPlaneta6);
        respuestas[6] = getString(R.string.resPlaneta7);
        respuestas[7] = getString(R.string.resPlaneta8);

        imagen[0] = R.drawable.gamemercurio;
        imagen[1] = R.drawable.gamevenus;
        imagen[2] = R.drawable.gametierra;
        imagen[3] = R.drawable.gamemartes;
        imagen[4] = R.drawable.gamejupiter;
        imagen[5] = R.drawable.gamesaturno;
        imagen[6] = R.drawable.gameurano;
        imagen[7] = R.drawable.gameneptuno;
        for (int i = 0; i < 8 ; i++){
            preguntasRealizadas[i] = true;
        }
    }

    public void selector(){
        double seleccionPregunta = Math.random();
        for (int i = 0; i < 8; i++){
            if (seleccionPregunta >= (0.125*(i)) && seleccionPregunta < (0.125 * (i+1))){
                if( preguntasRealizadas[i]){
                    preguntasRealizadas[i] = false;
                    ids = i;
                    numeroPreguntas += 1;
                    numpregunta.setText("Pregunta " + String.valueOf(numeroPreguntas));
                    pregunta.setImageResource(imagen[i]);
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


        if(seleccionPregunta < 0.125){
            return respuestas[0];
        }
        else if(seleccionPregunta >=0.125 && seleccionPregunta < 0.25){
            return respuestas[1];
        }

        else if(seleccionPregunta >=0.25 && seleccionPregunta < 0.375){
            return respuestas[2];
        }

        else if(seleccionPregunta >=0.375 && seleccionPregunta < 0.5){
            return respuestas[3];
        }

        else if(seleccionPregunta >=0.5 && seleccionPregunta < 0.625){
            return respuestas[4];
        }

        else if(seleccionPregunta >=0.625 && seleccionPregunta < 0.75){
            return respuestas[5];
        }

        else if(seleccionPregunta >=0.75 && seleccionPregunta < 0.875){
            return respuestas[6];
        }

        else {
            return respuestas[7];
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
        if (numeroPreguntas == 8){
            Intent intent = new Intent(GamePlaneta.this, MainActivity.class);
            startActivity(intent);
        }
    }

}