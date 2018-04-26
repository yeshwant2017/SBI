package utils;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonDrivers {

	public static void switchToNewWindow(WebDriver driver, String parentWindow) throws InterruptedException
	{
		Thread.sleep(3000);// We should explicit wait in this, wait for window to become 2
		Set<String> windows = driver.getWindowHandles(); //parent - DatePicker, Facebook - DatePicker
		for(String window : windows)
		{
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
			}
	}
}
	public static void selectElement(WebElement element, String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
}