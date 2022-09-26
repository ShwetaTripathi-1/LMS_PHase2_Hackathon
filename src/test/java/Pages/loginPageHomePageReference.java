package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.BaseClass;
import java.util.List;
public class loginPageHomePageReference extends BaseClass{
	
	WebDriver ldriver;
	
	public loginPageHomePageReference (WebDriver rdriver)
	{
	ldriver = rdriver;
	 PageFactory.initElements( rdriver,this);
	 }
	
	
	@FindBy(xpath="//div[normalize-space()='Manage Program']")
	@CacheLookup
	WebElement lblHomePage;
	

	
	
	
	public boolean HomePageLabelVisibility() {
		String sssPageSource = driver.getPageSource();
		String strbaseurl = driver.getCurrentUrl();
    	return lblHomePage.isDisplayed();
}
}

