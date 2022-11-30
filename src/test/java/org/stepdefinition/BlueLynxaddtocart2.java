package org.stepdefinition;

import java.time.Duration;

import org.baseclass.BaseClass;
import org.pojoclass.HomePagePOJO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlueLynxaddtocart2 extends BaseClass {

	HomePagePOJO l;

	@When("launch url")
	public void launch_url() {
		browserlaunch("chrome");
		lauchurl("https://www.bluelynxonline.com/");
	}

	@When("click category button twice  check the functionality")
	public void click_category_button_twice_check_the_functionality() {
		l = new HomePagePOJO();
		clickWebElement(l.getCategory());
		clickWebElement(l.getCategory());
	}

	@When("mouseover  smartphone and smartwatch tab")
	public void mouseover_smartphone_and_smartwatch_tab() {

		l = new HomePagePOJO();
		moveTheCursor(l.getSmartphoneandsmartwatchtab());
	}

	@When("mouseover  smartwatch tab and click it")
	public void mouseover_smartwatch_tab_and_click_it() {

		l = new HomePagePOJO();
		moveTheCursor(l.getSmartwatchtab());
		clickElement(l.getSmartwatchtab());
	}

	@When("click  first xiaomi product")
	public void click_first_xiaomi_product() {

		l = new HomePagePOJO();
		clickWebElement(l.getXiaomimismartband());
		
	}

	@Then("Addtocart")
	public void addtocart() {

		l = new HomePagePOJO();
		clickWebElement(l.getAddtocart());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("close the cart")
	public void close_the_cart() {
	    
		l = new HomePagePOJO();
		clickElement(l.getCartclose());
	}

	@Then("add to the cart")
	public void add_to_the_cart() {
		l = new HomePagePOJO();
		clickWebElement(l.getAddtocart());

	}



}
