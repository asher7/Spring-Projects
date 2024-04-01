package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUrls {
	
	 // Use static variables for locators
  static final By loginLocator = By.className("login");
  static final  By emailCreateLocator = By.id("email_create");
  static final  By submitCreateLocator = By.id("SubmitCreate");
  static final  By genderLocator = By.id("id_gender1");
  static final  By firstNameLocator = By.id("customer_firstname");
  static final  By lastNameLocator = By.id("customer_lastname");
  static final  By passwordLocator = By.id("passwd");
  static final  By daysLocator = By.id("days");
	

    private static WebDriver driver;

    private WebDriverUrls() {
        
    }

    public static WebDriver getDriver() {
        if (driver == null) {
          
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;
    }
	
	public static void  url()
	{
		
		driver.get("http://www.automationpractice.pl/index.php");	
		driver.manage().window().maximize();
	}
	public static void sendKeys(By locator,String data)
	{
		 driver.findElement(locator).sendKeys(data);
		
	}
	public static void windowClose()
	{
		driver.close();
	}
	

}
