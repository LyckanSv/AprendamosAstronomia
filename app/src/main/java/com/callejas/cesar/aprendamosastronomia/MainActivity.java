package com.callejas.cesar.aprendamosastronomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<appDatosG> datosGenerales = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregarDatos();
    }


    public void agregarDatos(){
        appDatosG ingresoDatos;
        ingresoDatos = new appDatosG(getString(R.string.tituloSistemaSol),getString(R.string.sistemaSolInfo),R.drawable.universo);
        datosGenerales.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloSol),getString(R.string.elSolInfo),R.drawable.sun);
        datosGenerales.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloLuna),getString(R.string.laLunaInfo),R.drawable.moon);
        datosGenerales.add(ingresoDatos);

        ingresoDatos= new appDatosG(getString(R.string.tituloEstrellas),getString(R.string.estrellasInfo),R.drawable.start);
        datosGenerales.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloConstelacion),getString(R.string.constelacionesInfo),R.drawable.constelaciones);
        datosGenerales.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloNavesEspaciales),getString(R.string.navesEspacialesInfo),R.drawable.nave);
        datosGenerales.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloGalaxias),getString(R.string.galaxiasInfo),R.drawable.galaxia);
        datosGenerales.add(ingresoDatos);
    }

    public void sistemaSolar(View view){
        Intent intent = new Intent(this,ViewGral.class);
        intent.putExtra("datos",datosGenerales.get(0));
        startActivity(intent);
    }

    public void losPlanetas(View view){
        Intent intent = new Intent(this,View_planetas.class);
        startActivity(intent);
    }

    public void satelitesGrandes(View view){
        Intent intent = new Intent(this,View_satelites.class);
        startActivity(intent);
    }

    public void elSol(View view){
        Intent intent = new Intent(this,ViewGral.class);
        intent.putExtra("datos",datosGenerales.get(1));
        startActivity(intent);
    }

    public void laLuna(View view){
        Intent intent = new Intent(this,ViewGral.class);
        intent.putExtra("datos",datosGenerales.get(2));
        startActivity(intent);
    }

    public void lasEstrellas(View view){
        Intent intent = new Intent(this,ViewGral.class);
        intent.putExtra("datos",datosGenerales.get(3));
        startActivity(intent);
    }

    public void constelaciones(View view){
        Intent intent = new Intent(this,ViewGral.class);
        intent.putExtra("datos",datosGenerales.get(4));
        startActivity(intent);
    }

    public void navesEsp(View view){
        Intent intent = new Intent(this,ViewGral.class);
        intent.putExtra("datos",datosGenerales.get(5));
        startActivity(intent);
    }


    public void galaxias(View view){
        Intent intent = new Intent(this,ViewGral.class);
        intent.putExtra("datos",datosGenerales.get(6));
        startActivity(intent);
    }

    public void startGamesMenu(View view){
        Intent intent = new Intent(this,Game_mainMenu.class);
        startActivity(intent);
    }

<<<<<<< HEAD
    public void gamepla(View view){
        Intent intent = new Intent(this,GamePlaneta.class);
        startActivity(intent);
    }

    public void gameGalax(View view){
        Intent intent = new Intent(this,GameQueGalaxia.class);
        startActivity(intent);
    }





=======
>>>>>>> refs/remotes/origin/master
}
