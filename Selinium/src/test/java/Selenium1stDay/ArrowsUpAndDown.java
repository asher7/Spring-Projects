package Selenium1stDay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrowsUpAndDown {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver=new EdgeDriver();
		
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement search= driver.findElement(By.xpath("//input[@name='q']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(search).click().sendKeys("mobiles under").build().perform();
		
		Thread.sleep(2000);
		
	search.sendKeys(Keys.ARROW_DOWN);
	search.sendKeys(Keys.ARROW_DOWN);
	
	search.sendKeys(Keys.ENTER);
	
		actions.keyDown(Keys.ENTER).build().perform();
		
		
		
	}

}
