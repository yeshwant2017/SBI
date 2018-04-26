package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
static WebDriver driver;
	public static WebDriver get(String browserName)
	{
		try
		{
			if(browserName.equalsIgnoreCase("firefox")||browserName.equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (browserName.equalsIgnoreCase("chrome")||browserName.equalsIgnoreCase("google"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase("ie")||browserName.equalsIgnoreCase("internet"))
			{
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else
			{
				System.out.println("No browser exists by this name");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;
	}
}
