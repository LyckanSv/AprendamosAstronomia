package com.callejas.cesar.aprendamosastronomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Game_mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main_menu);

    }

    public void game1(View view){
        Intent intent = new Intent(this,GamePlaneta.class);
        startActivity(intent);
    }

    public void game2(View view){
        Intent intent = new Intent(this,GameFasesLuna.class);
        startActivity(intent);
    }

    public void game3(View view){
        Intent intent = new Intent(this,GameQueGalaxia.class);
        startActivity(intent);
    }

    public void game4(View view){
        Intent intent = new Intent(this,GameQueGalaxia.class);
        startActivity(intent);
    }

}
