package Hooks;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;



import StepDefinition.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LMS_Hooks extends BaseClass {

	@Before("@driversetup")
	public void browserSetUp() throws IOException, InterruptedException {
		System.out.println("Before Hooks");
		setUpDriver();

	}
	
	
	
}
