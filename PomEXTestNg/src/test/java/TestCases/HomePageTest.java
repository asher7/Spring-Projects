package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.TestBase;
import locaters.ExcelReader;

public class HomePageTest extends TestBase {
	 
//	@Test
//	public void searchBox() {
//	    String testCaseName = "Search Box Test"; // Provi de a meaningful test case name
//	    extentTest = extentReports.createTest(testCaseName); // Create a test with the specified name
//	    try {
//	        homePage.setSearchTextBox("T-shirts");
//	        homePage.getSearchButton().click();
//	        extentTest.log(Status.PASS, "Test has passed.");        
//	    } catch (Exception e) {
//	        extentTest.log(Status.FAIL, "Test has failed due to the following reason: " + e.getMessage());
//	    }
//	}
	
	@Test
	public void register() throws Exception {
	    String testCaseName = "Register"; // Provide a meaningful test case name
	    extentTest = extentReports.createTest(testCaseName);
	    homePage.getSignUp().click();
	    String[][] allData = excelReader.getDataFromExcelSheet();
	    
	    // Iterate through the two-dimensional array and print its contents
	    for (int i = 0; i < allData.length; i++) {
	        for (int j = 0; j < allData[i].length; j++) {
	            System.out.print(allData[i][j] + "\t"); // Print a tab-separated value
	        }
	        System.out.println(); // Move to the next line after each row
	    }
	     
	    String username = excelReader.getCellData(1, 0); 
	    System.out.println(username);
	    
	    // Rest of your test code...
	}


//	@Test
//	public void shadowDomExample()
//	{
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("document.querySelector(\"downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#centeredContent\").querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\").value='jdk'");
//	}
}
