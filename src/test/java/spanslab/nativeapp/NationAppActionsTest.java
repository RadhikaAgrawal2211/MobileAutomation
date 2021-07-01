package spanslab.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class NationAppActionsTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		 cap.setCapability("deviceName", "redmi");
		 cap.setCapability("platformName", "Android");
		 
		 cap.setCapability("app", "C:\\Users\\Admin\\Downloads\\Khan Academy_v6.3.0_apkpure.com.apk");
		 
		 
		 AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		 
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.findElementByXPath("//*[@text='Dismiss']").click();
		 Thread.sleep(2000);
		 		 
		 TouchAction action = new TouchAction(driver);
		 
		//get coordinate and tap
		Point p= driver.findElementByXPath("//*[@text='Sign in']").getLocation();
		System.out.println(p.x);
		System.out.println(p.x);
		action.tap(PointOption.point(p.x, p.y)).perform();
		//action.tap(PointOption.point(538, 1332)).perform();
		
		
		 
		 //scroll
		/*
		 action.press(PointOption.point(968, 1406)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		 moveTo(PointOption.point(984, 0).*/
		 
		 
	}

}
