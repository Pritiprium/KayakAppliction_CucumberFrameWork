package com.qa.Step;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

import com.Utility.TestBase;
import com.itextpdf.text.log.SysoCounter;
//import com.qa.PageObject.City_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//@Listeners(com.Listner.TestListner.class)
//public class Booking_Step extends TestBase {
//	//WebDriver driver = null;
//	Logger log = Logger.getLogger(getClass().getSimpleName());
//	
//
//	@Given("^URL passed launch the browser$")
//	public void url_passed_launch_the_browser() throws Throwable {
//		TestBase.TriggerURl();
//	    log.info("Browser Launched Successfully");
//	    
//	}
//	@When("^slect dropoff option$")
//	public void slect_dropoff_option() throws Throwable {
//		City_Page obcity = new City_Page(TestBase.driver);
//		obcity.selectcity();
//		log.info("Flight button clicked");
//	}
//
//	@When("^Enter origin city$")
//	public void enter_origin_city() throws Throwable {
//		//Thread.sleep(3000);
//		City_Page obcity = new City_Page(TestBase.driver);
//		obcity.origincity();
//		log.info("from button clicked");
//		//System.out.println("Entered origin city");
//		log.info("Origin city selected");
//	    
//	}
//
//	@When("^Enter Destination city$")
//	public void enter_Destination_city() throws Throwable {
////		City_Page obcity = new City_Page(TestBase.driver);
////		obcity.destination();
//		System.out.println("Entered destination city");
//
//
//	}
//
//	@Then("^Select Departuer Date$")
//	public void select_Departuer_Date() throws Throwable {
//		System.out.println("Departure Date selected");
//		City_Page obcity = new City_Page(TestBase.driver);
//		obcity.selectdate();
//		System.out.println("start date picked");
//	}
//	@Then("^quit browser$")
//	public void quit_browser() throws Throwable {
//	    TestBase.quitbrowser();
//	}
//	
//	
//	
//	
//}
