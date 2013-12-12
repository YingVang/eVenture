package com.example.eventure;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddToLib extends Activity {
	
	
	Button mButton;
	EditText eName, eAuthor;
	String sN, sA;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_to_lib);
		
		mButton = (Button)findViewById(R.id.button1);
		
		mButton.setOnClickListener(new View.OnClickListener() {
	          public void onClick(View view) {
	            eName   = (EditText)findViewById(R.id.editText1);
	            eAuthor = (EditText)findViewById(R.id.editText2);
	            sN = eName.getText().toString();
	            sA = eAuthor.getText().toString();
	            Toast.makeText(AddToLib.this, "Name: "+ sN + ", Author: "+ sA , Toast.LENGTH_LONG).show();
	            
	          }
	        });
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_to_lib, menu);
		return true;
	}

}
