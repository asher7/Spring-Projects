package Selenium1stDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("5799@gmail.com");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String s="return document.getElememntById(\"email_create\").value";
		
		String s1=(String) js.executeScript(s);
		
		System.out.println(s1);
	}

}
