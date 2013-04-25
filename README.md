lightspeed-android-gcm-demo
===========================
This project is a simple demostration of the integration of Lightspeed SDK 2.0 with GCM notification

Before building and run the project, you would have to prepare the following items.
( For more detail instructions (Traditional Chinese), refer to http://docs.lightspeedmbs.com/ and select GCM快速開發指南)

A.Retrieve GCM Service
	1. Create your Google API Project on https://code.google.com/apis/console
	2. Note down the Project number
	3. Enable Google Cloud Messaging(GCM) service.
	4. Create new Server key to retrieve API key.
B.Retrieve Lightspeed Service
	1. Register your account on http://admin.lightspeedmbs.com/apps
	2. Create a Lightspeed application with your account.
	3. Bind your Android application package name with your Lightspeed application
	4. Fill in your Google GCM API Key
	5. Download and import Lightspeed Android SDK into your Android project
	6. Set the AndroidManifest.xml file. Replace with your Lightspeed APP_KEY and Google API Project number