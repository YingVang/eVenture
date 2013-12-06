package com.example.eventure;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class The_Silly_Cat extends Activity {
	
	@Override
	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(new StoryView(this));
	}
	
	//This method will stop all thread from running
	@Override
	public void onPause (){
		System.exit(0);
	}

}