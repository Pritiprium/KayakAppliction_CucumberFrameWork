package com.qa.Step;

import org.apache.log4j.Logger;

import com.Utility.TestBase;
import com.qa.PageObject.Search_PageObject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flight_BookingSteps {
	
	Logger log = Logger.getLogger(getClass().getSimpleName());
	
	@Given("^URL passed launch the browser$")
	public void url_passed_launch_the_browser() throws Throwable {
		TestBase.TriggerURl();
	    log.info("Browser Launched Successfully");	    
	}
	@When("^Close the default button$")
	public void close_the_default_button() throws Throwable {
		Search_PageObject obPage = new Search_PageObject(TestBase.driver);
		obPage.closeBtn();
		log.info("Default City canceled");
	}

	@Then("^Select airport$")
	public void select_airport() throws Throwable {
		Search_PageObject obPage = new Search_PageObject(TestBase.driver);
		obPage.selectAirport();
		log.info("O'Hare Airport Selected");
	}

	@When("^Click on destination btn$")
	public void click_on_destination_btn() throws Throwable {
		Search_PageObject obPage = new Search_PageObject(TestBase.driver);
		obPage.toBtn();
		
	}

	@And("^Enter destination city$")
	public void enter_destination_city() throws Throwable {
		Search_PageObject obPage = new Search_PageObject(TestBase.driver);
		obPage.destin_City();
		log.info("Denver Airport Selected");
	}

	@When("^Click on Calendar$")
	public void click_on_Calendar() throws Throwable {
		Search_PageObject obPage = new Search_PageObject(TestBase.driver);
		obPage.calendar();
	}

	@When("^Select Depart Date$")
	public void select_Depart_Date() throws Throwable {
		Search_PageObject obPage = new Search_PageObject(TestBase.driver);
		obPage.departDate();
		log.info("Date July 29th selected ");
	}

	@When("^Select Return Date$")
	public void select_Return_Date() throws Throwable {
		Search_PageObject obPage = new Search_PageObject(TestBase.driver);
		obPage.Return_date();
		log.info("Return Date August 9th selected");
	}

	@Then("^Click On Search btn$")
	public void click_On_Search_btn() throws Throwable {
		Search_PageObject obPage = new Search_PageObject(TestBase.driver);
		obPage.searchBtn();
		log.info("Search Button Cicked");
	}


	@Then("^quit browser$")
	public void quit_browser() throws Throwable {
	    TestBase.quitbrowser();
	}
	
}
