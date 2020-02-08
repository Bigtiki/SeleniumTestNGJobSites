package Pages;

import org.openqa.selenium.WebDriver;

public class SunTrustHome extends MasterPage {
	String resource="//li[@class='suntrust-subMenuList noMarginRt']";

	public SunTrustHome(WebDriver driver) {
		super(driver);
	}

	public void goToPage() {
		getURL(getConfig.get("URL"));
	}
	 public void getList() {
		 for(int i=1;i<9;i++) {
			 String personalBanking="//li[@class='suntrust-subMenuList']["+i+"]";
			 
			System.out.println("\n**tab name: "+ getElementText("Xpath:"+personalBanking));
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 mouseHoverByXpath(personalBanking);
		 waitFor(2000);
		 
		 for(String L :getElementTexts2(personalBanking)) {
			 System.out.print(L +", ");
		 }
		 
		 }
		 System.out.println("\n**tab name: "+ getElementText("Xpath:"+resource));
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 mouseHoverByXpath(resource);
		 waitFor(2000);
		 
		 for(String L :getElementTexts2(resource)) {
			 System.out.print(L +",");
		 }
		 
		 
	 }
	
}
