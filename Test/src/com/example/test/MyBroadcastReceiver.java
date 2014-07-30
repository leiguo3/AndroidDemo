package com.example.test;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		showNotification(context);
	}

	private void showNotification(Context context) {
		Intent intent = new Intent(context, ActivityA.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
				| Intent.FLAG_ACTIVITY_SINGLE_TOP
				| Intent.FLAG_ACTIVITY_NEW_TASK);
		NotificationManager nmr = (NotificationManager) context
				.getSystemService(Context.NOTIFICATION_SERVICE);
		PendingIntent pi = PendingIntent.getActivity(context, 0, intent, 0);
		Notification.Builder builder = new Notification.Builder(context);
		builder.setContentTitle("Open A with B and C being closed");
		builder.setContentText("Open A with B and C being closed");
		builder.setSmallIcon(R.drawable.ic_launcher);
		builder.setContentIntent(pi);
		builder.setAutoCancel(true);
		Notification nt = builder.build();
		nmr.notify(0, nt);
	}

}
