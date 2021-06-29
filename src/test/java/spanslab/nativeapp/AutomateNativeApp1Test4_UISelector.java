package spanslab.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class AutomateNativeApp1Test4_UISelector {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		 cap.setCapability("deviceName", "redmi");
		 cap.setCapability("platformName", "Android");
		 
		 cap.setCapability("app", "C:\\Users\\Admin\\Downloads\\Khan Academy_v6.3.0_apkpure.com.apk");
		 
		 
		 AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		 
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("UiSelector().text(\"Dismiss\")").click();
		 driver.findElementByAndroidUIAutomator("UiSelector().description(\"Profile tab\")").click();
		 driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"org.khanacademy.android:id/tab_bar_button_home\")").click();
		 
		 //scroll
		 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		 while( driver.findElementsByAndroidUIAutomator("UiSelector().text(\"Arts and humanities\")").size()==0)
		 {
			
			 
			 driver.executeScript("mobile:shell", ImmutableMap.of("command", "input touchscreen swipe 1000 800 1000 400" ));
		 }
		 
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("UiSelector().text(\"Arts and humanities\")").click();
		
		 Thread.sleep(4000);
		 driver.closeApp();

	}

}
