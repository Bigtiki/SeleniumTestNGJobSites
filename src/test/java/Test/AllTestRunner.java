package Test;

import org.testng.annotations.Test;



public class AllTestRunner extends TestBase {
	
	
	@Test
	public void sunTrustHome() {
		getHomePage().goToPage();
		getHomePage().getList();
	}
	@Test
	public void llBeansInc() {
		getLLHomePage().goToPage();
		getLLHomePage().getList();
	}
	@Test
	public void Home() {
		getTestPage().getPage();
	}

	
}
