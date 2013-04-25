lightspeed-android-gcm-demo
===========================
This project is a simple demostration of the integration of Lightspeed SDK 2.0 with GCM notification

Before building and run the project, you would have to prepare the following items.<br>
( For more detail instructions (Traditional Chinese), refer to http://docs.lightspeedmbs.com/ and select "GCM快速開發指南")

* Retrieve GCM Service<br />
	1. Create your Google API Project on https://code.google.com/apis/console<br />
	2. Note down the Project number<br />
	3. Enable Google Cloud Messaging(GCM) service.<br />
	4. Create new Server key to retrieve API key.<br />
* Retrieve Lightspeed Service<br />
	1. Register your account on http://admin.lightspeedmbs.com/apps<br />
	2. Create a Lightspeed application with your account.<br />
	3. Bind your Android application package name with your Lightspeed application<br />
	4. Fill in your Google GCM API Key<br />
	5. Download and import Lightspeed Android SDK into your Android project<br />
	6. Set the AndroidManifest.xml file. Replace with your Lightspeed APP_KEY and Google API Project number<br />