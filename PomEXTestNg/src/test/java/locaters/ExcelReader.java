package locaters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Pages.TestBase;

public class ExcelReader {

	private String path; // Excel file path
	private Properties properties;
	private String sheetName;
	private FileInputStream excelFile;
	private XSSFWorkbook excelWbook;
	private XSSFSheet excelWSheet;
	private XSSFCell cell;
	private XSSFRow row;

	// Constructor that accepts the Excel file path
	public ExcelReader(String excelFilePath) throws IOException {
		this.path = excelFilePath;
		this.properties = loadProperties();
		this.sheetName = properties.getProperty("sheetName");
		excelFile = new FileInputStream(path);
		excelWbook = new XSSFWorkbook(excelFile);
		excelWSheet = excelWbook.getSheet(sheetName);
	}
	// This method opens the excel file at the provided path
	private Properties loadProperties() throws IOException {
		properties = new Properties();
		FileInputStream inputStream = new FileInputStream(
		System.getProperty("user.dir") + "/src/main/resources/Config.properties");
		properties.load(inputStream);
		return properties;
	}
	// This function will read the data from the specified excel sheet and return
	// data as a string of two-dimensional array
	public String[][] getDataFromExcelSheet() throws Exception {
		try {
			int rowCount = getRowCount();
			int cellCount = getColumnCount(1);
			String[][] cellData = new String[rowCount][cellCount];
			for (int i = 1; i <= rowCount; i++) {
				for (int j = 0; j < cellCount; j++) {
					cellData[i - 1][j] = getCellData(i, j);
				}
			}
			return cellData;
		} catch (Exception e) {
			return new String[0][0];
		} finally {
			if (excelWbook != null) {
				excelWbook.close();
			}
			if (excelFile != null) {
				excelFile.close();
			}
		}
	}
	private int getRowCount() throws Exception {
		try {
			return excelWSheet.getLastRowNum();
		} catch (Exception e) {
			return 0;
		}
	}
	private int getColumnCount(int RowNum) throws Exception {
		try {
			row = excelWSheet.getRow(RowNum);
			return row.getLastCellNum();
		} catch (Exception e) {
			return 0;
		}
	}
	public String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			cell = excelWSheet.getRow(RowNum).getCell(ColNum);
			DataFormatter formatter = new DataFormatter();
			return formatter.formatCellValue(cell);
		} catch (Exception e) {
			return "";
		}
	}
}
