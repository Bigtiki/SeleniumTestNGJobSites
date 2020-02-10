package Pages;

import org.openqa.selenium.WebDriver;

public class LLBeans extends MasterPage {
	
	public LLBeans(WebDriver driver) {
		super(driver);
	}

	public void goToPage() {
		getURL(getConfig.get("URLL"));
	}
	public void getList() {
		for(int i=1;i<9;i++) {
			
	//List XPATH		//Xpath,,, but the i changes to other Xpaths.
			 String headerMenus="//div[@class='Header_header-nav-widening']//nav/ul/li["+i+"]";
			 
			System.out.println("\n**tab name: "+ getElementText("Xpath:"+headerMenus));
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 mouseHoverByXpath(headerMenus);
		 waitFor(2000);
		 
		 for(String L :getElementTexts2(headerMenus)) {
			 System.out.print(L +", ");
		 }
		 
		 }
//		 System.out.println("\n**tab name: "+ getElementText("Xpath:"+resource));
//		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		 mouseHoverByXpath(resource);
//		 waitFor(2000);
//		 
//		 for(String L :getElementTexts2(resource)) {
//			 System.out.print(L +",");
//		 }
		
	}
}
//div[@class='Header_header-nav-widening']//nav/ul/li