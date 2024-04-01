package TestNG_Examples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A_FirstExample {
    
    String email = "5799@gmail.com";
    String fName = "rj";
    String lName = "raj";
    String pswd = "123456";
    
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverUrls.getDriver();
        WebDriverUrls.url();
    }

    @Test
    public void f() throws InterruptedException {
    	
//    	driver.manage().timeouts().implicitlyWait( );
       Helpers.clickEvent( driver.findElement(WebDriverUrls.loginLocator));
       WebElement element=driver.findElement(WebDriverUrls.emailCreateLocator);
       Helpers.sendKeys(element, email);
        
        Thread.sleep(3000);
        Helpers.clickEvent(driver.findElement(WebDriverUrls.submitCreateLocator));
        Thread.sleep(3000);
        driver.findElement(WebDriverUrls.genderLocator).click();
        Thread.sleep(3000);
        WebDriverUrls.sendKeys(WebDriverUrls.firstNameLocator,fName);
        Thread.sleep(3000);
        driver.findElement(WebDriverUrls.lastNameLocator).sendKeys(lName);
        Thread.sleep(3000);
        driver.findElement(WebDriverUrls.passwordLocator).sendKeys(pswd);
        Thread.sleep(3000);
        
        // If you intend to send something for 'days', provide it here:
        // driver.findElement(WebDriverUrls.daysLocator).sendKeys("11");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser window after the test
        driver.close();
    }
}
