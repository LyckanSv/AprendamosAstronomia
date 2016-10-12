package com.callejas.cesar.aprendamosastronomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewGral extends AppCompatActivity {
    appDatosG datos;
    ImageView itemPic;
    TextView  itemTitle, itemContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_gral);

        datos = (appDatosG)getIntent().getSerializableExtra("datos");

        itemPic = (ImageView) findViewById(R.id.pictureItem);
        itemTitle =(TextView) findViewById(R.id.itemName);
        itemContent = (TextView) findViewById(R.id.itemContent);

        itemTitle.setText(datos.getNombre());
        itemContent.setText(datos.getContenido());
        itemPic.setImageResource(datos.getPicture());
    }

    public void regresar(View view){
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        finish();
    }

    public void juegoMenu(View view){
        Intent intent = new Intent(ViewGral.this, Game_mainMenu.class);
        startActivity(intent);
    }
}
