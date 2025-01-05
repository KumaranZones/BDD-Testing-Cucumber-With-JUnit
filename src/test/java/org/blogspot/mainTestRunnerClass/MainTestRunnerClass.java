package org.blogspot.mainTestRunnerClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testBase.BaseClass;
import org.testBase.Constants;
import org.testUtilities.DriverHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//org//blogspot//featureFile",
									glue="org.blogspot.stepDefinition",
									monochrome = true,
									dryRun = !true,
									strict = true,
									plugin = {"html:Reports/Html_Report.html",
													"pretty",
													"json:Reports/Json_Report.json",
													"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"}
									)
public class MainTestRunnerClass extends BaseClass{

	@BeforeClass
	public static void setup() {
		BaseClass.browserLaunch(Constants.getBrowser1());
	}
	@AfterClass
	public static void teadDown() {
		DriverHelper.driverClose();
	}
}
