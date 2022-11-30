package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pojoclass.HomePagePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bluelynxhomepageimagesclick extends BaseClass {
	HomePagePOJO h;

	@Given("launch the browser")
	public void launch_the_browser() {

		browserlaunch("chrome");
	}

	@When("launc the url")
	public void launc_the_url() {

		lauchurl("https://www.bluelynxonline.com/");
	}

	@When("click the first image")
	public void click_the_first_image() {
		h = new HomePagePOJO();

		clickWebElement(h.getHomepagefirstimage());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Take the screenshot of firstimage clicked page")
	public void take_the_screenshot_of_firstimage_clicked_page() throws IOException  {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\ProjectCucumber1\\screenshot\\imageone.png");
		FileUtils.copyFile(src, dest);
	}

	@When("click the second image")
	public void click_the_second_image() {
		h = new HomePagePOJO();

		clickWebElement(h.getHomepagesecondimage());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Take the screenshot of secondimage clicked page")
	public void take_the_screenshot_of_secondimage_clicked_page() throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\ProjectCucumber1\\screenshot\\imagetwo.png");
		FileUtils.copyFile(src, dest);
	}

	@When("click the third image")
	public void click_the_third_image() {
		h = new HomePagePOJO();

		clickWebElement(h.getHomepagethirdimage());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Take the screenshot of thirdimage clicked page")
	public void take_the_screenshot_of_thirdimage_clicked_page() throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\ProjectCucumber1\\screenshot\\imagethree.png");
		FileUtils.copyFile(src, dest);
	}

	@When("click the fourth image")
	public void click_the_fourth_image() {
		h = new HomePagePOJO();

		clickWebElement(h.getHomepagefourthimage());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Take the screenshot of fourthimage clicked page")
	public void take_the_screenshot_of_fourthimage_clicked_page() throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\ProjectCucumber1\\screenshot\\imagefour.png");
		FileUtils.copyFile(src, dest);
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click the fifth image")
	public void click_the_fifth_image() {
		h = new HomePagePOJO();

		clickWebElement(h.getHomepagefifthimage());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Take the screenshot of fifthimage clicked page")
	public void take_the_screenshot_of_fifthimage_clicked_page() throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\ProjectCucumber1\\screenshot\\imagefive.png");
		FileUtils.copyFile(src, dest);
	}

}
