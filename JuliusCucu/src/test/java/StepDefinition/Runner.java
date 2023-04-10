/**
 * 
 */
package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * single forward class will work on all computer
 * Runner need Junit to work
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/features/login.feature",glue={"StepDefinition"},
monochrome = true,
plugin= {"pretty","html:target/HtmlReports", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json"}



     )
		
public class Runner {

}
