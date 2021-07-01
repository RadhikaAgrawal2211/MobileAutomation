package com.spanslab.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SigninCloud_Test {

	public static void main(String[] args) throws MalformedURLException {
		
		 DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "radhikaagrawal_jN8Qrm");
	      caps.setCapability("browserstack.key", "jskWrosX7heoteF32jQE");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://14e0484e0a2f50e036c08e35f610070f0bed9544");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "Khan Academy Java Project");
	      caps.setCapability("build", "Java Android- Spanslab");
	      caps.setCapability("name", "Signin invalid test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        

	      /* Write your Custom code here */
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			 driver.findElementByXPath("//*[@text='Dismiss']").click();
			 driver.findElementByXPath("//*[@content-desc='Profile tab']").click();
			 driver.findElementByXPath("//*[@text='Sign in']").click();
			 driver.findElementByXPath("//*[@text='Enter an e-mail address or username']").sendKeys("Radhika");
			 driver.findElementByXPath("//*[@text='Password']").sendKeys("Radhika");
			 driver.findElementByXPath("//*[@content-desc='Sign in']").click(); 
			 String actualmsg = driver.findElementByXPath("//*[@text='Invalid password']").getText();
			 System.out.println(actualmsg);
			 
	        
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	      driver.quit();
	}

}
