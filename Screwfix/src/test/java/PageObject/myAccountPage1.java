package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage1 extends basePage{
	
	public myAccountPage1(WebDriver driver)
	{
		
		super(driver);
		
	}

	
	
	@FindBy(xpath="//a[contains(text(),'Continue Shopping')]")
	WebElement mySuccessfulSignin;
	
	 @FindBy(xpath="//span[contains(text(),'Your Account')]")       
	 WebElement txtyourAcct;
	  
	 @FindBy(xpath="//a[@id='header_link_sign_out']")
	 WebElement LogOutbtn;
	 
	 @FindBy(xpath="//button[@title='Continue Shopping']")
	 WebElement txtshopping;
	 
	 //@FindBy(id="decline-invite")
	 //WebElement txtNO;
	
	// @FindBy(xpath="//a[@id='header_my_account_link']//i")
	// WebElement  youraccount2;
   

   public boolean IsMySuccessfulsigninExist()
   {
	 
	   try
	   {
	   return(mySuccessfulSignin.isDisplayed());
	   }
	   catch(Exception e) {
		   
	   }
	   {
   }
	return false;
	   
   
   }  
   
   
   
   public void ClicktxtyourAcct()
   {
 	  txtyourAcct.click();  
   }

   
  /* public void ClickyourAcct()
   {
 	  youraccount2.click(); 
   }
   */
   
   public void ClickLogOutbtn()
   {
 	  LogOutbtn.click();
   }
   
   
   public void ClickShopping()
   {
	  txtshopping.click();
   }
}  
   
   
