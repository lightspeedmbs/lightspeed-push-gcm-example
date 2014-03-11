package com.demo.lightspeedgcm;

import com.testflightapp.lib.TestFlight;

import android.app.Application;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		TestFlight.takeOff(this, "6608c17f-dbb6-4353-b7d8-92b5ddb2bbdb");
	}
}
