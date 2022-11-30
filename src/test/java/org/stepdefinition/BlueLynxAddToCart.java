package org.stepdefinition;

import org.baseclass.BaseClass;
import org.pojoclass.HomePagePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlueLynxAddToCart extends BaseClass {
	
	HomePagePOJO l;
	
	@Given("To launch the browser")
	public void to_launch_the_browser() {
	    browserlaunch("chrome");
	}
	
	@When("To launch url")
	public void to_launch_url() {
	  lauchurl("https://www.bluelynxonline.com/");
	}



	@When("click category button twice to check the functionality")
	public void click_category_button_twice_to_check_the_functionality() {
		l=new HomePagePOJO();
		clickWebElement(l.getCategory());
		clickWebElement(l.getCategory());
	}

	@When("mouseover to smartphone and smartwatch tab")
	public void mouseover_to_smartphone_and_smartwatch_tab() {
	   l=new HomePagePOJO();
	   moveTheCursor(l.getSmartphoneandsmartwatchtab());
		
	}

	@When("mouseover to smartwatch tab and click it")
	public void mouseover_to_smartwatch_tab_and_click_it() {
	   l=new HomePagePOJO();
	   moveTheCursor(l.getSmartwatchtab());
	   clickWebElement(l.getSmartwatchtab());
	}

	@When("click the first xiaomi product")
	public void click_the_first_xiaomi_product() {
	   l=new HomePagePOJO();
	   clickWebElement(l.getXiaomimismartband());
	}

	@Then("click Addtocart")
	public void click_Addtocart() {
	   l=new HomePagePOJO();
	   clickWebElement(l.getAddtocart());
	}


}
