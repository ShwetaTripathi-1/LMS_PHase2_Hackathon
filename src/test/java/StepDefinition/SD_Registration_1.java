package StepDefinition;

import org.junit.Assert;

import Pages.loginPage;
import Pages.registrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Registration_1 extends BaseClass {
	 public registrationPage rp;
	public loginPage lp;
	@Given("User is on LMS website")
	public void user_is_on_lms_website() {
		
        driver.get(baseurl);
	}

	@When("User lands on Registration page")
	public void user_lands_on_registration_page() {

		rp = new registrationPage(driver);
	}

	@Then("User sees the heading on the form as {string}")
	public void user_sees_the_heading_on_the_form_as(String heading) 
	{
		try {
		String actual_heading = rp.signUpFormText();
		Assert.assertEquals(actual_heading, heading);
		}
		catch(Exception ex)
		{
			Assert.fail();
			
		}

	}

	@Given("User is on the Register Page")
	public void user_is_on_the_Register_page() {

		rp = new registrationPage(driver);
	}

	@When("User selects the Log in button")
	public void user_selects_the_log_in_button() {

		rp.clickRegPageLoginBtn();
	}

	@Then("User sees a button with text {string} on the form")
	public void user_sees_a_button_with_text_on_the_form(String string) {

		try{Assert.assertEquals(rp.signUpBtnVisibility(), true);}
		catch(Exception ex)
		{
			Assert.fail();
			
		}
		
	}

	@Then("User lands on Log in page")
	public void user_lands_on_log_in_page() {
		try {
		lp = new loginPage(driver);
		Assert.assertEquals(lp.LogInBtnVisibility(), true);
		}
		catch(Exception ex)
		{
			Assert.fail();
			
		}

	}


}
