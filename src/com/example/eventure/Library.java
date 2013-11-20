package com.example.eventure;

import android.annotation.TargetApi;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Library extends ListActivity{

	
	// Stories array
	String [] Stories = {
			"StoryView",
			"Story 2",
			"Story 3",
			"Story 4",
			"Story 5",
			"Story 6",
			"Story 7",
			"Story 8",
			"Story 9",
			"Story 10",
			"Story 11",
			"Story 12",
			"Story 13",
			"Story 14",
			"Story 15",
			"Story 16",
			"Story 17",
			"Story 18",
			"Story 19",
			"Story 20"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_library);
		// Show the Up button in the action bar.
		setupActionBar();
		
		// setting data from Stories array into list
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Stories));
	}
	
	public void onListItemClick(ListView list, View v, int position, long id){
		
		super.onListItemClick(list, v, position, id);
		String storyName = Stories[position];		
		try{
			Class selected = Class.forName("com.example.eventure." + storyName);
			Intent selectedIntent = new Intent(this, selected);
			startActivity(selectedIntent);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.eventure_actionbar, menu);
		return (super.onCreateOptionsMenu(menu));
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			break;
			
		case R.id.action_library:
			Toast.makeText(this, "pressed library", Toast.LENGTH_LONG).show();
			break;
			
		case R.id.action_search:
			Toast.makeText(this, "pressed search", Toast.LENGTH_LONG).show();
			break;
			
			
			default: 
			break;
			
			//return true;
		}
		return true;
		//return super.onOptionsItemSelected(item);
	}
		
		
}
