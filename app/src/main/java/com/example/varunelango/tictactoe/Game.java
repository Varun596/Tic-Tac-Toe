package com.example.varunelango.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class Game extends Activity {


    ImageButton button1,button2,button3,button4,button5,button6,button7,button8,button9;

    int turn=-1;
    int c,xc,oc;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(0xFFFFFFFF, WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        button1 = (ImageButton)findViewById(R.id.button1);
        button2 = (ImageButton)findViewById(R.id.button2);
        button3 = (ImageButton)findViewById(R.id.button3);
        button4 = (ImageButton)findViewById(R.id.button4);
        button5 = (ImageButton)findViewById(R.id.button5);
        button6 = (ImageButton)findViewById(R.id.button6);
        button7 = (ImageButton)findViewById(R.id.button7);
        button8 = (ImageButton)findViewById(R.id.button8);
        button9 = (ImageButton)findViewById(R.id.button9);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String name = preferences.getString("TotalValue", "");
        String x = preferences.getString("XValue", "0");
        String o = preferences.getString("OValue", "0");

        c= Integer.parseInt(name);
        xc= Integer.parseInt(x);
        oc= Integer.parseInt(o);

        mp = MediaPlayer.create(this, R.raw.neck_snap);
    }

    public void onClickPlayBack(View view){

        Intent i=new Intent(this,PlayMenu.class);
        startActivity(i);
        finish();
    }

    public void onClickButton(View view) {
        mp.start();


        turn++;

        if (view == button1) {

            if(button1.getTag()==null)
            {
            if (turn % 2 == 0){
                button1.setImageResource(R.drawable.xbutton);
                button1.setTag("X");}
            else{
                button1.setImageResource(R.drawable.obutton);
                button1.setTag("O");}
            }
            else
                turn--;

            checkResult();
        }

        if (view == button2) {

            if(button2.getTag()==null)
            {
                if (turn % 2 == 0){
                    button2.setImageResource(R.drawable.xbutton);
                    button2.setTag("X");}
                else{
                    button2.setImageResource(R.drawable.obutton);
                    button2.setTag("O");}
            }
            else
                turn--;

            checkResult();
        }

        if (view == button3) {

            if(button3.getTag()==null)
            {
                if (turn % 2 == 0){
                    button3.setImageResource(R.drawable.xbutton);
                    button3.setTag("X");}
                else{
                    button3.setImageResource(R.drawable.obutton);
                    button3.setTag("O");}
            }
            else
                turn--;

            checkResult();
        }

        if (view == button4) {

            if(button4.getTag()==null)
            {
                if (turn % 2 == 0){
                    button4.setImageResource(R.drawable.xbutton);
                    button4.setTag("X");}
                else{
                    button4.setImageResource(R.drawable.obutton);
                    button4.setTag("O");}
            }
            else
                turn--;

            checkResult();
        }

        if (view == button5) {

            if(button5.getTag()==null)
            {
                if (turn % 2 == 0){
                    button5.setImageResource(R.drawable.xbutton);
                    button5.setTag("X");}
                else{
                    button5.setImageResource(R.drawable.obutton);
                    button5.setTag("O");}
            }
            else
                turn--;

            checkResult();
        }

        if (view == button6) {

            if(button6.getTag()==null)
            {
                if (turn % 2 == 0){
                    button6.setImageResource(R.drawable.xbutton);
                    button6.setTag("X");}
                else{
                    button6.setImageResource(R.drawable.obutton);
                    button6.setTag("O");}
            }
            else
                turn--;

            checkResult();
        }

        if (view == button7) {

            if(button7.getTag()==null)
            {
                if (turn % 2 == 0){
                    button7.setImageResource(R.drawable.xbutton);
                    button7.setTag("X");}
                else{
                    button7.setImageResource(R.drawable.obutton);
                    button7.setTag("O");}
            }
            else
                turn--;

            checkResult();
        }

        if (view == button8) {

            if(button8.getTag()==null)
            {
                if (turn % 2 == 0){
                    button8.setImageResource(R.drawable.xbutton);
                    button8.setTag("X");}
                else{
                    button8.setImageResource(R.drawable.obutton);
                    button8.setTag("O");}
            }
            else
                turn--;

            checkResult();
        }

        if (view == button9) {

            if(button9.getTag()==null)
            {
                if (turn % 2 == 0){
                    button9.setImageResource(R.drawable.xbutton);
                    button9.setTag("X");}
                else{
                    button9.setImageResource(R.drawable.obutton);
                    button9.setTag("O");}
            }
            else
                turn--;

            checkResult();
        }
    }

    public void checkResult(){

        if(button1.getTag()==button2.getTag()&&button1.getTag()==button3.getTag()&&button1.getTag()!=null) {
            GotoMain();
        }

        if(button1.getTag()==button4.getTag()&&button1.getTag()==button7.getTag()&&button1.getTag()!=null) {
            GotoMain();
        }

        if(button2.getTag()==button5.getTag()&&button2.getTag()==button8.getTag()&&button2.getTag()!=null) {
            GotoMain();
        }

        if(button3.getTag()==button6.getTag()&&button3.getTag()==button9.getTag()&&button3.getTag()!=null) {
            GotoMain();
        }

        if(button4.getTag()==button5.getTag()&&button4.getTag()==button6.getTag()&&button4.getTag()!=null) {
            GotoMain();
        }

        if(button7.getTag()==button8.getTag()&&button7.getTag()==button9.getTag()&&button7.getTag()!=null) {
            GotoMain();
        }

        if(button1.getTag()==button5.getTag()&&button1.getTag()==button9.getTag()&&button1.getTag()!=null) {
            GotoMain();
        }

        if(button3.getTag()==button5.getTag()&&button3.getTag()==button7.getTag()&&button3.getTag()!=null) {
           GotoMain();
        }

        if(button1.getTag()!=null&&button2.getTag()!=null&&button3.getTag()!=null&&button4.getTag()!=null&&button5.getTag()!=null&&button6.getTag()!=null&&button7.getTag()!=null&&button8.getTag()!=null&&button9.getTag()!=null) {
            turn=1000;
            GotoMain();
        }

    }

    public void GotoMain(){
        c++;
        if(turn==1000)
        {Toast.makeText(Game.this, "Draw", Toast.LENGTH_LONG).show();
        }
        else if(turn%2==0)
        {Toast.makeText(Game.this, "X Won", Toast.LENGTH_LONG).show();
            xc++;
        }

        else {
            Toast.makeText(Game.this, "O Won", Toast.LENGTH_LONG).show();
            oc++;
        }

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("TotalValue",String.valueOf(c));
        editor.putString("XValue",String.valueOf(xc));
        editor.putString("OValue",String.valueOf(oc));
        editor.apply();
        Intent i=new Intent(this,PlayMenu.class);
        startActivity(i);
        finish();
    }



}
