///**Selenium Cucumber Java BDD Framework 4 - By Automation step by step 4 and 5
// * 
// */
//package StepDefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
///**
// * @author User
// *
// */
//public class ParameterizeSteps {
//WebDriver driver=null;
//
//	@Given("browser is on open")
//
//public void browser_is_on_open() {
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//
//		driver=new ChromeDriver(option);
//
//		String projectpath=System.getProperty("user.dir");
//
//		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
//		System.out.println("Projectpath is:" + projectpath);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//
//
//	  }
//
//
//   @And("user is on login page")
//	public void user_is_on_login_page() {
//
//	driver.navigate().to("https://example.testproject.io/web");
//		
//	System.out.println("inside step- system");
//
//	}
//	@When("^user enters (.*)and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//
//	}
//
//
//	@When("user clicks on login")
//	public void user_clicks_on_login() {
//		driver.findElement(By.id("login")).click();
//
//
//	}
//
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//
//    driver.findElement(By.id("logout")).isDisplayed();
//
//	}
//
//
//}
//
//
