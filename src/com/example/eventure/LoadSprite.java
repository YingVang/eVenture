package com.example.eventure;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLUtils;

public class LoadSprite {
	private float[] uv1 = new float[2];
	private float[] uv0 = new float[2];
	private FloatBuffer vertexBuffer;
	private int bitmapWidth;
	private int bitmapHeight;
	private float vertices[] = 
		{
			0.0f, 1.0f, 0.0f, //bottom left
			0.0f, 0.0f, 0.0f, //top left
			1.0f, 0.0f, 0.0f, //top right
			1.0f, 1.0f, 0.0f, //bottom right
		};
	
	private FloatBuffer uvCoordBuffer;
	private float[] uvCoord = 
		{
			uv1[0], uv0[1],
			uv1[0], uv0[0],
			uv1[1], uv0[0],
			uv1[1], uv0[1],
		};
	
	private int[] textures = new int[2];
	
	public LoadSprite()
	{
		uvCoord[0] = 0.0f; uvCoord[1] = 1.0f;
		uvCoord[2] = 0.0f; uvCoord[3] = 0.0f;
		uvCoord[4] = 1.0f; uvCoord[5] = 0.0f;
		uvCoord[6] = 1.0f; uvCoord[7] = 1.0f;
		
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(vertices.length * 4);
		byteBuffer.order(ByteOrder.nativeOrder());
		
		vertexBuffer = byteBuffer.asFloatBuffer();
		vertexBuffer.put(vertices);
		vertexBuffer.position(0);
		
		byteBuffer = ByteBuffer.allocateDirect(uvCoord.length * 4);
		byteBuffer.order(ByteOrder.nativeOrder());
		uvCoordBuffer = byteBuffer.asFloatBuffer();
		uvCoordBuffer.put(uvCoord);
		uvCoordBuffer.position(0);
	}
	
	public void LoadFromAsset(GL10 gl, Context c, String path) throws IOException
	{
		AssetManager assetManager = c.getAssets();
		InputStream istr = assetManager.open(path);
		
		Bitmap bitmap = BitmapFactory.decodeStream(istr);
		
		bitmapWidth = bitmap.getWidth();
		bitmapHeight = bitmap.getHeight();
		
		gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST);
		gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_LINEAR);
		
		GLUtils.texImage2D(GL10.GL_TEXTURE_2D, 0, bitmap, 0);
		
		bitmap.recycle();
	}
	
	public void LoadAsset(GL10 gl, Context c, String path)
	{
		try {
			LoadFromAsset(gl, c, path);
		}
		catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void draw(GL10 gl)
	{
		gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[0]);
		gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[1]);
		gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertexBuffer);
		gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, uvCoordBuffer.position(0));
		
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN, 0, vertices.length / 3);
	}
	
	public void Draw(GL10 gl, int posX, int posY, int Width, int Height)
	{
		gl.glLoadIdentity();
		
		gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		
		gl.glTranslatef(posX,  posY,  0);
		gl.glScalef(Width, Height, 0.0f);
		
		draw(gl);
	}
}
