package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ActivityC extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_c);
		findViewById(R.id.show_noti_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						
					}
				});
	}



}
