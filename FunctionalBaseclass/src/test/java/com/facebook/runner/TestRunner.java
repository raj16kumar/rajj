package com.facebook.runner;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.facebook.baseclass.FunctionalBaseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:src\\test\\java\\amazon\\reports.json","junit:src\\test\\java\\amazon\\reports.junit","html:src\\test\\java\\amazon\\reports"}, 
		
features="C:\\Users\\Sadhana\\eclipse-workspace\\FunctionalBaseclass\\feature\\amazon.feature",
glue="com.facebook.setpdefinition",
dryRun=false,strict=true,monochrome=true,tags="@TC-002")


public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void driverlaunch() throws Exception {
		FunctionalBaseclass.launchApp();

	}
	
	@AfterClass
	public static void driverQuit() {
		FunctionalBaseclass.quit();
					}

}
