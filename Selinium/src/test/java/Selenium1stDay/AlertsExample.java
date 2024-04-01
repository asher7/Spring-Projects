package Selenium1stDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsExample {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("div.elementor-widget-container button[name='alertbox']")).click();
		
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("div.elementor-widget-container button[name='confirmalertbox']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("div.elementor-widget-container button[name='promptalertbox1234']")).click();
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();
		
	}

}
