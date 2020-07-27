package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Comman_Utility {
	
	public String takescreenshot() throws Exception {
		String filepath = System.getProperty("user.dir")+"\\ScreenShot\\"
				+new SimpleDateFormat("'image_yyyyMMDD'").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)(TestBase.driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(filepath);
		FileUtils.copyFile(source, destination);
		return filepath;
	}
	
	public void loadproperty(String pathOfPropertyFile) throws Exception {
		try {
			FileInputStream fi = new FileInputStream(pathOfPropertyFile);
			Properties property = new Properties();
			property.load(fi);
			PropertyConfigurator.configure(property);
		} 
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public void test_Data() throws Exception {
		String filepath = System.getProperty("user.dir"+"\\src\\test\\resources\\TestData.properties");
		Properties property = new Properties();
		FileInputStream file = new FileInputStream(filepath);
		property.load(file);
		System.getProperties().putAll(property);
		String Sourcefirst_CityN = System.getProperty("SourceAirport_1");
		String DestFirst_CityN = System.getProperty("DestinationAirport_1");
		String SourceSecond_CityN = System.getProperty("SourceAirport_2");
		String DestSecond_CityN = System.getProperty("DestinationAirport_2");
		String SourceThrid_CityN = System.getProperty("SourceAirport_3");
		String DestThrid_CityN = System.getProperty("DestinationAirport_3");
		
		WebElement originCity = TestBase.driver.findElement(By.xpath(
				"//input[@type='text'][@aria-label='Flight origin input'][@smarty='true'][@name='origin'][@style='opacity: 1;'][@placeholder='From?']"));
		Browser_Utility.waitforVisiblity(originCity);
		originCity.sendKeys(Sourcefirst_CityN);
		
		WebElement desti = TestBase.driver.findElement(By.xpath("//input[@name='destination'][@placeholder='To?']"));
		Browser_Utility.waitforVisiblity(desti);
		desti.sendKeys(DestFirst_CityN);
		
		
		
	}
}
