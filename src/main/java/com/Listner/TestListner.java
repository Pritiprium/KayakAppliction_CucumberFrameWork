package com.Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Utility.Comman_Utility;
import com.relevantcodes.extentreports.LogStatus;

public class TestListner extends Report_Utility implements ITestListener {

	Comman_Utility obcmn = new Comman_Utility();
	Report_Utility obreport =  new Report_Utility();
	public void onTestStart(ITestResult result) {
		logger = report.startTest(result.getMethod().getMethodName() + "  Test Started");
		System.out.println(result.getMethod().getMethodName() + " Test Started");

	}

	public void onTestSuccess(ITestResult result) {
		logger.log(LogStatus.INFO, result.getMethod().getMethodName() + " Test Success");
		System.out.println(result.getMethod().getMethodName() + " Test Success");

	}

	public void onTestFailure(ITestResult result) {

		try {
			logger.log(LogStatus.FAIL, result.getMethod().getMethodName() + " Test Fail"
					+ logger.addScreenCapture(obcmn.takescreenshot()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		logger.log(LogStatus.SKIP, result.getName()+ " Test case skiped");
		

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		endTestcase();
		endReport();

	}

}
