package Selenium1stDay;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class TestByXpath {

	public static void main(String[] args) {
		
		
		WebDriver driver ;
		
//		System.setProperty("webdriver.chrome.driver","D:\\Spring\\Selinium\\drivers\\chromedriver.exe");
		
		driver=new EdgeDriver();
			driver.get("https://rpachallenge.com/");	
			driver.manage().window().maximize();
			
			//normal xpath
			driver.findElement(By.xpath("//input[@ng-reflect-name='labelFirstName']")).sendKeys("Rajgopal");
			
			//contains
			driver.findElement(By.xpath("(//input[contains(@ng-reflect-name,labelEmail)])[2]")).sendKeys("raj@123");
			//here[2] is i found more than 1 fields so i taken 2nd field
			
			//starts-with
			driver.findElement(By.xpath("//input[starts-with(@ng-reflect-name,'labelCompany')]")).sendKeys("rj");
			
			//text()
			
//			driver.findElement(By.xpath("//a[text(),'submit']")).click();
			
			driver.close();//only closes the current window
			
			//driver.quit();//closes all sub windows
			
			
			
	}			
	
}
