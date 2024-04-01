package Selenium1stDay;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class OpenBrowser {

	public static void main(String[] args) {
		
		
		WebDriver driver ;
		
//		System.setProperty("webdriver.chrome.driver","D:\\Spring\\Selinium\\drivers\\chromedriver.exe");
		
		driver=new EdgeDriver();
			driver.get("https://smarthome.hogarcontrols.com/");	}			

}
