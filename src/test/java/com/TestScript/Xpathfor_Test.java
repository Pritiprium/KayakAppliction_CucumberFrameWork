package com.TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Utility.Browser_Utility;
import com.Utility.Comman_Utility;
import com.Utility.TestBase;

public class Xpathfor_Test extends TestBase {

	public static void main(String[] args) throws Exception {
		Comman_Utility obcmn = new Comman_Utility();
		Browser_Utility.launchbrwsr();
		JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

		WebElement crossbtn = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[local-name()='svg'][1]/*[name()='use'][1]"));
		Browser_Utility.waitforVisiblity(crossbtn);
		crossbtn.click();
		WebElement originCity = driver
				.findElement(By.xpath("//*[contains(@id,'origin-airport')][@placeholder='From?']"));
		Browser_Utility.waitforVisiblity(originCity);
		originCity.sendKeys("Chi");
		Thread.sleep(2000);
		List<WebElement> selct_city = driver
				.findElements(By.xpath("//*[@role='option'][@tabindex='0']//div[@class='smarty-icon-wrapper']"));
		selct_city.get(0).click();
		Thread.sleep(2000);
		WebElement to = driver
				.findElement(By.xpath("//div[@data-placeholder='To?'and@aria-label='Flight destination input']"));
		Browser_Utility.waitforVisiblity(to);
		to.click();

		WebElement desti = driver.findElement(By.xpath("//input[@name='destination'][@placeholder='To?']"));
		Browser_Utility.waitforVisiblity(desti);
		desti.sendKeys("Dallas");
		List<WebElement> desti_City = driver
				.findElements(By.xpath("//*[@role='option'][@tabindex='0']//div[@class='smarty-icon-wrapper']"));
		////div[contains(@id,'destination-airport-smartbox-dropdown')]//li[@role='option'][@tabindex='0']
		////*[contains(@id,'destination-airport-smartbox-dropdown')]
		Browser_Utility.ListElements(desti_City);
		desti_City.get(1).click();
		Thread.sleep(2000);
		List<WebElement> calendar = driver.findElements(By.xpath("//*[contains(@class,'_iaf _iEU _iam _iai')]"));
		calendar.get(0).click();
	
		WebElement start_Date = driver.findElement(By.xpath("//div[@aria-label='July 31'][@role='gridcell']"));
		start_Date.click();
		
//		List<WebElement> return_calendar = driver.findElements(By.xpath("//*[contains(@class,'_iaf _iEU _iam _iai')]"));
//		return_calendar.get(1).click();
//		

		WebElement return_Date = driver
				.findElement(By.xpath("//div[@aria-label=\"August 29\"]"));
		return_Date.click();
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.xpath(
				"//div[@class='search-form-inner']//button[@type='submit'][@title='Search flights'][@tabindex='0']"));
		Browser_Utility.waitforVisiblity(search);
		search.click();
		Thread.sleep(2000);
		WebElement crosss_Alrt = driver
				.findElement(By.xpath("//button[@class='Button-No-Standard-Style close-button']"));
		Browser_Utility.waitforVisiblity(crosss_Alrt);
		js.executeScript("arguments[0].click();", crosss_Alrt);
		Thread.sleep(5000);
		Browser_Utility.Tearoff();

	}
}