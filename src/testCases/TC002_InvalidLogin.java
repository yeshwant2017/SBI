package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.SBIHomePage;
import utils.Property;
@Listeners(listeners.MyListener.class)

public class TC002_InvalidLogin extends listeners.MyListener{
	@Test
	public void ValidLogin()throws Exception{	
	SBIHomePage homePage = PageFactory.initElements(driver, SBIHomePage.class);
	homePage.login();
	homePage.continueToLogin();
	homePage.loginProcess(Property.getValue("invalidusername"), Property.getValue("invalidpassword"));
	
	}
}
