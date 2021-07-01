package com.spanslab.serverautomation;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class DefaultServerStrat1 {

	public static void main(String[] args) {
		
		AppiumDriverLocalService service= null;
	
		try {
			service = AppiumDriverLocalService.buildDefaultService();
			service.start();

			DesiredCapabilities cap= new DesiredCapabilities();
			 cap.setCapability("deviceName", "redmi");
			 cap.setCapability("platformName", "Android");
			 
			 cap.setCapability("app", "C:\\Users\\Admin\\Downloads\\Khan Academy_v6.3.0_apkpure.com.apk");
			 
			 
			 AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(service, cap);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			service.stop();
		}
		
		
	}

}
