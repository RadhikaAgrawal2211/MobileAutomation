package com.spanslab.webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class hdfcLoginTest {

	public static void main(String[] args) throws MalformedURLException {
		
			DesiredCapabilities cap= new DesiredCapabilities();
			 cap.setCapability("deviceName", "redmi");
			 cap.setCapability("platformName", "Android");
			 cap.setCapability("browserName", "chrome");
			 cap.setCapability("chromedriverExecutable", "C:\\Radhika\\chromedriver_win32\\chromedriver.exe");
			 
			 AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
			 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 driver.get("https://netbanking.hdfcbank.com/netbanking/");
			 driver.switchTo().frame(0);
			 driver.findElementByXPath("//input[@name='fldLoginUserId']").sendKeys("Radhika");
			 driver.switchTo().defaultContent();

	}

}
