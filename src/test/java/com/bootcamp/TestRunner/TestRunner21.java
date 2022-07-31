package com.bootcamp.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.bootcamp.Util.TestBase21;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/recources/Features21"} , 
plugin = {"json:target/cucumber.json"},
glue = "bootcampStepDef",

tags= {"@BootCamp2"})
public class TestRunner21 extends AbstractTestNGCucumberTests  {

	@BeforeTest
	public void openApplicationURL() {
		TestBase21 launch21= new TestBase21();
		launch21.initilize21();

	}
	@AfterTest
	public void closeApplicationURL() {
		TestBase21 close21= new TestBase21();
		close21.driver.quit();
	}

}
