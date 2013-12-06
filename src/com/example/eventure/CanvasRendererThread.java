package com.example.eventure;
import android.graphics.Canvas;

public class CanvasRendererThread extends Thread {
	static final long FPS = 10;
	private StoryView view;
	private boolean running = false;
	
	public CanvasRendererThread(StoryView view) {
		this.view = view;
	}
	
	public void setRunning(boolean run) {
		running = run;
	}
	
	@Override
	public void run(){
		long ticksPS = 100 / FPS;  //changing frames per second 
		long startTime;
		long sleepTime;
		while (running){
			Canvas c = null;
			try {
				c = view.getHolder().lockCanvas();
				startTime = System.currentTimeMillis();
				synchronized (view.getHolder()) {
					view.onDraw(c);
				}
			} finally {
					if (c != null) {
						view.getHolder().unlockCanvasAndPost(c);
					}
			}
			sleepTime = ticksPS - (System.currentTimeMillis() - startTime);
			try {
				if (sleepTime > 0)
					sleep(sleepTime);
				else
					sleep(10);
			}catch (Exception e) {}
		}
	}
}
