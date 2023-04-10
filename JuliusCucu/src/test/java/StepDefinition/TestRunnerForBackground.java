package StepDefinition;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * single forward class will work on all computer
 * Runner need Junit to work
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/BackgroundDemo/BackgroundDemo.feature",glue={"StepsForBackground"},
monochrome = true,
plugin= {"pretty","html:target/HtmlReports", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json"}



     )
		

public class TestRunnerForBackground {

}
