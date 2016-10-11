package com.callejas.cesar.aprendamosastronomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class View_support2 extends AppCompatActivity {
    appDatosG datos, datosCompleto;
    ArrayList<String> arreglo;
    ImageView itemPic;
    TextView itemTitle, itemContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_support2);

        datos = (appDatosG)getIntent().getSerializableExtra("datoS");

        datosCompleto = (appDatosG)getIntent().getSerializableExtra("datosComp");

        arreglo = (ArrayList<String>)getIntent().getStringArrayListExtra("datosComp");

        itemPic = (ImageView) findViewById(R.id.pictureItem);
        itemTitle =(TextView) findViewById(R.id.itemName);
        itemContent = (TextView) findViewById(R.id.itemContent);

        itemTitle.setText(datos.getNombre());
        itemContent.setText(datos.getContenido());
        itemPic.setImageResource(datos.getPicture());
    }

    public void continuar(View view){

        finish();
    }


    public void regresar(View view){
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        finish();
    }
}
