package Pages;

import org.openqa.selenium.WebDriver;

public class Guru99Bank extends MasterPage{

	public Guru99Bank(WebDriver driver) {
		super(driver);
		
	}

	public void gotoPage() {
		getURL(getConfig.get("URL2"));
		
	}
	public void login(String User, String Pass) {
		String userName="Xpath://input[@name='uid']";
		String password="Xpath://input[@name='password']";
		String login="Xpath://input[@name='btnLogin']";
		
		typeOnElement(userName,getConfig.get(User));
		typeOnElement(password,getConfig.get(Pass));
		clickElement(login);
				
	}
	public String getProfile() {
		String profileLable="Xpath://tr[3]/td";
		return getElementText(profileLable);
		
	}
}
