package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ActivityB extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_b);
		findViewById(R.id.start_c_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startC();
					}
				});
	}
	
	private void startC(){
		Intent intent = new Intent(this, ActivityC.class);
		startActivity(intent);
	}

}
