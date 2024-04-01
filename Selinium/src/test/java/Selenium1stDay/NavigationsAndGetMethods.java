package Selenium1stDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationsAndGetMethods {
	public static void main(String[] args) {
		
		
		WebDriver driver;
		driver=new EdgeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		driver.findElement(By.xpath("(//a[text()='HTML'])[3]")).click();
		
		//get title
		System.out.println(driver.getTitle());
		//navigate to back <-
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//a[text()='CSS'])[3]")).click();
		//get current url
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.err.println(driver.getCurrentUrl());
		System.err.println(driver.getTitle());
		
		//navigate to forward ->
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	

}
