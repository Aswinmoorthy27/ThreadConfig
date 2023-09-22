package Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import BasePackage.Base;

public class Exceldata extends Base {

	public static String[][] excelmethod(String excelfilename, String sheetName) throws IOException {

		// path setup
		XSSFWorkbook Xcel = new XSSFWorkbook("./Excel/" + excelfilename + ".xlsx");
		// read sheetname

		XSSFSheet sheet = Xcel.getSheet(sheetName);

		// int of sheetname(getlastrownum)
		int row = sheet.getLastRowNum();

		// int of colname(Lastcell)
		int col = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[row][col];
		// loop for all data
		for (int i = 1; i <= row; i++) {
			XSSFRow Row = sheet.getRow(i);
			for (int j = 0; j < col; j++) {
				String total = Row.getCell(j).getStringCellValue();
				// System.out.println("Printing Excel data " + total);
				data[i - 1][j] = total;
			}
			Xcel.close();

		}
		return data;

	}

}
