package com.spanslab.serverautomation;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class DefaultServerStratTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		System.out.println(service.isRunning());
		service.start();
		
		System.out.println(service.isRunning());
		System.out.println(service.getUrl());
		
		Thread.sleep(4000);
		service.stop();
		System.out.println(service.isRunning());
		
		
		

	}

}
