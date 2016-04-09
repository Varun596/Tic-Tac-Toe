package com.example.varunelango.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;


public class SingleGameHard extends Activity {

    ImageButton button1, button2, button3, button4, button5, button6, button7, button8, button9;

    int turn = -1,i,i1,i2,s1,s2,s3,s4,s5,s6,s7,s8;
    int[] a = new int[10];
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(0xFFFFFFFF, WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_game_hard);

        button1 = (ImageButton) findViewById(R.id.button1);
        button2 = (ImageButton) findViewById(R.id.button2);
        button3 = (ImageButton) findViewById(R.id.button3);
        button4 = (ImageButton) findViewById(R.id.button4);
        button5 = (ImageButton) findViewById(R.id.button5);
        button6 = (ImageButton) findViewById(R.id.button6);
        button7 = (ImageButton) findViewById(R.id.button7);
        button8 = (ImageButton) findViewById(R.id.button8);
        button9 = (ImageButton) findViewById(R.id.button9);

        mp = MediaPlayer.create(this, R.raw.neck_snap);

    }

    public void onClickPlayBack(View view) {

        Intent i = new Intent(this, SingleGameMenu.class);
        startActivity(i);
        finish();
    }

    public void onClickButton(View view) {

        mp.start();


        turn++;
        s1=s2=s3=s4=s5=s6=s7=s8=0;

        if (view == button1) {

            if (button1.getTag() == null) {
                if (turn % 2 == 0) {
                    button1.setImageResource(R.drawable.xbutton);
                    button1.setTag("X");
                    a[0]=3;
                } else {
                    button1.setImageResource(R.drawable.obutton);
                    button1.setTag("O");
                    a[0]=5;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGameHard.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 2) {
                Toast.makeText(SingleGameHard.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 1) {
                Toast.makeText(SingleGameHard.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                for(i1=0;i1<3;i1++) {
                    s1 += a[i1];
                    s2 += a[i1+3];
                    s3 += a[i1+6];
                }
                for(i2=0;i2<9;i2+=3) {
                    s4 += a[i2];
                    s5 += a[i2+1];
                    s6 += a[i2+2];
                }
                s7+=(a[0]+a[4]+a[8]);
                s8+=(a[2]+a[4]+a[6]);
                if(s1==6||s2==6||s3==6||s4==6||s5==6||s6==6||s7==6||s8==6||s1==10||s2==10||s3==10||s4==10||s5==10||s6==10||s7==10||s8==10)
                {

                    Check(s1,s2,s3,s4,s5,s6,s7,s8);


                }

                else if(a[4]==0)
                    button5.performClick();
                else
                {
                    i=randInt(8);
                    while(a[i]!=0)
                        i=randInt(8);
                    if (i==0)
                        button1.performClick();
                    else if (i==2)
                        button3.performClick();
                    else if (i==3)
                        button4.performClick();
                    else if (i==4)
                        button5.performClick();
                    else if (i==5)
                        button6.performClick();
                    else if (i==6)
                        button7.performClick();
                    else if (i==7)
                        button8.performClick();
                    else if (i==8)
                        button9.performClick();

                }

            }
        }

        if (view == button2) {

            if (button2.getTag() == null) {
                if (turn % 2 == 0) {
                    button2.setImageResource(R.drawable.xbutton);
                    button2.setTag("X");
                    a[1]=3;
                } else {
                    button2.setImageResource(R.drawable.obutton);
                    button2.setTag("O");
                    a[1]=5;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGameHard.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGameHard.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGameHard.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                for(i1=0;i1<3;i1++) {
                    s1 += a[i1];
                    s2 += a[i1+3];
                    s3 += a[i1+6];
                }
                for(i2=0;i2<9;i2+=3) {
                    s4 += a[i2];
                    s5 += a[i2+1];
                    s6 += a[i2+2];
                }
                s7+=(a[0]+a[4]+a[8]);
                s8+=(a[2]+a[4]+a[6]);
                if(s1==6||s2==6||s3==6||s4==6||s5==6||s6==6||s7==6||s8==6||s1==10||s2==10||s3==10||s4==10||s5==10||s6==10||s7==10||s8==10)
                {

                    Check(s1,s2,s3,s4,s5,s6,s7,s8);


                }
                else if(a[4]==0)
                    button5.performClick();
                else {
                    i = randInt(8);
                    while (a[i] == 1)
                        i = randInt(8);
                    if (i == 0)
                        button1.performClick();
                    else if (i == 2)
                        button3.performClick();
                    else if (i == 3)
                        button4.performClick();
                    else if (i == 4)
                        button5.performClick();
                    else if (i == 5)
                        button6.performClick();
                    else if (i == 6)
                        button7.performClick();
                    else if (i == 7)
                        button8.performClick();
                    else if (i == 8)
                        button9.performClick();
                }
            }
        }

        if (view == button3) {

            if (button3.getTag() == null) {
                if (turn % 2 == 0) {
                    button3.setImageResource(R.drawable.xbutton);
                    button3.setTag("X");
                    a[2]=3;
                } else {
                    button3.setImageResource(R.drawable.obutton);
                    button3.setTag("O");
                    a[2]=5;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGameHard.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGameHard.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGameHard.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                for(i1=0;i1<3;i1++) {
                    s1 += a[i1];
                    s2 += a[i1+3];
                    s3 += a[i1+6];
                }
                for(i2=0;i2<9;i2+=3) {
                    s4 += a[i2];
                    s5 += a[i2+1];
                    s6 += a[i2+2];
                }
                s7+=(a[0]+a[4]+a[8]);
                s8+=(a[2]+a[4]+a[6]);
                if(s1==6||s2==6||s3==6||s4==6||s5==6||s6==6||s7==6||s8==6||s1==10||s2==10||s3==10||s4==10||s5==10||s6==10||s7==10||s8==10)
                {

                    Check(s1,s2,s3,s4,s5,s6,s7,s8);


                }
                else if(a[4]==0)
                    button5.performClick();
                else {
                    i = randInt(8);
                    while (a[i] == 1)
                        i = randInt(8);
                    if (i == 0)
                        button1.performClick();
                    if (i == 1)
                        button2.performClick();
                    else if (i == 3)
                        button4.performClick();
                    else if (i == 4)
                        button5.performClick();
                    else if (i == 5)
                        button6.performClick();
                    else if (i == 6)
                        button7.performClick();
                    else if (i == 7)
                        button8.performClick();
                    else if (i == 8)
                        button9.performClick();
                }


            }
        }

        if (view == button4) {

            if (button4.getTag() == null) {
                if (turn % 2 == 0) {
                    button4.setImageResource(R.drawable.xbutton);
                    button4.setTag("X");
                    a[3]=3;
                } else {
                    button4.setImageResource(R.drawable.obutton);
                    button4.setTag("O");
                    a[3]=5;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGameHard.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGameHard.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGameHard.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                for(i1=0;i1<3;i1++) {
                    s1 += a[i1];
                    s2 += a[i1+3];
                    s3 += a[i1+6];
                }
                for(i2=0;i2<9;i2+=3) {
                    s4 += a[i2];
                    s5 += a[i2+1];
                    s6 += a[i2+2];
                }
                s7+=(a[0]+a[4]+a[8]);
                s8+=(a[2]+a[4]+a[6]);
                if(s1==6||s2==6||s3==6||s4==6||s5==6||s6==6||s7==6||s8==6||s1==10||s2==10||s3==10||s4==10||s5==10||s6==10||s7==10||s8==10)
                {

                    Check(s1,s2,s3,s4,s5,s6,s7,s8);


                }
                else if(a[4]==0)
                    button5.performClick();
                else {
                    i = randInt(8);
                    while (a[i] == 1)
                        i = randInt(8);
                    if (i == 0)
                        button1.performClick();
                    else if (i == 1)
                        button2.performClick();
                    else if (i == 2)
                        button3.performClick();
                    else if (i == 4)
                        button5.performClick();
                    else if (i == 5)
                        button6.performClick();
                    else if (i == 6)
                        button7.performClick();
                    else if (i == 7)
                        button8.performClick();
                    else if (i == 8)
                        button9.performClick();
                }
            }
        }

        if (view == button5) {

            if (button5.getTag() == null) {
                if (turn % 2 == 0) {
                    button5.setImageResource(R.drawable.xbutton);
                    button5.setTag("X");
                    a[4]=3;
                } else {
                    button5.setImageResource(R.drawable.obutton);
                    button5.setTag("O");
                    a[4]=5;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGameHard.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGameHard.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGameHard.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                for(i1=0;i1<3;i1++) {
                    s1 += a[i1];
                    s2 += a[i1+3];
                    s3 += a[i1+6];
                }
                for(i2=0;i2<9;i2+=3) {
                    s4 += a[i2];
                    s5 += a[i2+1];
                    s6 += a[i2+2];
                }
                s7+=(a[0]+a[4]+a[8]);
                s8+=(a[2]+a[4]+a[6]);
                if(s1==6||s2==6||s3==6||s4==6||s5==6||s6==6||s7==6||s8==6||s1==10||s2==10||s3==10||s4==10||s5==10||s6==10||s7==10||s8==10)
                {

                    Check(s1,s2,s3,s4,s5,s6,s7,s8);


                }
                else if(a[0]==0)
                    button1.performClick();
                else {
                    i = randInt(8);
                    while (a[i] == 1)
                        i = randInt(8);
                    if (i == 0)
                        button1.performClick();
                    else if (i == 1)
                        button2.performClick();
                    else if (i == 2)
                        button3.performClick();
                    else if (i == 3)
                        button4.performClick();
                    else if (i == 5)
                        button6.performClick();
                    else if (i == 6)
                        button7.performClick();
                    else if (i == 7)
                        button8.performClick();
                    else if (i == 8)
                        button9.performClick();
                }
            }
        }



        if (view == button6) {

            if (button6.getTag() == null) {
                if (turn % 2 == 0) {
                    button6.setImageResource(R.drawable.xbutton);
                    button6.setTag("X");
                    a[5]=3;
                } else {
                    button6.setImageResource(R.drawable.obutton);
                    button6.setTag("O");
                    a[5]=5;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGameHard.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGameHard.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGameHard.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                for(i1=0;i1<3;i1++) {
                    s1 += a[i1];
                    s2 += a[i1+3];
                    s3 += a[i1+6];
                }
                for(i2=0;i2<9;i2+=3) {
                    s4 += a[i2];
                    s5 += a[i2+1];
                    s6 += a[i2+2];
                }
                s7+=(a[0]+a[4]+a[8]);
                s8+=(a[2]+a[4]+a[6]);
                if(s1==6||s2==6||s3==6||s4==6||s5==6||s6==6||s7==6||s8==6||s1==10||s2==10||s3==10||s4==10||s5==10||s6==10||s7==10||s8==10)
                {

                    Check(s1,s2,s3,s4,s5,s6,s7,s8);


                }
                else if(a[4]==0)
                    button5.performClick();
                else {
                    i = randInt(8);
                    while (a[i] == 1)
                        i = randInt(8);
                    if (i == 0)
                        button1.performClick();
                    else if (i == 1)
                        button2.performClick();
                    else if (i == 2)
                        button3.performClick();
                    else if (i == 3)
                        button4.performClick();
                    else if (i == 4)
                        button5.performClick();
                    else if (i == 6)
                        button7.performClick();
                    else if (i == 7)
                        button8.performClick();
                    else if (i == 8)
                        button9.performClick();

                }

            }
        }

        if (view == button7) {

            if (button7.getTag() == null) {
                if (turn % 2 == 0) {
                    button7.setImageResource(R.drawable.xbutton);
                    button7.setTag("X");
                    a[6]=3;
                } else {
                    button7.setImageResource(R.drawable.obutton);
                    button7.setTag("O");
                    a[6]=5;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGameHard.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGameHard.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGameHard.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                for(i1=0;i1<3;i1++) {
                    s1 += a[i1];
                    s2 += a[i1+3];
                    s3 += a[i1+6];
                }
                for(i2=0;i2<9;i2+=3) {
                    s4 += a[i2];
                    s5 += a[i2+1];
                    s6 += a[i2+2];
                }
                s7+=(a[0]+a[4]+a[8]);
                s8+=(a[2]+a[4]+a[6]);
                if(s1==6||s2==6||s3==6||s4==6||s5==6||s6==6||s7==6||s8==6||s1==10||s2==10||s3==10||s4==10||s5==10||s6==10||s7==10||s8==10)
                {

                    Check(s1,s2,s3,s4,s5,s6,s7,s8);


                }
                else if(a[4]==0)
                    button5.performClick();
                else {
                    i = randInt(8);
                    while (a[i] == 1)
                        i = randInt(8);
                    if (i == 0)
                        button1.performClick();
                    else if (i == 1)
                        button2.performClick();
                    else if (i == 2)
                        button3.performClick();
                    else if (i == 3)
                        button4.performClick();
                    else if (i == 4)
                        button5.performClick();
                    else if (i == 5)
                        button6.performClick();
                    else if (i == 7)
                        button8.performClick();
                    else if (i == 8)
                        button9.performClick();
                }
            }
        }

        if (view == button8) {

            if (button8.getTag() == null) {
                if (turn % 2 == 0) {
                    button8.setImageResource(R.drawable.xbutton);
                    button8.setTag("X");
                    a[7]=3;
                } else {
                    button8.setImageResource(R.drawable.obutton);
                    button8.setTag("O");
                    a[7]=5;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGameHard.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGameHard.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGameHard.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                for(i1=0;i1<3;i1++) {
                    s1 += a[i1];
                    s2 += a[i1+3];
                    s3 += a[i1+6];
                }
                for(i2=0;i2<9;i2+=3) {
                    s4 += a[i2];
                    s5 += a[i2+1];
                    s6 += a[i2+2];
                }
                s7+=(a[0]+a[4]+a[8]);
                s8+=(a[2]+a[4]+a[6]);
                if(s1==6||s2==6||s3==6||s4==6||s5==6||s6==6||s7==6||s8==6||s1==10||s2==10||s3==10||s4==10||s5==10||s6==10||s7==10||s8==10)
                {

                    Check(s1,s2,s3,s4,s5,s6,s7,s8);


                }
                else if(a[4]==0)
                    button5.performClick();
                else {
                    i = randInt(8);
                    while (a[i] == 1)
                        i = randInt(8);
                    if (i == 0)
                        button1.performClick();
                    else if (i == 1)
                        button2.performClick();
                    else if (i == 2)
                        button3.performClick();
                    else if (i == 3)
                        button4.performClick();
                    else if (i == 4)
                        button5.performClick();
                    else if (i == 5)
                        button6.performClick();
                    else if (i == 6)
                        button7.performClick();
                    else if (i == 8)
                        button9.performClick();
                }
            }
        }

        if (view == button9) {

            if (button9.getTag() == null) {
                if (turn % 2 == 0) {
                    button9.setImageResource(R.drawable.xbutton);
                    button9.setTag("X");
                    a[8]=3;
                } else {
                    button9.setImageResource(R.drawable.obutton);
                    button9.setTag("O");
                    a[8]=5;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGameHard.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGameHard.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGameHard.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                for(i1=0;i1<3;i1++) {
                    s1 += a[i1];
                    s2 += a[i1+3];
                    s3 += a[i1+6];
                }
                for(i2=0;i2<9;i2+=3) {
                    s4 += a[i2];
                    s5 += a[i2+1];
                    s6 += a[i2+2];
                }
                s7+=(a[0]+a[4]+a[8]);
                s8+=(a[2]+a[4]+a[6]);
                if(s1==6||s2==6||s3==6||s4==6||s5==6||s6==6||s7==6||s8==6||s1==10||s2==10||s3==10||s4==10||s5==10||s6==10||s7==10||s8==10)
                {

                    Check(s1,s2,s3,s4,s5,s6,s7,s8);


                }
                else if(a[4]==0)
                    button5.performClick();
                else {
                    i = randInt(8);
                    while (a[i] == 1)
                        i = randInt(8);
                    if (i == 0)
                        button1.performClick();
                    else if (i == 1)
                        button2.performClick();
                    else if (i == 2)
                        button3.performClick();
                    else if (i == 3)
                        button4.performClick();
                    else if (i == 4)
                        button5.performClick();
                    else if (i == 5)
                        button6.performClick();
                    else if (i == 6)
                        button7.performClick();
                    else if (i == 7)
                        button8.performClick();

                }

            }
        }
    }

    public int checkResult(){

        if(button1.getTag()==button2.getTag()&&button1.getTag()==button3.getTag()&&button1.getTag()!=null) {
            if(turn%2==0)
                return 1;
            else
                return 2;
        }

        else if(button1.getTag()==button4.getTag()&&button1.getTag()==button7.getTag()&&button1.getTag()!=null) {
            if(turn%2==0)
                return 1;
            else
                return 2;
        }

        else if(button2.getTag()==button5.getTag()&&button2.getTag()==button8.getTag()&&button2.getTag()!=null) {
            if(turn%2==0)
                return 1;
            else
                return 2;
        }

        else if(button3.getTag()==button6.getTag()&&button3.getTag()==button9.getTag()&&button3.getTag()!=null) {
            if(turn%2==0)
                return 1;
            else
                return 2;
        }

        else if(button4.getTag()==button5.getTag()&&button4.getTag()==button6.getTag()&&button4.getTag()!=null) {
            if(turn%2==0)
                return 1;
            else
                return 2;

        }

        else if(button7.getTag()==button8.getTag()&&button7.getTag()==button9.getTag()&&button7.getTag()!=null) {
            if(turn%2==0)
                return 1;
            else
                return 2;
        }

        else if(button1.getTag()==button5.getTag()&&button1.getTag()==button9.getTag()&&button1.getTag()!=null) {
            if(turn%2==0)
                return 1;
            else
                return 2;
        }

        else if(button3.getTag()==button5.getTag()&&button3.getTag()==button7.getTag()&&button3.getTag()!=null) {
            if(turn%2==0)
                return 1;
            else
                return 2;
        }

        else if(button1.getTag()!=null&&button2.getTag()!=null&&button3.getTag()!=null&&button4.getTag()!=null&&button5.getTag()!=null&&button6.getTag()!=null&&button7.getTag()!=null&&button8.getTag()!=null&&button9.getTag()!=null) {
            return 3;
        }

        else
            return 0;

    }

    public void Check(int s1,int s2,int s3,int s4,int s5,int s6,int s7,int s8){
        if(s1==10)
        {

            if(a[0]==0)
                button1.performClick();
            else if (a[1]==0)
                button2.performClick();
            else if (a[2]==0)
                button3.performClick();}
        else if(s2==10)
        {

            if(a[3]==0)
                button4.performClick();
            else if (a[4]==0)
                button5.performClick();
            else if (a[5]==0)
                button6.performClick();}
        else if(s3==10)
        {

            if(a[6]==0)
                button7.performClick();
            else if (a[7]==0)
                button8.performClick();
            else if (a[8]==0)
                button9.performClick();}
        else if(s4==10)
        {

            if(a[0]==0)
                button1.performClick();
            else if (a[3]==0)
                button4.performClick();
            else if (a[6]==0)
                button7.performClick();}
        else if(s5==10)
        {

            if(a[1]==0)
                button2.performClick();
            else if (a[4]==0)
                button5.performClick();
            else if (a[7]==0)
                button8.performClick();}
        else if(s6==10)
        {

            if(a[2]==0)
                button3.performClick();
            else if (a[5]==0)
                button6.performClick();
            else if (a[8]==0)
                button9.performClick();}
        else if(s7==10)
        {

            if(a[0]==0)
                button1.performClick();
            else if (a[4]==0)
                button5.performClick();
            else if (a[8]==0)
                button9.performClick();}
        else if(s8==10)
        {

            if(a[2]==0)
                button3.performClick();
            else if (a[4]==0)
                button5.performClick();
            else if (a[6]==0)
                button7.performClick();}

        else if(s1==6)
        {

            if(a[0]==0)
                button1.performClick();
            else if (a[1]==0)
                button2.performClick();
            else if (a[2]==0)
                button3.performClick();}
        else if(s2==6)
        {

            if(a[3]==0)
                button4.performClick();
            else if (a[4]==0)
                button5.performClick();
            else if (a[5]==0)
                button6.performClick();}
        else if(s3==6)
        {

            if(a[6]==0)
                button7.performClick();
            else if (a[7]==0)
                button8.performClick();
            else if (a[8]==0)
                button9.performClick();}
        else if(s4==6)
        {

            if(a[0]==0)
                button1.performClick();
            else if (a[3]==0)
                button4.performClick();
            else if (a[6]==0)
                button7.performClick();}
        else if(s5==6)
        {

            if(a[1]==0)
                button2.performClick();
            else if (a[4]==0)
                button5.performClick();
            else if (a[7]==0)
                button8.performClick();}
        else if(s6==6)
        {

            if(a[2]==0)
                button3.performClick();
            else if (a[5]==0)
                button6.performClick();
            else if (a[8]==0)
                button9.performClick();}
        else if(s7==6)
        {

            if(a[0]==0)
                button1.performClick();
            else if (a[4]==0)
                button5.performClick();
            else if (a[8]==0)
                button9.performClick();}
        else if(s8==6)
        {

            if(a[2]==0)
                button3.performClick();
            else if (a[4]==0)
                button5.performClick();
            else if (a[6]==0)
                button7.performClick();}
    }


    public void GotoMain(){
        Intent i=new Intent(this,SingleGameMenu.class);
        startActivity(i);
        finish();
    }

    public static int randInt(int max) {

        Random rand = new Random();

        int randomNum = rand.nextInt(max  + 1) ;

        return randomNum;

    }
}
