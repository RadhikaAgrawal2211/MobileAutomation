package com.spanslab.webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WebAppTest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		 cap.setCapability("deviceName", "redmi");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("browserName", "chrome");
		 cap.setCapability("chromedriverExecutable", "C:\\Radhika\\chromedriver_win32\\chromedriver.exe");
		 
		 AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://magento.com/");
		 
		 
		 driver.findElementByXPath("//span[text()='Sign in']").click();
		 
		 
		driver.findElementByXPath("//input[@id='email']").sendKeys("balaji0017@gmail.com");
		 driver.findElementByXPath("//input[@id='pass']").sendKeys("balaji@12345");
		 if(driver.isKeyboardShown()) {
			 driver.hideKeyboard();
		 }
			 
		 driver.findElementByXPath("//button[@type='submit']").click();
		 String title= driver.getTitle();
		 System.out.println(title);
		 
		 driver.quit();

	}

}
