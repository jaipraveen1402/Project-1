package org.stepdefinition;

import java.util.List;

import org.baseclass.BaseClass;
import org.pojoclass.HomePagePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlueLynxSearchProduct extends BaseClass{
	HomePagePOJO h;
	
	@Given("launch google chrome and url")
	public void launch_google_chrome_and_url() {
		
		browserlaunch("chrome");
		lauchurl("https://www.bluelynxonline.com/");
	  
		
	}



@When("In the search box search the products")
public void in_the_search_box_search_the_products(io.cucumber.datatable.DataTable d) {
  h=new HomePagePOJO();
  
  List<String> l = d.asList();
  passtext(h.getHomepagesearchbox(), l.get(1));
  
  
  
}


	@Then("click the search button")
	public void click_the_search_button() {
		h=new HomePagePOJO();
		clickWebElement(h.getHomepagesearchbutton());
	    
		
		
	}
}
