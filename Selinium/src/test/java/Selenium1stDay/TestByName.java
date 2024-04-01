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

public class TestByName {

	public static void main(String[] args) {
		
		
		WebDriver driver ;
		
//		System.setProperty("webdriver.chrome.driver","D:\\Spring\\Selinium\\drivers\\chromedriver.exe");
		
		driver=new EdgeDriver();
			driver.get("http://www.automationpractice.pl/index.php");	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.className("login")).click();
			driver.findElement(By.id("email_create")).sendKeys("5799@gmail.com");
			driver.findElement(By.id("SubmitCreate")).click();
			driver.findElement(By.id("id_gender1")).click();
			driver.findElement(By.id("customer_firstname")).sendKeys("rj");
			driver.findElement(By.id("customer_lastname")).sendKeys("raj");
			driver.findElement(By.id("passwd")).sendKeys("123456");
			driver.findElement(By.id("days")).sendKeys("11");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement dropdownElement = driver.findElement(By.id("months"));
			Select s= new Select(dropdownElement);
		//	s.selectByIndex(5);
			s.selectByVisibleText("May ");
			
			driver.findElement(By.id("years")).sendKeys("2022");
			
			driver.findElement(By.id("uniform-newsletter")).click();
			
	}			
	
}
