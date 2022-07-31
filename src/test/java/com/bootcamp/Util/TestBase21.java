package com.bootcamp.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase21 {
	public static Properties pro21;
	public static WebDriver driver;
	
	public TestBase21() {
		
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\bootcamp\\config\\config21.properties");
			pro21 = new Properties ();
			pro21.load(files);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void initilize21() {
		String Browsername = pro21.getProperty("Browser_1");
		if(Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(util21.implicitlyWait_wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(util21.pageLoadTimeout_wait, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		}
		else
			System.out.println("Chrome Not Found");
		
	}
	
public static void launchApp(String arg1) {
	driver.get(pro21.getProperty("URL_1"));
	
	
	
}
}
