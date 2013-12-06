package com.example.eventure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class HomeScreen extends Activity {

	MediaPlayer mp;
	AnimationDrawable frameAnimation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_home_screen);
	
		//Loading Sound
         mp = MediaPlayer.create(this, R.raw.sound);
         mp.start();
         if (!mp.isLooping());
         	mp.setLooping(true);
         Button musicTitle = (Button)this.findViewById(R.id.button2);
         musicTitle.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (!mp.isPlaying()){
					mp.start();
				}
				else{
					mp.pause();
				}
			}
		});
		
		// Load the ImageView that will host the animation and
		// set its background to our AnimationDrawable XML resource.
		ImageView img = (ImageView)findViewById(R.id.gif_img);
		img.setBackgroundResource(R.drawable.img_list);

		// Get the background, which has been compiled to an AnimationDrawable object.
		frameAnimation = (AnimationDrawable) img.getBackground();

		// Start the animation (looped playback by default).
		frameAnimation.start();
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}
	
	//public void toLibrary() is a method that gives the button "Library" the command to switch to the Library activity.
	public void toLibrary(View V){
		mp.release();
		startActivity(new Intent(HomeScreen.this, Library.class));
	}
	
	//public void toStoryView() is a method that gives the button "yougHero" the command to switch to the OpenGL activity.
	public void toStoryView(View V){
		startActivity(new Intent(HomeScreen.this, The_Silly_Cat.class));
	}
	
}
