package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class ActivityA extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_a);
		findViewById(R.id.start_b_button).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startB();
			}
		});
	}
	
	private void startB(){
		Intent intent = new Intent(this, ActivityB.class);
		startActivity(intent);
	}

}
