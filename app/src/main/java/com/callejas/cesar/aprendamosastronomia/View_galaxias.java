package com.callejas.cesar.aprendamosastronomia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class View_galaxias extends AppCompatActivity {
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
        ingresoDatos = new appDatosG(getString(R.string.tituloGalaxias),getString(R.string.galaxiasInfo),R.drawable.galaxiaespiral1);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloGalaxia1),getString(R.string.infoGalaxia1),R.drawable.galaxiaespiral1);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloGalaxia2),getString(R.string.infoGalaxia2),R.drawable.galaxiaeliptica2);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloGalaxia3),getString(R.string.infoGalaxia3),R.drawable.galaxialenticular3);
        datosSuppor1.add(ingresoDatos);

        ingresoDatos = new appDatosG(getString(R.string.tituloGalaxia4),getString(R.string.infoGalaxia4),R.drawable.galaxiairregular4);
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
        }


    }
}