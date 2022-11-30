package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOJO extends BaseClass{
	
	public HomePagePOJO() {
		
	PageFactory.initElements(driver, this);
		
	}
	
	@FindAll({
		@FindBy(xpath="(//li[@class='first'])[1]"),
		@FindBy(xpath="(//a[@title='My account'])[1]")
		
	})
	
	private WebElement myaccountbutton;
	
	@FindAll({
		@FindBy(xpath="//input[@id='email']"),
		@FindBy(xpath="(//input[@name='email'])[1]")
		
	})
	
	private WebElement usernamebox ;
	
	
	@FindAll({
		@FindBy(xpath="(//input[@name='passwd'])[1]"),
		@FindBy(xpath="//input[@id='passwd']")
		
	})
	
	private WebElement passwordbox;


	@FindAll({
		@FindBy(xpath="(//button[@type='submit'])[3]"),
		@FindBy(xpath="//button[@id='SubmitLogin']")
		
	})
	
	private WebElement signinbutton;
	
	
	@FindAll({
		@FindBy(xpath="//h2[text()='category']")
		
		
	})
	
	private WebElement category;

	@FindAll({
		@FindBy(xpath="//span[text()='Smartphone & Smartwatch']")
		
		
	})
	
	private WebElement smartphoneandsmartwatchtab;
	
	
	@FindAll({
		@FindBy(xpath="//span[text()='Smartwatch']")
		
		
	})
	
	private WebElement smartwatchtab;
	
	
	@FindAll({
		@FindBy(xpath="(//div[@class='product-image-container'])[1]"),
		@FindBy(xpath="(//a[@title='Xiaomi Mi Smart Band 4 Charging Cable'])[1]")
		
		
	})
	
	private WebElement xiaomimismartband;
	
	
	@FindAll({
		@FindBy(xpath="//span[@class='addcart']"),
		@FindBy(xpath="(//span[text()='Add to cart'])[1]")
		
		
	})
	
	private WebElement addtocart;
	
	@FindAll({
		
		@FindBy(xpath="//div[@class='flexslider ma-nivoslider']"),
		@FindBy(xpath="//div[@id='pos-slideshow-home']")
		
	})
	
	private WebElement homepagefirstimage;
	
	
	@FindAll({
		
		@FindBy(xpath="(//div[@class='box-inner'])[5]"),
		@FindBy(xpath="(//div[@class='banner-box banner-box1'])[1]")
		
	})
	
	private WebElement homepagesecondimage;
	
	@FindAll({
		
		@FindBy(xpath="(//div[@class='col-md-5 col-sm-12 col-sms-12'])[1]"),
		@FindBy(xpath="(//div[@class='box-inner'])[7]")
		
	})
	
	private WebElement homepagethirdimage;
	
	@FindAll({
		
		@FindBy(xpath="(//div[@class='banner-box banner-box1'])[2]"),
		@FindBy(xpath="(//div[@class='box-inner'])[9]")
		
	})
	
	private WebElement homepagefourthimage;
	
	
	


	@FindAll({
		
		@FindBy(xpath="(//div[@class='box-inner'])[10]"),
		@FindBy(xpath="(//div[@class='col-md-5 col-sm-12 col-sms-12'])[2]")
		
	})
	
	private WebElement homepagefifthimage;
	
	

	@FindAll({
		
		@FindBy(xpath="//span[@class='cross']"),
		@FindBy(xpath="//span[@title='Close window']")
		
	})
	
	private WebElement cartclose;
	
	@FindAll({
		
		
		
		@FindBy(xpath="//input[@id='pos_query_top']"),
		@FindBy(xpath="//input[@name='search_query']")
		
		
		
	})
	
	private WebElement homepagesearchbox;
	
	@FindAll({
		
		@FindBy(xpath="(//button[@type='submit'])[1]"),
		@FindBy(xpath="//button[@name='submit_search']")
		
		
	})
	
	private WebElement homepagesearchbutton;
	

	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getHomepagesearchbox() {
		return homepagesearchbox;
	}


	public WebElement getHomepagesearchbutton() {
		return homepagesearchbutton;
	}


	public WebElement getCartclose() {
		return cartclose;
	}


	public WebElement getHomepagefirstimage() {
		return homepagefirstimage;
	}


	public WebElement getHomepagesecondimage() {
		return homepagesecondimage;
	}


	public WebElement getHomepagethirdimage() {
		return homepagethirdimage;
	}


	public WebElement getHomepagefourthimage() {
		return homepagefourthimage;
	}


	public WebElement getHomepagefifthimage() {
		return homepagefifthimage;
	}

	


	public WebElement getCategory() {
		return category;
	}


	public WebElement getSmartphoneandsmartwatchtab() {
		return smartphoneandsmartwatchtab;
	}


	public WebElement getSmartwatchtab() {
		return smartwatchtab;
	}


	public WebElement getXiaomimismartband() {
		return xiaomimismartband;
	}


	public WebElement getAddtocart() {
		return addtocart;
	}


	public WebElement getMyaccountbutton() {
		return myaccountbutton;
	}


	public WebElement getUsernamebox() {
		return usernamebox;
	}


	public WebElement getPasswordbox() {
		return passwordbox;
	}


	public WebElement getSigninbutton() {
		return signinbutton;
	}


}
