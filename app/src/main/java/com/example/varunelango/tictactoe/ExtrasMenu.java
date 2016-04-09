package com.example.varunelango.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class ExtrasMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(0xFFFFFFFF, WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras_menu);
    }

    public void onClickBack(View view){

        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }

    public void onClickTiltBall(View view){

        Intent i=new Intent(this,TiltBall.class);
        startActivity(i);
        finish();
    }



}
