package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;

import Listeners.EventListener;
import TestCases.HomePageTest;
import locaters.ExcelReader;

public class TestBase {
	public static WebDriver driver;
	protected HomePage homePage;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public  static ExtentSparkReporter sparkreporter;
	public Properties properties;
	public FileInputStream inputStream;
	public static ExcelReader excelReader;
	public static ExcelReader  excelFilePath;
	
	@BeforeClass
	public void setUp() throws Exception {
	    loadProperties();
	    driver = new EdgeDriver();
	    WebDriverListener listener = new EventListener();
	    driver = new EventFiringDecorator<>(listener).decorate(driver);
	    driver.get(properties.getProperty("URL"));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    homePage = new HomePage(driver);
	    excelReader = new ExcelReader(properties.getProperty("Testdata.excel.path"));
	    String sheetName = properties.getProperty("sheetName");
	}

	public Properties loadProperties() throws IOException {
	    properties = new Properties();
	    inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/Config.properties");
	    properties.load(inputStream);
	    return properties;
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}

	@BeforeTest
	public void beforeTest() {
		extentReports = new ExtentReports();
		sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\testReport.html");
		extentReports.attachReporter(sparkreporter);
		sparkreporter.config().enableOfflineMode(true);
	}

	@AfterTest
	public void afterTest() {
		extentReports.flush();
	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
	}
}
