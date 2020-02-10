package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testpage extends MasterPage{
	
	
	public Testpage(WebDriver driver) {
		super(driver);
	
	}
	
	public void getPage() {
		String Search= "Xpath://input[@name='q']";
		String Links="Xpath://*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite";
		String LinksSearch="Xpath://input[@name='q']";
		getURL(getConfig.get("URL4"));
		typeOnElement(Search,getConfig.get("URL3"));
		typeOnElement2(LinksSearch,Keys.ENTER);
		waitFor(2000);
		clickElement(Links);
		waitFor(2000);
		}

}
