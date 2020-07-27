package com.qa.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class para_testing {
	WebDriver driver = null;
	
	@Given("^open  \"([^\"]*)\" Browser$")
	public void open_Browser(String sbrowser) throws Throwable {
		if (sbrowser.startsWith("ch")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}

	@When("^enter the URL$")
	public void enter_the_URL() throws Throwable {
		driver.get("https:qa-tekarch.firebaseapp.com/");
		System.out.println("URL Entered");
	}

//	@When("^Enter Valid Username and password$")
//	public void enter_Valid_Username_and_password() throws Throwable {
//		WebElement email = driver.findElement(By.id("email_field"));
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOf(email));
//		email.sendKeys("admin123@gmail.com");
//		Thread.sleep(1000);
//		WebElement pass = driver.findElement(By.id("password_field"));
//		wait.until(ExpectedConditions.visibilityOf(pass));
//		pass.sendKeys("admin123");
//		Thread.sleep(1000);
//		System.out.println("username and password entered");
//	}
	
	@When("^Enter Valid Username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_Valid_Username_and_password(String username, String password) throws Throwable {
		WebElement email = driver.findElement(By.id("email_field"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys(username);
		WebElement pass = driver.findElement(By.id("password_field"));
		wait.until(ExpectedConditions.visibilityOf(pass));
		pass.sendKeys(password);
		
		
	}
	
	

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(loginbtn));
		loginbtn.click();
		Thread.sleep(1000);
		System.out.println("Login btn clicked");
	}

	@Then("^quit the browser\\.$")
	public void quit_the_browser() throws Throwable {
		driver.quit();
		System.out.println("Browser closed");
	}

}
