package com.example.eventure;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MySurfaceView extends GLSurfaceView{

	public MySurfaceView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		setEGLContextClientVersion(2);
		
		setRenderer(new MyRenderer());
		
		setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
	}

}
