package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Base.BaseClass;
import io.cucumber.java.en.*;

public class SD_Login extends BaseClass {
	Logger log = LogManager.getLogger("SD_Login.java");
	String tittle;
	
	@Given("user is  on browser")
	public void user_is_on_browser() {
		System.out.println("Test");
		//setUpDriver();
		tittle = driver.getTitle();
		log.info("The Login Page tittle is :" +tittle);
		System.out.println("Pre Home Page Title is: " + tittle);
	  
	}

	@When("user opens LMS Website")
	public void user_opens_lms_website() {
	   
	}

	@Then("user is on Login Page")
	public void user_is_on_login_page() {
	  
	}

	@Given("user is on Login page with {int} button on top")
	public void user_is_on_login_page_with_button_on_top(Integer int1) {
	    
	}

	@When("user enter empty username")
	public void user_enter_empty_username() {
	   
	}

	@When("user enter valid password")
	public void user_enter_valid_password() {
	    
	}

	@Then("Message display -Enter username")
	public void message_display_enter_username() {
	  
	}

	@Given("user is on login page2")
	public void user_is_on_login_page2() {
	    
	}

	@When("user enter valid username")
	public void user_enter_valid_username() {
	  
	}

	@When("user enter empty password")
	public void user_enter_empty_password() {
	    
	}

	@Then("Message display -Enter password")
	public void message_display_enter_password() {
	    
	}

	@Given("user is on login page3")
	public void user_is_on_login_page3() {
	   
	}

	@Then("Message dispaly -Enter username and password")
	public void message_dispaly_enter_username_and_password() {
	    
	}

	@Given("user is on login page4")
	public void user_is_on_login_page4() {
	   
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	   
	}

	@Then("user click on Login Button")
	public void user_click_on_login_button() {
	  
	}

	@Then("user is at HomePage")
	public void user_is_at_home_page() {
	  
	}	
}
