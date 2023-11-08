package Actionutl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BaseClass;

/*public class Babaaction {
	WebElement ale=	driver.findElement(By.xpath("//iframe[@name='trustarc_cm']"));
	
	
	public void click(WebDriver driver, WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();

	}

	 
	
	public  boolean switchToFrameByElement(WebDriver driver,WebElement ele) {
		boolean flag = false;
		try {
			//new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe")));
		

			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15)); 

			      
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe")));
			
			driver.switchTo().frame(ele);
			
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	
	
	public boolean switchToDefaultFrame(WebDriver driver) {
		boolean flag = false;
		try {
			driver.switchTo().defaultContent();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		
	}
	
	
	}

	}*/
