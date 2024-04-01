package Selenium1stDay;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		
	//	TakesScreenshot screenshot=(TakesScreenshot)driver;
		EdgeDriver edgeDriver=new EdgeDriver();
		
		edgeDriver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		File file=edgeDriver.getScreenshotAs(OutputType.FILE);
//		File file2=new File("./Pictures/img.jpg");
//		FileUtils.copyFile(file, file2);
//		
//		byte[] bytearr=edgeDriver.getScreenshotAs(OutputType.BYTES);
//		File file2=new File("./Pictures/img1.jpg");
//		FileOutputStream fileOutputStream =new FileOutputStream(file2);
//		fileOutputStream.write(bytearr);
		
	String base=edgeDriver.getScreenshotAs(OutputType.BASE64);
	File file2=new File("./Pictures/img1.jpg");
	byte[] byteArr=Base64.getDecoder().decode(base);
	FileOutputStream fileOutputStream=new FileOutputStream(file2);
	fileOutputStream.write(byteArr);
	}
}
