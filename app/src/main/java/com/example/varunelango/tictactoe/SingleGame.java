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


public class SingleGame extends Activity {


    ImageButton button1, button2, button3, button4, button5, button6, button7, button8, button9;

    int turn = -1,i;
    int[] a = new int[10];
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(0xFFFFFFFF, WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_game);

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

    if (view == button1) {

            if (button1.getTag() == null) {
                if (turn % 2 == 0) {
                    button1.setImageResource(R.drawable.xbutton);
                    button1.setTag("X");
                    a[0]=1;
                } else {
                    button1.setImageResource(R.drawable.obutton);
                    button1.setTag("O");
                    a[0]=1;
                }
            }

            else
                turn--;

        if (checkResult() == 3) {
            Toast.makeText(SingleGame.this, "Draw", Toast.LENGTH_LONG).show();
            GotoMain();
        } else if (checkResult() == 2) {
            Toast.makeText(SingleGame.this, "O Won", Toast.LENGTH_LONG).show();
            GotoMain();
        }else if (checkResult() == 1) {
            Toast.makeText(SingleGame.this, "X Won", Toast.LENGTH_LONG).show();
            GotoMain();
        } else if (checkResult() == 0&&turn%2==0) {
            i=randInt(8);
            while(a[i]==1)
                i=randInt(8);
            if (i==1)
                button2.performClick();
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

    if (view == button2) {

            if (button2.getTag() == null) {
                if (turn % 2 == 0) {
                    button2.setImageResource(R.drawable.xbutton);
                    button2.setTag("X");
                    a[1]=1;
                } else {
                    button2.setImageResource(R.drawable.obutton);
                    button2.setTag("O");
                    a[1]=1;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGame.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGame.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGame.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                i=randInt(8);
                while(a[i]==1)
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

    if (view == button3) {

            if (button3.getTag() == null) {
                if (turn % 2 == 0) {
                    button3.setImageResource(R.drawable.xbutton);
                    button3.setTag("X");
                    a[2]=1;
                } else {
                    button3.setImageResource(R.drawable.obutton);
                    button3.setTag("O");
                    a[2]=1;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGame.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGame.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGame.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                i=randInt(8);
                while(a[i]==1)
                    i=randInt(8);
                if (i==0)
                    button1.performClick();
                if (i==1)
                    button2.performClick();
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

    if (view == button4) {

            if (button4.getTag() == null) {
                if (turn % 2 == 0) {
                    button4.setImageResource(R.drawable.xbutton);
                    button4.setTag("X");
                    a[3]=1;
                } else {
                    button4.setImageResource(R.drawable.obutton);
                    button4.setTag("O");
                    a[3]=1;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGame.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGame.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGame.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                i=randInt(8);
                while(a[i]==1)
                    i=randInt(8);
                if (i==0)
                    button1.performClick();
                else if (i==1)
                    button2.performClick();
                else if (i==2)
                    button3.performClick();
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

    if (view == button5) {

            if (button5.getTag() == null) {
                if (turn % 2 == 0) {
                    button5.setImageResource(R.drawable.xbutton);
                    button5.setTag("X");
                    a[4]=1;
                } else {
                    button5.setImageResource(R.drawable.obutton);
                    button5.setTag("O");
                    a[4]=1;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGame.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGame.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGame.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                i=randInt(8);
                while(a[i]==1)
                    i=randInt(8);
                if (i==0)
                    button1.performClick();
                else if (i==1)
                    button2.performClick();
                else if (i==2)
                    button3.performClick();
                else if (i==3)
                    button4.performClick();
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



    if (view == button6) {

            if (button6.getTag() == null) {
                if (turn % 2 == 0) {
                    button6.setImageResource(R.drawable.xbutton);
                    button6.setTag("X");
                    a[5]=1;
                } else {
                    button6.setImageResource(R.drawable.obutton);
                    button6.setTag("O");
                    a[5]=1;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGame.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGame.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGame.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                i=randInt(8);
                while(a[i]==1)
                    i=randInt(8);
                if (i==0)
                    button1.performClick();
                else if (i==1)
                    button2.performClick();
                else if (i==2)
                    button3.performClick();
                else if (i==3)
                    button4.performClick();
                else if (i==4)
                    button5.performClick();
                else if (i==6)
                    button7.performClick();
                else if (i==7)
                    button8.performClick();
                else if (i==8)
                    button9.performClick();



            }
        }

    if (view == button7) {

            if (button7.getTag() == null) {
                if (turn % 2 == 0) {
                    button7.setImageResource(R.drawable.xbutton);
                    button7.setTag("X");
                    a[6]=1;
                } else {
                    button7.setImageResource(R.drawable.obutton);
                    button7.setTag("O");
                    a[6]=1;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGame.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGame.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGame.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                i=randInt(8);
                while(a[i]==1)
                    i=randInt(8);
                if (i==0)
                    button1.performClick();
                else if (i==1)
                    button2.performClick();
                else if (i==2)
                    button3.performClick();
                else if (i==3)
                    button4.performClick();
                else if (i==4)
                    button5.performClick();
                else if (i==5)
                    button6.performClick();
                else if (i==7)
                    button8.performClick();
                else if (i==8)
                    button9.performClick();

            }
        }

    if (view == button8) {

            if (button8.getTag() == null) {
                if (turn % 2 == 0) {
                    button8.setImageResource(R.drawable.xbutton);
                    button8.setTag("X");
                    a[7]=1;
                } else {
                    button8.setImageResource(R.drawable.obutton);
                    button8.setTag("O");
                    a[7]=1;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGame.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGame.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGame.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                i=randInt(8);
                while(a[i]==1)
                    i=randInt(8);
                if (i==0)
                    button1.performClick();
                else if (i==1)
                    button2.performClick();
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
                else if (i==8)
                    button9.performClick();

            }
        }

    if (view == button9) {

            if (button9.getTag() == null) {
                if (turn % 2 == 0) {
                    button9.setImageResource(R.drawable.xbutton);
                    button9.setTag("X");
                    a[8]=1;
                } else {
                    button9.setImageResource(R.drawable.obutton);
                    button9.setTag("O");
                    a[8]=1;
                }
            }

            else
                turn--;

            if (checkResult() == 3) {
                Toast.makeText(SingleGame.this, "Draw", Toast.LENGTH_LONG).show();
                GotoMain();
            }else if (checkResult() == 2) {
                Toast.makeText(SingleGame.this, "O Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 1) {
                Toast.makeText(SingleGame.this, "X Won", Toast.LENGTH_LONG).show();
                GotoMain();
            } else if (checkResult() == 0&&turn%2==0) {
                i=randInt(8);
                while(a[i]==1)
                    i=randInt(8);
                if (i==0)
                    button1.performClick();
                else if (i==1)
                    button2.performClick();
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
