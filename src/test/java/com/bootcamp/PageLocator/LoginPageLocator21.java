package com.bootcamp.PageLocator;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bootcamp.Util.TestBase21;

public class LoginPageLocator21 extends TestBase21 {
	
	public LoginPageLocator21() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="EmailAddress")
	public WebElement EmailField;
	
	@FindBy(how=How.ID, using="Password")
	public WebElement PassField;
	
	@FindBy(how=How.XPATH, using="//button[@id='sign-in-button']")
	public WebElement ClickSign;
	
	@FindBy(how=How.XPATH, using="")
	public WebElement Search;

}
