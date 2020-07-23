package com.Listner;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Report_Utility {
	
	public ExtentReports report;
	public ExtentTest logger;
	public  ExtentReports generateReport() {
		String uniqueDate = new SimpleDateFormat("'Date_yyyyMMddHHmm'").format(new Date());
		String filepath = System.getProperty("user.dir")+"//ExtentReport//Report"+uniqueDate+".Html";
		
		return report=new ExtentReports(filepath);		
	}
	public void createTest(String Testcase) {
		logger = report.startTest(Testcase);
	}
	public void endTestcase() {
		report.endTest(logger);
	}
	public void endReport() {
		report.flush();
	}

}
