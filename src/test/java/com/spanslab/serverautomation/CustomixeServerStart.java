package com.spanslab.serverautomation;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class CustomixeServerStart {
	
	public static void main(String[] args) {

		AppiumServiceBuilder builder= new AppiumServiceBuilder();
		//builder.usingAnyFreePort();
		builder.usingPort(1212);
		builder.withLogFile(new File("serverlog.log"));
		builder.withArgument(GeneralServerFlag.RELAXED_SECURITY);
	
		AppiumDriverLocalService service=AppiumDriverLocalService.buildService(builder);
		service.start();
		System.out.println(service.getUrl());
		service.stop();

	}

}
