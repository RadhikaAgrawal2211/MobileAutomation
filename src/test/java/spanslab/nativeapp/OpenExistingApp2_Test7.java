package spanslab.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class OpenExistingApp2_Test7 {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		 cap.setCapability("deviceName", "redmi");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("appPackage", "com.myntra.android"); // can able to get via inspect
		 cap.setCapability("appActivity", "com.myntra.android");//for Activity we need to intall apk Analyzer and search app name and search for main, home, splashscreen word in activity
		 cap.setCapability("noReset", true);// to avaoid dismiss screen everytime we reset the app
		
		 AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.aranoah.healthkart.plus:id/service_icon\")").click();
	}

}
