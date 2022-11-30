package org.stepdefinition;

import org.baseclass.BaseClass;
import org.pojoclass.HomePagePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BluelynxScenarioOutline extends BaseClass {
	HomePagePOJO h;
	@Given("launch the chrome browser")
	public void launch_the_chrome_browser() {
	    
		browserlaunch("chrome");
	}

	@When("To launch the url")
	public void to_launch_the_url() {
		 lauchurl("https://www.bluelynxonline.com/");
	
	}

	@When("To mouseover action  my account button")
	public void to_mouseover_action_my_account_button() {
	 
		h= new HomePagePOJO();
		moveTheCursor(h.getMyaccountbutton());
	}

	@When("To click  myaccount button")
	public void to_click_myaccount_button() {
		h= new HomePagePOJO();
		clickWebElement(h.getMyaccountbutton());
		
	}

	@When("To pass the invalid username {string} username textbox")
	public void to_pass_the_invalid_username_username_textbox(String email) {
		h= new HomePagePOJO();
		passtext(h.getUsernamebox(), email);
		
	
	}

	@When("To pass the invalid password {string} password textbox")
	public void to_pass_the_invalid_password_password_textbox(String pass) {
		h= new HomePagePOJO();
		passtext(h.getPasswordbox(), pass);
	
		
		
	}

	@When("To click  signin button")
	public void to_click_signin_button() {
	    
		h= new HomePagePOJO();
		clickWebElement(h.getSigninbutton());
		
		
	}

	@Then("close the browser")
	public void close_the_browser() {
	    
		driver.close();
		
	}
	
}
