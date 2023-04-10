package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// leeson 7 Step by ste       
public class HomePage_PF {
	WebDriver driver;
	
	@FindBy(id="logout")
    WebElement btn_Logout;
	
	public HomePage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void checkLogoutisDisplay()
	{
		
		btn_Logout.isDisplayed();
	}
	
	
	

}
