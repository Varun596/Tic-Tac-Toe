package com.example.varunelango.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class PlayMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(0xFFFFFFFF, WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_menu);
    }

    public void onClickSinglePlayer(View view){

        Intent i=new Intent(this,SingleGameMenu.class);
        startActivity(i);
        finish();

    }

    public void onClickTwoPlayer(View view){

        Intent i=new Intent(this,Game.class);
        startActivity(i);
        finish();

    }

    public void onClickPlayMenuBack(View view){

        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }

}
