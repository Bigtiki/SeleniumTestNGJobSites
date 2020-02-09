package cucumber;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Test.TestBase;
import Utility.ReadProperties;
import Utility.SharedConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class cucumberHooks {
	TestBase page;
	WebDriver driver; 
	

	// Constructor 
	public cucumberHooks(TestBase page) {
		this.page = page;
	}


	@Before
	public void rampUp() throws FileNotFoundException, IOException {
		
		// Read The Prop & Make it Shareable for the entire Project 
		SharedConfig.config = ReadProperties.readProperties();
	
		System.out.println("Ramp Up  Started...");
		driver = page.getDriver();

	}


	@After
	public  void  rampDown(Scenario scenario) {



		if (scenario.isFailed()) {
			try {
				// Casting 	
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
				 ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + (scenario.isFailed() ?  "Failed":"Passed"));
			} catch (Exception e) {
				e.printStackTrace();
				 ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + (scenario.isFailed() ?  "Failed":"Passed"));
			}
		}
		driver.close();
		System.out.println("Driver closed");
	}
}
