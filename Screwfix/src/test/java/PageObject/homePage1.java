package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class homePage1 extends basePage{
	

	
	public homePage1(WebDriver driver)
	{
	  super(driver);	
		
	}
	
	 @FindBy(xpath="//span[@id='account-navigation-label']")
	 WebElement Youraccount;
			 
			 
	 @FindBy (xpath ="//button[@title='Continue']")
	  WebElement Clickregisterbtn;
	
	
	 @FindBy(xpath="//a[text()='Accept Cookies']")
	 WebElement accptcookies;	
	 
	 @FindBy(xpath="//iframe[@name='trustarc_cm']")
	 WebElement eleiframe;
	 	
	
	

	 

		
	 public void Clickyouraccount()
	  {
		  Youraccount.click(); 
	  }
  
    
		
     public void switchToFrameByElement() {
      
       

		try {
			

			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15)); 

			      
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(eleiframe));
			wait.until(ExpectedConditions.elementToBeClickable(accptcookies)).click();
			
			
		} catch (Exception e) {

			
		}
	}
    
    
    public void DefaultContentiframe()
    {
    	
    	driver.switchTo().defaultContent();
    }
   
   
    
    
  public void ClickRegister()
  {
	Clickregisterbtn.click();
	
  }
 
  
  
}