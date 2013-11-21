package com.example.eventure;

//test comment

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class HomeScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
		
		// Load the ImageView that will host the animation and
		// set its background to our AnimationDrawable XML resource.
		ImageView img = (ImageView)findViewById(R.id.gif_img);
		img.setBackgroundResource(R.drawable.img_list);

		// Get the background, which has been compiled to an AnimationDrawable object.
		AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		// Start the animation (looped playback by default).
		frameAnimation.start();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}
	
	public void toStoryView(View V){
		startActivity(new Intent(HomeScreen.this, StoryView.class));
	}

	
	//public void toLibrary() is a method that gives the button "Library" the command to switch to the Library activity.
	public void toLibrary(View V){
		startActivity(new Intent(HomeScreen.this, Library.class));
	}

}
