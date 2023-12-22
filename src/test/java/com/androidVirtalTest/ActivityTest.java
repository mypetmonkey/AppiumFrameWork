package com.androidVirtalTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.androidUtility.VirtualDeviceBaseClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;

public class ActivityTest extends VirtualDeviceBaseClass{
	
	@Test
	public void test() {
//		options.setAppPackage("io.appium.android.apis");
//        options.setAppActivity("io.appium.android.apis.accessibility.ClockBackActivity");	
//		driver.findElement(By.id("io.appium.android.apis:id/button")).click();
	
	Activity act=new Activity("io.appium.android.apis","io.appium.android.apis.accessibility.ClockBackActivity");
        // driver.startActivity(act);
         
         
	}
}
