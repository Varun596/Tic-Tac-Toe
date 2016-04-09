package com.example.varunelango.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class SingleGameMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(0xFFFFFFFF, WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_game_menu);
    }


    public void onClickSingleGameMenuBack(View view){

        Intent i=new Intent(this,PlayMenu.class);
        startActivity(i);
        finish();
    }

    public void onClickEasy(View view){

        Intent i=new Intent(this,SingleGame.class);
        startActivity(i);
        finish();
    }

    public void onClickHard(View view){

        Intent i=new Intent(this,SingleGameHard.class);
        startActivity(i);
        finish();
    }

}
