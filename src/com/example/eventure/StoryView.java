package com.example.eventure;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.app.Activity;
import android.view.WindowManager;

public class StoryView extends Activity {

	private GLSurfaceView glView;
	private MyRenderer renderer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//put the tile OFF
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		//enable full screen
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.story_view);
		glView = (GLSurfaceView)findViewById(R.id.glSurface);
		renderer = new MyRenderer(this);
		glView.setRenderer(renderer);
		glView.requestFocus();
		glView.setFocusableInTouchMode(true);
	}

}
