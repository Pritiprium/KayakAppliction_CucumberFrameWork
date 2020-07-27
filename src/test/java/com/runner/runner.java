package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features= "Feature/kayak.feature", glue ={"com.qa.Step"},
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},


monochrome = true)

public class runner {
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File("configs/extent-config.xml"));
	 }

}
