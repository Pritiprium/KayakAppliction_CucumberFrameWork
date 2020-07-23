package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features= "Feature/kayak.feature", glue ={"com.qa.Step"},
plugin = { "html:target/cucumber-reports" },
monochrome = true)

public class runner {

}
