package com.example.varunelango.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import java.util.Timer;
import java.util.TimerTask;


public class TiltBall extends Activity {
    BallView mBallView = null;
    Handler RedrawHandler = new Handler();
    Timer mTmr = null;
    TimerTask mTsk = null;
    int mScrWidth, mScrHeight;
    android.graphics.PointF mBallPos, mBallSpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(0xFFFFFFFF, WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tilt_ball);

        final FrameLayout mainView =
                (FrameLayout) findViewById(R.id.main_view);


        Display display = getWindowManager().getDefaultDisplay();
        mScrWidth = display.getWidth();
        mScrHeight = display.getHeight();
        mBallPos = new android.graphics.PointF();
        mBallSpd = new android.graphics.PointF();

        mBallPos.x = mScrWidth / 2;
        mBallPos.y = mScrHeight / 2;
        mBallSpd.x = 0;
        mBallSpd.y = 0;

        mBallView = new BallView(this, mBallPos.x, mBallPos.y, 75);

        mainView.addView(mBallView);
        mBallView.invalidate();

        ((SensorManager) getSystemService(Context.SENSOR_SERVICE)).registerListener(
                new SensorEventListener() {
                    @Override
                    public void onSensorChanged(SensorEvent event) {
                        mBallSpd.x = -event.values[0];
                        mBallSpd.y = event.values[1];
                    }

                    @Override
                    public void onAccuracyChanged(Sensor sensor, int accuracy) {
                    }
                },
                ((SensorManager) getSystemService(Context.SENSOR_SERVICE))
                        .getSensorList(Sensor.TYPE_ACCELEROMETER).get(0),
                SensorManager.SENSOR_DELAY_NORMAL);



    }
    @Override
    public void onPause()
    {
        mTmr.cancel();
        mTmr = null;
        mTsk = null;
        super.onPause();
    }

    @Override
    public void onResume()
    {
        mTmr = new Timer();
        mTsk = new TimerTask() {
            public void run() {


                mBallPos.y += mBallSpd.y;
                mBallPos.x += mBallSpd.x;

                if (mBallPos.y > mScrHeight) mBallPos.y=0;
                if (mBallPos.x > mScrWidth) mBallPos.x=0;

                if (mBallPos.y < 0) mBallPos.y=mScrHeight;
                if (mBallPos.x < 0) mBallPos.x=mScrWidth;

                mBallView.y = mBallPos.y;
                mBallView.x = mBallPos.x;

                RedrawHandler.post(new Runnable() {
                    public void run() {
                        mBallView.invalidate();
                    }});

            }


        };
        mTmr.schedule(mTsk,10,10);
        super.onResume();
    }


    @Override
    public void onDestroy()
    {
        super.onDestroy();
        System.runFinalizersOnExit(true);
        android.os.Process.killProcess(android.os.Process.myPid());
    }


}
