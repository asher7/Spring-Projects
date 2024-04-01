package Selenium1stDay;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TableData {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://www.javatpoint.com/sql-table");
		driver.manage().window().maximize();
		
//		by x-path we taking all table data
//	List<WebElement> elements=	driver.findElements(By.xpath("//*[@id=\"city\"]/table/tbody/tr/td/table/tbody/tr/td"));
//	
//	for(WebElement e:elements)
//	{
//		System.out.println(e.getText());
//	}
//	
	
		// By css selector for direct child we use > symbol 
		//for child or sub-child we use space( ) 
		// if i need to tagname which same then we go for first-of-type , last-of-type and nth-of-type(value)
	String string=	driver.findElement(By.cssSelector("table[class='alt'] tr:nth-of-type(3)>td:first-child")).getText();
	
	System.out.println(string);
	}

}
