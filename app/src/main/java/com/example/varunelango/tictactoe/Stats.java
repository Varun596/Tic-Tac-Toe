package com.example.varunelango.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class Stats extends Activity {

    TextView tvt,xvt,ovt,dvt;
    int counter,xcounter,ocounter,dcounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(0xFFFFFFFF, WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        tvt = (TextView)findViewById(R.id.TotalValueText);
        xvt = (TextView)findViewById(R.id.XValueText);
        ovt = (TextView)findViewById(R.id.OValueText);
        dvt = (TextView)findViewById(R.id.DValueText);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String total = preferences.getString("TotalValue", "0");
        String x = preferences.getString("XValue", "0");
        String o = preferences.getString("OValue", "0");

        counter= Integer.parseInt(total);
        tvt.setText(""+counter);

        xcounter= Integer.parseInt(x);
        xvt.setText("" + xcounter);

        ocounter= Integer.parseInt(o);
        ovt.setText(""+ocounter);

        dcounter=counter-xcounter-ocounter;
        dvt.setText(""+dcounter);

    }

    public void onClickBack(View view){

        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }



}
