package testCases;

import listeners.Retry;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.SBIHomePage;
import testBase.TestBase;
import utils.Property;
//@Listeners(listeners.MyListener.class)

/*
 * <suite name="Suite" parallel="tests" thread-count="2">
<listeners>
<listener class-name="listeners.MyListener"></listener>
</listeners>
 * 
 */

public class TC001_ValidLogin extends TestBase {
	@Test(retryAnalyzer=Retry.class)
	public void ValidLogin()throws Exception{	
	SBIHomePage homePage = PageFactory.initElements(driver, SBIHomePage.class);
	homePage.login();
	homePage.continueToLogin();
	homePage.loginProcess(Property.getValue("username"), Property.getValue("password"));
	
	
	}
}
