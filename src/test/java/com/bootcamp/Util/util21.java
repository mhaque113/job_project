package com.bootcamp.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class util21 {
	
public static long implicitlyWait_wait = 40;
public static long pageLoadTimeout_wait= 40;

public static String laptop = "Lenovo";

public static String TV = "Sony 80inches";


public static void ToScreenShots(WebDriver driver, String screenshot) {
	
	File screenfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String currentdir = System.getProperty("user.dir");
	
	try {
		FileUtils.copyFile(screenfile, new File(currentdir+"/ScreenShots/"+screenshot+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
