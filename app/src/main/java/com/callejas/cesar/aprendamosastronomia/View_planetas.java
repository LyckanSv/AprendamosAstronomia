package com.callejas.cesar.aprendamosastronomia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class View_planetas extends AppCompatActivity {
    ArrayList<appDatosG> datosSuppor1 = new ArrayList<>();
    ImageView itemPic;
    TextView  itemTitle, itemContent;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_planetas);

        agregarSupport();

        pos=0;

        itemPic = (ImageView) findViewById(R.id.pictureItem);
        itemTitle =(TextView) findViewById(R.id.itemName);
        itemContent = (TextView) findViewById(R.id.itemContent);

        itemTitle.setText(datosSuppor1.get(0).getNombre());
        itemContent.setText(datosSuppor1.get(0).getContenido());
        itemPic.setImageResource(datosSuppor1.get(0).getPicture());
    }

    public void agregarSupport(){
        appDatosG ingresoDatos;
        ingresoDatos = new appDatosG(getString(R.string.tituloMercurio),getString(R.string.mercurioInfo),R.drawable.mercurionew);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloVenus),getString(R.string.venusInfo),R.drawable.venusnew);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloTierra),getString(R.string.tierraInfo),R.drawable.tierranew);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloMarte),getString(R.string.marteInfo),R.drawable.martenew);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloJupiter),getString(R.string.jupiterInfo),R.drawable.jupiternew);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloSaturno),getString(R.string.saturnoInfo),R.drawable.saturnonew);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloUrano),getString(R.string.uranoInfo),R.drawable.uranonew);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloNeptuno),getString(R.string.neptunoInfo),R.drawable.neptunonew);
        datosSuppor1.add(ingresoDatos);
    }

    public void continuar(View view){
        if(pos==0){
            pos=1;
            itemTitle.setText(datosSuppor1.get(1).getNombre());
            itemContent.setText(datosSuppor1.get(1).getContenido());
            itemPic.setImageResource(datosSuppor1.get(1).getPicture());
        } else if(pos==1){
            pos=2;
            itemTitle.setText(datosSuppor1.get(2).getNombre());
            itemContent.setText(datosSuppor1.get(2).getContenido());
            itemPic.setImageResource(datosSuppor1.get(2).getPicture());
        } else if(pos==2){
            pos=3;
            itemTitle.setText(datosSuppor1.get(3).getNombre());
            itemContent.setText(datosSuppor1.get(3).getContenido());
            itemPic.setImageResource(datosSuppor1.get(3).getPicture());
        } else if(pos==3){
            pos=4;
            itemTitle.setText(datosSuppor1.get(4).getNombre());
            itemContent.setText(datosSuppor1.get(4).getContenido());
            itemPic.setImageResource(datosSuppor1.get(4).getPicture());
        } else if(pos==4){
            pos=5;
            itemTitle.setText(datosSuppor1.get(5).getNombre());
            itemContent.setText(datosSuppor1.get(5).getContenido());
            itemPic.setImageResource(datosSuppor1.get(5).getPicture());
        } else if(pos==5){
            pos=6;
            itemTitle.setText(datosSuppor1.get(6).getNombre());
            itemContent.setText(datosSuppor1.get(6).getContenido());
            itemPic.setImageResource(datosSuppor1.get(6).getPicture());

        } else if (pos==6){
            pos=7;
            itemTitle.setText(datosSuppor1.get(7).getNombre());
            itemContent.setText(datosSuppor1.get(7).getContenido());
            itemPic.setImageResource(datosSuppor1.get(7).getPicture());
        } else if(pos==7){
            finish();
        }
    }


    public void regresar(View view){
        if(pos==0){
            finish();
        } else if(pos==1){
            pos=0;
            itemTitle.setText(datosSuppor1.get(0).getNombre());
            itemContent.setText(datosSuppor1.get(0).getContenido());
            itemPic.setImageResource(datosSuppor1.get(0).getPicture());
        } else if(pos==2){
            pos=1;
            itemTitle.setText(datosSuppor1.get(1).getNombre());
            itemContent.setText(datosSuppor1.get(1).getContenido());
            itemPic.setImageResource(datosSuppor1.get(1).getPicture());
        } else if(pos==3){
            pos=2;
            itemTitle.setText(datosSuppor1.get(2).getNombre());
            itemContent.setText(datosSuppor1.get(2).getContenido());
            itemPic.setImageResource(datosSuppor1.get(2).getPicture());
        } else if(pos==4){
            pos=3;
            itemTitle.setText(datosSuppor1.get(3).getNombre());
            itemContent.setText(datosSuppor1.get(3).getContenido());
            itemPic.setImageResource(datosSuppor1.get(3).getPicture());
        } else if(pos==5){
            pos=4;
            itemTitle.setText(datosSuppor1.get(4).getNombre());
            itemContent.setText(datosSuppor1.get(4).getContenido());
            itemPic.setImageResource(datosSuppor1.get(4).getPicture());
        } else if (pos==6){
            pos=5;
            itemTitle.setText(datosSuppor1.get(5).getNombre());
            itemContent.setText(datosSuppor1.get(5).getContenido());
            itemPic.setImageResource(datosSuppor1.get(5).getPicture());
        } else if (pos==7){
            pos=6;
            itemTitle.setText(datosSuppor1.get(6).getNombre());
            itemContent.setText(datosSuppor1.get(6).getContenido());
            itemPic.setImageResource(datosSuppor1.get(6).getPicture());
        }
    }
}
