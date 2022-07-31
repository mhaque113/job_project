package com.bootcamp.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bootcamp.Util.TestBase21;

public class HomePageLocator21 extends TestBase21 {
	public HomePageLocator21() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@class='mh-search-input']")
	public WebElement Searchfield;
	
	@FindBy(how=How.XPATH, using="//span[@class='mh-search-button-label']")
	public WebElement Searchlink;
	
	@FindBy(how=How.XPATH, using="/html/body/main/div/div[3]/div/div[1]/div[2]/div[1]/h1/div/div/span")
	public WebElement verifySearchresult;
	
	@FindBy(how=How.XPATH, using="//input[@class='mh-search-input']")
	public WebElement searchfield2;
	
	@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
	public WebElement SignInButton;
	
	@FindBy(how=How.LINK_TEXT, using="Sign In")
	public WebElement SignInLink;
	
	
	@FindBy(how=How.XPATH, using="/html/body/main/header/div[3]/nav/ul/li[4]/ul/li[2]/a")
	public WebElement supportlink;

}
