package spanslab.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class OpenExistingApp_Test5 {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		 cap.setCapability("deviceName", "redmi");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("appPackage", "org.khanacademy.android"); // can able to get via inspect
		 cap.setCapability("appActivity", "org.khanacademy.android.ui.library.MainActivity");//for Activity we need to intall apk Analyzer and search app name and search for main, home, splashscreen word in activity
		 cap.setCapability("noReset", true);// to avaoid dismiss screen everytime we reset the app
		
		 
		  AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);

	}

}
