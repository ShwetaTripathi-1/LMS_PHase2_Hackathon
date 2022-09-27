package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.*;
import java.lang.Thread;
import Pages.loginPage;
import Pages.loginPageHomePageReference;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_login extends BaseClass {

	Logger log = LogManager.getLogger("SD_login.java");

	String tittle;
	public loginPage lp;
	public loginPageHomePageReference lpHPRef;
	private static String[] errormessage = new String[110];

	@Given("user is  on browser")
	public void user_is_on_browser() {

		lp = new loginPage(driver);

	}

// open the url of LMS website
	@When("user opens LMS Website")
	public void user_opens_lms_website() {

		lp = new loginPage(driver);
		driver.get(baseurl);
	}

// 
	@Then("user is on Login Page")
	public void user_is_on_login_page() {
		/*
		 * String actualUrl = driver.getCurrentUrl(); String expectedUrl = url;
		 * Assert.assertEquals(actualUrl, expectedUrl);
		 */
		Assert.assertEquals(lp.LogInBtnVisibility(), true);
	}

	@Given("User lands on Login Page")
	public void user_lands_on_login_page() {

		driver.getTitle();
	}

	@When("User enters email {string}, password {string}")
	public void user_enters_email_and_password(String emailid, String Pwd) {
		lp = new loginPage(driver);

		lp.setUserName(emailid);
		lp.setPassword(Pwd);
		
		lp.clickLoginBtn();

	}

	@Then("User successfully  login")
	public void user_successfully_login() {
		try {
			lpHPRef = new loginPageHomePageReference(driver);
			Assert.assertEquals(lpHPRef.HomePageLabelVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
		

	}

}
