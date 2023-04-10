package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// Lecture 6 Step by step by Raghav
public class loginPage {
	
    WebDriver driver;
	
	By txt_username= By.id("name");
	
	By txt_password= By.id("password");
	
	By btn_login= By.id("login");
	
	By btn_Logout= By.id("logout");
	
	

	public loginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	public void enterUsername(String username)
	{
		
	   driver.findElement(txt_username).sendKeys(username);
	}
			
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin()
	{
	    
		driver.findElement(btn_login).click();	
	}
	

	public void checkLogOutisDisplay() {
		driver.findElement(btn_Logout).isDisplayed();
		
	}
	
	public void loginValidUser(String username, String password) {
		
		 driver.findElement(txt_username).sendKeys(username);
		 driver.findElement(txt_password).sendKeys(password);
		 driver.findElement(btn_login).click();	
	}
	
	
	
}
