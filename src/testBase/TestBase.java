package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import utils.Browsers;
import utils.Property;


public class TestBase {


	public static WebDriver driver;
	@BeforeSuite
	public static void init()
	{
		driver = launchBrowser(Property.getValue("browser"));	
		navigate();
		driverSettings();
	}

	public static WebDriver launchBrowser(String browserName)
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
	
	public static void navigate()
	{
		try
		{
			driver.get(Property.getValue("URL"));
		}catch(Exception e)
		{
			System.out.println("Error while navigating to :" +  Property.getValue("URL"));
		}
	}
	public static void driverSettings()
	{
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit
				.SECONDS);
		driver.manage().window().maximize();
	}
	/*@AfterSuite
	public static void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}*/
}
