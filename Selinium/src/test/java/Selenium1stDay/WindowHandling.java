package Selenium1stDay;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver=new EdgeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> addresses=driver.getWindowHandles();
		for(String address: addresses)
		{
			if(!address.equals(parent))
			{
				driver.switchTo().window(address);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("karthik waste fellow");
				Thread.sleep(2000);
				driver.close();
			}
			
			Thread.sleep(2000);
		}
		driver.switchTo().window(parent);
		driver.findElement(By.id("newTabBtn")).click();
		driver.quit();
	}

}
