package Selenium1stDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.navigate().to("https://www.feuji.com/");
		
		Actions actions=new Actions(driver);
		WebElement services= driver.findElement(By.xpath("(//span[@class='M3I7Z2 wixui-button__label'])[2]"));
		actions.moveToElement(services).build().perform();
		
		Thread.sleep(2000);
		
		if(services.isDisplayed() && services.isEnabled())
		{
			driver.findElement(By.xpath("(//span[@ data-testid='stylablebutton-label'])[2]")).click();
		}else {
			System.err.println("element not found");
		}
	}
}
