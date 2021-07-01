package spanslab.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class HybridApp_Test {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		 cap.setCapability("deviceName", "redmi");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("appPackage", "com.ltts.myts"); // can able to get via inspect
		 cap.setCapability("appActivity", "android.support.customtabs.trusted.LauncherActivity");//for Activity we need to intall apk Analyzer and search app name and search for main, home, splashscreen word in activity
		 cap.setCapability("chromedriverExecutable", "C:\\Radhika\\chromedriver_win32\\chromedriver.exe");
		
		 
		  AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		  
		  // this code or just one line below both are same thing
		  
		  /*
		  String currentContext= driver.getContext();
			System.out.println(currentContext);
			System.out.println("--------------------------------------");
			
			Set<String> contexts= driver.getContextHandles();
			
			for(String context : contexts)
			{
				System.out.println(context);
				
				driver.context(context);
				
				if(driver.findElementsByXPath("//*[@id='txtPassword']").size()>0)
				{
					break;
				}
			}*/
		  
		  
			// OR just below one line
			driver.context("WEBVIEW_chrome");  
			
			
			//it will try to point to the context where //*[@id='txtPassword'] is available
			driver.findElementByXPath("//*[@id='txtUsername']").sendKeys("123");
			driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("hello123");
			driver.findElementByXPath("//*[@id='submit']").click();

			driver.context("NATIVE_APP");
			driver.findElementByXPath("(//*[@resource-id='txtUsername']").sendKeys("Aug"); 
		  }

}
