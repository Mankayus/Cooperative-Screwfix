import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


/*SEE YOU TUBE P16 - What is a Dataprovider and how to use it in TestNG | TestNG | Testing Framework |

H Y R Tutorials
51.4K subscribers*/



public class Screwfix {
	@Test(dataProvider="LoginTestData1", dataProviderClass=ExcelDataSupplier.class)
	public void ScrewTest(String username,String password) throws InterruptedException
	{
		
		WebDriver driver =WebDriverManager.chromedriver().create();
		driver.get("https://www.screwfix.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15)); 

	      
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//iframe[@name='trustarc_cm']"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Accept Cookies']")))).click();
	
		//driver.switchTo().frame("//iframe[@name='trustarc_cm']");
		//driver.findElement(By.xpath("//a[text()='Accept Cookies']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='account-navigation-label']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email-existing']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='sign-in-btn']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Continue Shopping')]")).isDisplayed());
		
		driver.findElement(By.xpath("//span[contains(text(),'Your Account')]")).click();
		driver.findElement(By.xpath("//a[@id='header_link_sign_out']")).click();
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	/* Dataprovider is a container that provides data to the test method
	// if dataprovider name is not provided below(LOginTestData1) and you provide the method name(LoginData) below as your data provider name above(Public void ScrewfitTest)it will work.
	@DataProvider(name="LoginTestData1")
	public Object[][]LoginData()
	{
		
	  Object[][] data =new Object [4][2];
	  data[0][0]="olakayjulius@yahoo.com";
	  data[0][1]="Wayoman$";
	  
	  data[1][0]="Kay@yahoo.com";
	  data[1][1]="Wayocity";
	  
	  data[2][0]="olajuli@yahoo.com";
	  data[2][1]="Wayomanton";
	  
	  data[3][0]="juliusoladele60@gmail.com";
	  data[3][1]="Olowolayemo12!";
	  
	  
	return data;*/
	  		
		
		
	}
	  	
	
    

	
    
