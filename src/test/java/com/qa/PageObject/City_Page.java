package com.qa.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;

import com.Utility.Browser_Utility;
import com.Utility.TestBase;
//@Listeners(com.Listner.TestListner.class)
//public class City_Page extends TestBase {
//	public City_Page(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
//
//	@FindBy(how = How.XPATH, using = "//li[@class='col js-vertical-flights _iMq _ia1 _iaL _irH _ics']")
//	WebElement flight;
//	
//	@FindBy(how=How.ID,using = "c3pHC-switch-display-status")
//	WebElement roundtrip;
//	
//	@FindBy(how = How.XPATH, using = "//div[@id='yl5r-origin-airport-display-multi-container']//button[@class='Button-No-Standard-Style js-remove-selection _iae _h-Y']")
//	WebElement crossbtn;
//
//	@FindBy(how = How.CSS, using = "#SqiZ-origin-airport-display-multi-container")
//	WebElement fromcity;////input[@id='yl5r-origin-airport']   //div[@id='Jado-origin-airport-display-inner'] //div[@id='F7i6-origin-airport-display-multi-container']
//	
//	
//
//	@FindBy(how = How.ID, using = "//div[@class='_ia1 _h-8 _itL']//input[@id='F7i6-origin-airport']")
//	WebElement origincity;
//
//	@FindBy(how = How.XPATH, using = "//input[@id='fChu-destination-airport']")
//	WebElement destiCity;
//	
//	@FindBy(how = How.XPATH,using = "//div[@id='c_jsD-dateRangeInput-display-start-inner']")
//	WebElement StartDate;
//	
//	@FindBy(how = How.XPATH,using = "//div[@id='ePNi-pickup-date-input']")
//	WebElement innerdate;
//	
//
//	public void selectcity() {
//		Browser_Utility.waitforVisiblity(flight);
//		flight.click();
//	}
//
//	public void origincity() throws Exception {
////		Browser_Utility.waitforVisiblity(crossbtn);
////		crossbtn.click();
//		Browser_Utility.waitforVisiblity(fromcity);
//		fromcity.click();
////		Browser_Utility.waitforVisiblity(origincity);
//		//Thread.sleep(3000);
//		fromcity.sendKeys("Chicago");
//		fromcity.sendKeys(Keys.ENTER);
//	}
//
//	public void destination() {
//		Browser_Utility.waitforVisiblity(destiCity);
//		destiCity.sendKeys("Denver");
//		destiCity.sendKeys(Keys.ENTER);
//	}
//	public void selectdate() {
//		Browser_Utility.waitforVisiblity(innerdate);
//		innerdate.click();
//	}
//
//}
