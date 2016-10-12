package com.callejas.cesar.aprendamosastronomia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class View_satelites extends AppCompatActivity {
    ArrayList<appDatosG> datosSuppor1 = new ArrayList<>();
    ImageView itemPic;
    TextView  itemTitle, itemContent;
    int pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_satelites);

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
        ingresoDatos = new appDatosG(getString(R.string.tituloSatelite1),getString(R.string.satelite1Info),R.drawable.ganymede);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloSatelite2),getString(R.string.satelite2Info),R.drawable.titan);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloSatelite3),getString(R.string.satelite3Info),R.drawable.callisto);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloSatelite4),getString(R.string.satelite4Info),R.drawable.io);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloSatelite5),getString(R.string.satelite5Info),R.drawable.themoon);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloSatelite6),getString(R.string.satelite6Info),R.drawable.europa);
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
        }


    }
}
