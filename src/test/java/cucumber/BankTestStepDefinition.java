package cucumber;

import org.testng.Assert;

import Test.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankTestStepDefinition {
	TestBase test;
	public BankTestStepDefinition(TestBase test) {
		this.test=test;
	}
	
	
	@When("User is login to profile {string} with {string}")
	public void user_is_login_to_profile_with(String user, String password) {
	    test.getGBHomePage().gotoPage();
	    test.getGBHomePage().login(user, password);
	}

	@Then("User see profile {string}")
	public void user_see_profile(String role) {
		String actualProfile =test.getGBHomePage().getProfile();
		String expectedProfile=test.getGBHomePage().getConfig.get(role);
		Assert.assertEquals(actualProfile, expectedProfile,"Failed Test");
	}

}
