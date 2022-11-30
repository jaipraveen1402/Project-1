package org.stepdefinition;

import org.baseclass.BaseClass;
import org.pojoclass.HomePagePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BluelynxNegativeLoginCheck extends BaseClass {
	HomePagePOJO h;
	
	@Given("To launch the chrome browser")
	public void to_launch_the_chrome_browser() {
	    
		browserlaunch("chrome");
	}

	@When("To launch the url to launch the application")
	public void to_launch_the_url_to_launch_the_application() {
	   lauchurl("https://www.bluelynxonline.com/");
	}

	@When("To mouseover action to my account button")
	public void to_mouseover_action_to_my_account_button() {
		h= new HomePagePOJO();
		moveTheCursor(h.getMyaccountbutton());
		
	}

	@When("To click the myaccount button")
	public void to_click_the_myaccount_button() {
		h= new HomePagePOJO();
		clickWebElement(h.getMyaccountbutton());
		
	}

	@When("To pass the invalid username in username textbox")
	public void to_pass_the_invalid_username_in_username_textbox() {
		h= new HomePagePOJO();
		passtext(h.getUsernamebox(), "jaipravee@gmail.com");
		
		
	}

	@When("To pass the invalid password in password textbox")
	public void to_pass_the_invalid_password_in_password_textbox() {
		h= new HomePagePOJO();
		passtext(h.getPasswordbox(), "aql@123");
	
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
		h= new HomePagePOJO();
		clickWebElement(h.getSigninbutton());
		
	}

	@Then("To close the browser")
	public void to_close_the_browser() {

		driver.close();
	}


}
