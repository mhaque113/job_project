package com.bootcamp.PageAction;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.bootcamp.PageLocator.HomePageLocator21;
import com.bootcamp.Util.TestBase21;
import com.bootcamp.Util.util21;

public class HomePageAction21 extends TestBase21{
	HomePageLocator21 homepageLoc = new HomePageLocator21();

	public void enterlaptopinsearch() throws Exception {
		homepageLoc.Searchfield.sendKeys(util21.laptop);
		//Thread.sleep(3000);
	}
	public void ClickonLink() throws Exception {
		homepageLoc.Searchlink.click();
		//Thread.sleep(3000);

	}

	public void Verifysearchresultdisplay() {
		boolean searchresult =homepageLoc.verifySearchresult.isDisplayed();
		Assert.assertTrue(searchresult);
		System.out.println("Search Result Verified");

	}

	public void etertvinsearch() {
		homepageLoc.searchfield2.sendKeys(util21.TV);
	}
	public void ClickonLink1(){
		homepageLoc.Searchlink.click();

	}

	public void mouseoverproducts() throws Exception {

		Actions ac = new Actions(driver); 
		ac.moveToElement(homepageLoc.supportlink).click().build().perform();
		Thread.sleep(4000);
	}

	public void clickonesupportlink() throws Exception {
		homepageLoc.supportlink.click();
		Thread.sleep(5000);

	}
}
