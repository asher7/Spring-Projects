package TestNG_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helpers {

	WebDriver driver;
	
	public static void clickEvent(WebElement element)
	{
		element.click();
	}
	
	public static void sendKeys(WebElement element,String data)
	{
		element.sendKeys(data);
	}

}
