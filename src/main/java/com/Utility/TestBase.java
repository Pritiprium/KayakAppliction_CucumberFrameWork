package com.Utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Listner.Report_Utility;
import com.Listner.TestListner;

public class TestBase {

	public static WebDriver driver ;
	Browser_Utility obBrwsr = new Browser_Utility();
	static Comman_Utility obcoman = new Comman_Utility();
	Report_Utility obreport = new Report_Utility();
	TestListner oblistner = new TestListner();
	
	
	@BeforeSuite
	public static void TriggerURl() throws Exception {
		Browser_Utility.launchbrwsr();
		obcoman.loadproperty(System.getProperty("user.dir")+"\\src\\main\\resources\\Property\\log4j.properties");
	}
	
	@AfterSuite
	public static void quitbrowser() {
		Browser_Utility.Tearoff();
	}
	
}
