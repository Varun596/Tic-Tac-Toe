package com.example.varunelango.tictactoe;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class BallView extends View{
    public float x;
    public float y;
    private final int r;
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public BallView(Context context, float x, float y, int r) {
        super(context);

        mPaint.setColor(0xFF000000);
        this.x = x;
        this.y = y;
        this.r = r;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(x, y, r, mPaint);
    }
}
