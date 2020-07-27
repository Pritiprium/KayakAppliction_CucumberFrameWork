package com.Utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Utility {
	public static void launchbrwsr() throws Exception {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.iedriver().setup();
		//TestBase.driver = new InternetExplorerDriver();
		TestBase.driver = new ChromeDriver();
		TestBase.driver.get("https://www.kayak.com/flights");
		TestBase.driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	public static void waitforVisiblity(WebElement elefowait) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(elefowait));
	}
	
	public static void ListElements(List<WebElement> elements) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public static void Tearoff() {
		TestBase.driver.quit();
	}

}
