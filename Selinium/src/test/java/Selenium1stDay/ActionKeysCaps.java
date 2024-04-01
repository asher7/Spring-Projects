package Selenium1stDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeysCaps {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		
		WebElement search= driver.findElement(By.xpath("//input[@id='search2']"));
		
		Actions actions=new Actions(driver);
		
		//pressing the shift key on keyboard and making text uppercase
		actions.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("css").build().perform();
		
		driver.findElement(By.xpath("//button[@id='learntocode_searchbtn']")).click();
		WebElement text=driver.findElement(By.xpath("//*[@id=\"main\"]/h1"));
		
actions.moveToElement(text).contextClick().build().perform();
	}

}
