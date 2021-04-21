package selenium.automation;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws InvalidFormatException, IOException {

		// Which excel file
		XSSFWorkbook wb = new XSSFWorkbook(new File("./src/test/resources/TestData.xlsx"));

		// which sheet
		XSSFSheet sh = wb.getSheet("Sheet1");

		// Which row and column
		String val = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(val);

		int rows = sh.getLastRowNum() + 1;
		int colms = sh.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(colms);
		
		for (int row = 0; row < rows; row++) {
			for (int colm = 0; colm < colms; colm++) {
				val = sh.getRow(row).getCell(colm).getStringCellValue();
				System.out.println(val);
			}
		}

	}

}
