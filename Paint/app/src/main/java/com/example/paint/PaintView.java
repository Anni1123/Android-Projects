package com.example.paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PaintView extends View {

    public static int BRUSH_SIZE=10;
    public static final int DEFAULY_COLOr= Color.RED;
    public static final int DEFAULT_BG_COLOR=Color.WHITE;
    public static final float TOUCH_TOLERANCE=4;
    private float mX,mY;
    private Path mpath;
    private Paint mpaint;
    private ArrayList<FingerPath> arrayList=new ArrayList<>();
    private int currentColor;
    private int backgroundColor=DEFAULT_BG_COLOR;
    private int strokeWidth;
    private boolean emboss,blur;
    private MaskFilter memboss;
    private MaskFilter mblur;
    private Bitmap mbitmap;
    private Canvas mcanvas;
    private Paint mBitmapPaint=new Paint(Paint.DITHER_FLAG);


    public PaintView(Context context) {
        this(context,null);
    }

    public PaintView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mpaint=new Paint();
        mpaint.setAntiAlias(true);
        mpaint.setDither(true);
        mpaint.setColor(DEFAULY_COLOr);
        mpaint.setStyle(Paint.Style.STROKE);
        mpaint.setStrokeJoin(Paint.Join.ROUND);
        mpaint.setStrokeCap(Paint.Cap.ROUND);
        mpaint.setXfermode(null);
        mpaint.setAlpha(0xff);

        memboss=new EmbossMaskFilter(new float[] {1,1,1},0.4f,6,3.5f);
        mblur=new BlurMaskFilter(5,BlurMaskFilter.Blur.NORMAL);

    }
    public void init(DisplayMetrics metrics){
        int height=metrics.heightPixels;
        int width=metrics.widthPixels;
        mbitmap=Bitmap.createBitmap(width,height,Bitmap.Config.ARGB_8888);
        mcanvas=new Canvas(mbitmap);

        currentColor=DEFAULY_COLOr;
        strokeWidth=BRUSH_SIZE;

    }

    public void normal(){
        emboss=false;
        blur=false;
    }
    public void emboss(){
        emboss=true;
        blur=false;
    }
    public void blur(){
        emboss=false;
        blur=true;
    }
    public void clear(){
        backgroundColor=DEFAULT_BG_COLOR;
        arrayList.clear();
        normal();
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();
        mcanvas.drawColor(backgroundColor);
        for(FingerPath fp:arrayList){
            mpaint.setColor(fp.color);
            mpaint.setStrokeWidth(fp.strokeWidth);
            mpaint.setMaskFilter(null);
            if(fp.emboss) {
                mpaint.setMaskFilter(memboss);
            }
            else if(fp.blur){
                mpaint.setMaskFilter(mblur);
            }
            mcanvas.drawPath(fp.path,mpaint);
        }
        canvas.drawBitmap(mbitmap,0,0,mBitmapPaint);
        canvas.restore();

    }
    private void touchStart(float x,float y){
        mpath=new Path();
        FingerPath fp=new FingerPath(currentColor,emboss,blur,strokeWidth,mpath);
        arrayList.add(fp);
        mpath.reset();
        mpath.moveTo(x,y);
        mX=x;
        mY=y;

    }
    private void touchMove(float x,float y){
        float dx=Math.abs(x-mY);
        float dy=Math.abs(y-mY);
        if(dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE){
            mpath.quadTo(mX,mY,(x+mX)/2,(y+mY)/2);
            mX=x;
            mY=y;
        }
    }
    private void touchUp(){
        mpath.lineTo(mX,mY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x=event.getX();
        float y=event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                touchStart(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                touchMove(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                touchUp();
                invalidate();
                break;
        }
        return true;
    }
}
