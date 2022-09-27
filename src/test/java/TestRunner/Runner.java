package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.junit.runner.RunWith;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import utilities.ReadConfig;

@RunWith(Cucumber.class)

@CucumberOptions(
		//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"},
		//	plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		// plugin = { "pretty","html:target/cucumber.html"},
		// plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		//plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		// plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true , features ="src/test/resources/Features", glue = { "StepDefinition",
				"Hooks" }
		
		
		)

public class Runner {
	
	
	
}
