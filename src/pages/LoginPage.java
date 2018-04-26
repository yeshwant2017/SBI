package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	/*WebElement userNameTextbox = driver.findElement(By.id("username"));
	WebElement passwordTextbox = driver.findElement(By.id("label2"));
	WebElement loginButton = driver.findElement(By.id("button2"));
	WebElement continueToLogin = driver.findElement(By.xpath("//a[Text()='CONTINUE TO LOGIN']"));*/
	
	@FindBy(xpath="//span[@class='newTxt']")
	WebElement login1;
	@FindBy(xpath="//a[@class='login_button']")
	WebElement continueLogin;
	@FindBy(xpath="//li[class='active_menu']")
	WebElement home;
	@FindBy(id="username")
	WebElement userNameTextbox;
	@FindBy(id="label2")
	WebElement passwordTextbox;
	@FindBy(id="Button2")
	WebElement loginButton;
	
	public void login (){
		try
		{
			login1.click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void continueToLogin()
	{
		try
		{
		 continueLogin.click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void LoginProcess(String username,String password){

		userNameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		loginButton.click();
		
	}
}
