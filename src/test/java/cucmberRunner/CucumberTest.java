package cucmberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/resources/AllFeatures"}, 
		//features = {"src/test/resources/AllTestFeatures/Validation_FotterLinks.feature"}, 
		glue={"cucumber","Test"},
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}, 
		monochrome=true
		)
public class CucumberTest extends AbstractTestNGCucumberTests{

}
