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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

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
}
