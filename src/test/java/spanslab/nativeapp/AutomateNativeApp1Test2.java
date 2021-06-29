package spanslab.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AutomateNativeApp1Test2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		 cap.setCapability("deviceName", "redmi");
		 cap.setCapability("platformName", "Android");
		 
		 cap.setCapability("app", "C:\\Users\\Admin\\Downloads\\Khan Academy_v6.3.0_apkpure.com.apk");
		 
		 
		 AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		 
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.findElementByXPath("//*[@text='Dismiss']").click();
		 driver.findElementByXPath("//*[@content-desc='Profile tab']").click();
		 driver.findElementByXPath("//*[@text='Sign up with email']").click();
		 driver.findElementByXPath("//*[@text='First name']").sendKeys("Radhika");
		 driver.findElementByXPath("//*[@text='Last name']").sendKeys("Agrawal");
		 driver.findElementByXPath("//*[@text='Birthday']").click();
		 
		 while(!driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[1]").getText().equals("Aug"))
		 {
			 driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[1]").click();
			 driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[1]").clear();
			 driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[1]").sendKeys("Aug"); 
		 }
		 
		 
		 driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[2]").click();
		 driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[2]").clear();
		 driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[2]").sendKeys("08");
		 
		 driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[3]").click();
		 driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[3]").clear();
		 driver.findElementByXPath("(//*[@resource-id='android:id/numberpicker_input'])[3]").sendKeys("1990");
		 
		 driver.findElementByXPath("//*[@text='OK']").click();
		 driver.findElementByXPath("//*[@text='Email address']").sendKeys("Radhika@gmail.com");
		 driver.findElementByXPath("//*[@text='Password']").sendKeys("2211");
		 driver.findElementByXPath("//*[@text='CREATE']").click();
		 Thread.sleep(4000);
		 driver.closeApp();

	}

}
