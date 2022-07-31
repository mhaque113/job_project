package bootcampStepDef;


import org.apache.log4j.Logger;


import com.bootcamp.PageAction.HomePageAction21;
import com.bootcamp.Util.LogsHelper21;
import com.bootcamp.Util.TestBase21;
import com.bootcamp.Util.util21;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefHomePage21 extends TestBase21{
	
	HomePageAction21 homePageAction =new HomePageAction21();
	//Logger loggs = LogsHelper21.getLogsss(LogsHelper21.class);
	Logger logs = LogsHelper21.getLogsss(LogsHelper21.class);

	@Given("^Navigate \"([^\"]*)\"$")
	public void navigate(String URL) throws Throwable {
	 launchApp(URL);  
	 util21.ToScreenShots(driver, "Home Page");
	 logs.info("Open URL");
	}

	@Then("^Enter Laptop in searchfield$")
	public void enter_Laptop_in_searchfield() throws Throwable {
		homePageAction.enterlaptopinsearch();
		logs.info("Enter Lenevo");
	    
	}

	@Then("^Click on searchlink$")
	public void click_on_searchlink() throws Throwable {
		homePageAction.ClickonLink();
		
	}

	@Then("^verify search Result Displays$")
	public void verify_search_Result_Displays() throws Throwable {
		homePageAction.Verifysearchresultdisplay();
		util21.ToScreenShots(driver, "Search Result");
	    
	}
	

	@Then("^Enter Samsung in searchfield$")
	public void enter_Samsung_in_searchfield() throws Throwable {
		homePageAction.etertvinsearch();
	    
	}
	
	

	@Then("^Users able to Mouse over on Support link$")
	public void users_able_to_Mouse_over_on_Support_link() throws Throwable {
		
	    homePageAction.mouseoverproducts();
	}

	@Then("^User are able to click on Order Support link$")
	public void user_are_able_to_click_on_Order_Support_link() throws Throwable {
		homePageAction.clickonesupportlink();
	   
	}

	@Then("^Users are able to verify Order Support home page$")
	public void users_are_able_to_verify_Order_Support_home_page() throws Throwable {
	   
	}









}
