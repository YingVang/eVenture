package com.example.eventure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.MotionEvent;
import android.view.SurfaceView;

//to draw with canvas using SurfaceView, one has to
//implement a Callback() to a holder.
public class StoryView extends SurfaceView {
	private Bitmap bmpSillyCat, bmpBlack, bmptext, bmpSantaCat;
	private Bitmap bmpQuestion1;
	private SurfaceHolder holder;
	private CanvasRendererThread renderThread;
	private int xCat=0, yCat, xBlack, yBlack, xText, yText=0;
	private int xSantaCat, ySantaCat, xQuestion1, yQuestion1, l;
	private int textSpeed = 1;

	public StoryView (Context context) {
		super(context);
		renderThread = new CanvasRendererThread(this);
		holder = getHolder();
		holder.addCallback(new Callback(){

			@Override
			public void surfaceDestroyed(SurfaceHolder holder){

			}
			
			@Override
			public void surfaceCreated(SurfaceHolder holder){
				renderThread.setRunning(true);
				renderThread.start();
			}

			@Override
			public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}
			
		} );
		
		bmpSillyCat=BitmapFactory.decodeResource(getResources(), R.drawable.silllycat);
		bmpBlack=BitmapFactory.decodeResource(getResources(), R.drawable.black);
		bmptext=BitmapFactory.decodeResource(getResources(), R.drawable.text);
		bmpSantaCat=BitmapFactory.decodeResource(getResources(), R.drawable.santacat);
		bmpQuestion1=BitmapFactory.decodeResource(getResources(), R.drawable.question1);
		xCat=40; yCat=0; xBlack=30; yBlack=1200; xText=40; yText=1200;
		xSantaCat=30; ySantaCat=1250; xQuestion1=10; yQuestion1=1460;
	}
	
	//This is where we do all the drawing of the sprites
	protected void onDraw(Canvas canvas){
		canvas.drawColor(Color.BLACK);  //background color
		
		canvas.drawBitmap(bmptext, xText, yText, null);
		canvas.drawBitmap(bmpSillyCat, xCat, yCat, null);
		canvas.drawBitmap(bmpBlack, xBlack, yBlack, null);
		canvas.drawBitmap(bmpSantaCat, xSantaCat, ySantaCat, null);
		l=bmptext.getHeight();
		if (yText == 500){
			canvas.drawBitmap(bmpQuestion1, xQuestion1, yQuestion1, null);
			yText=500;
		}
		
		
	}
	
	//touch to move text up
	@Override
    public boolean onTouchEvent(MotionEvent e) {

        switch (e.getAction()) {
            case MotionEvent.ACTION_MOVE:
            		textSpeed = -3;
            	yText = yText + textSpeed;      
        }
        return true;
    }


}
