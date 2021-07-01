package com.spanslab.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AutomationCloud_test {

	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "radhikaagrawal_jN8Qrm");
	      caps.setCapability("browserstack.key", "jskWrosX7heoteF32jQE");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "iPhone XS");
	      caps.setCapability("os_version", "12");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "First ios Java Project");
	      caps.setCapability("build", "Java iOS");
	      caps.setCapability("name", "first_test");
	      
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL.
	      // and desired capabilities defined above
	        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
	            new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
	        
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			// here write to code of click and sendkeys
			 driver.quit();
	        

	}

}
