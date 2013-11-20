/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.eventure;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView.Renderer;

public class MyRenderer implements MySurfaceView.Renderer {
	private int x=0, y=0,a=0,b=350;
	
	private Context context;
	private int zoomX = 320;  
	private int zoomY = 480;  
	
	private LoadSprite background = new LoadSprite();
	private LoadSprite ninjaSprite = new LoadSprite();
	
	
	
	
	public MyRenderer(Context context){
		this.context = context;
	}

	@Override
	public void onDrawFrame(GL10 gl) {
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		
		GL_Prepare(gl);
		//Draw
		background.Draw(gl, a, b, 320,  350 );
		ninjaSprite.Draw(gl, x, y, 9, 18);
		
		
	
		//End Draw
		GL_Finished(gl);
		
	    if(b>0) b--;
		
	
		x++;
		if (x>=300){
			y=y+13;
			x=0;
			if (y>=400){
				y=400;
			}
		}
		
		
	}
	

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		gl.glMatrixMode(GL10.GL_PROJECTION);
		gl.glLoadIdentity();
		
		gl.glOrthof(0, zoomX, zoomY, 0, 0, 1);
		gl.glViewport(0, 0, width, height);
		
		gl.glMatrixMode(GL10.GL_MODELVIEW);
	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig arg1) {
		//load
		background.LoadAsset(gl, context, "TestText2.png");
		//ninjaSprite.LoadAsset(gl, context, "ninja.png");
		
		gl.glEnable(GL10.GL_TEXTURE_2D);
		gl.glShadeModel(GL10.GL_SMOOTH);
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
		gl.glClearDepthf(1.0f);
		gl.glEnable(GL10.GL_DEPTH_TEST);
		gl.glDepthFunc(GL10.GL_LEQUAL);
		
	}

	private void GL_Prepare(GL10 gl){
		gl.glEnable(GL10.GL_TEXTURE_2D);
		gl.glShadeModel(GL10.GL_SMOOTH);
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
		gl.glClearDepthf(1.0f);
		gl.glEnable(GL10.GL_DEPTH_TEST);
		gl.glDepthFunc(GL10.GL_LEQUAL);
	}
	
	private void GL_Finished(GL10 gl){
		gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
		gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY);
		gl.glFrontFace(GL10.GL_CW);
		gl.glEnable(GL10.GL_DEPTH_TEST);
	}
	
}
