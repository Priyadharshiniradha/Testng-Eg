package org.pageexecution;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Ignore;
import org.junit.Test;

public class ExcelReadWrite {
// .xls MS 97 (HSSF)
// .xlsx 2003 till date (XSSF)

	@Ignore
	@Test
	public void readExcel() throws IOException {
		File f = new File(
				System.getProperty("user.dir") + "/src/test/resources/Student details - Project class May 3.xlsx");
		FileInputStream input = new FileInputStream(f);

		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("Student details - Project class");

		int totalRows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < totalRows; i++) {
			XSSFRow row = sheet.getRow(i);
			int physicalNumberofcells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < physicalNumberofcells; j++) {
				XSSFCell cell = row.getCell(j);

				if (cell.getCellType() == CellType.NUMERIC) {
					double numericCellValue = cell.getNumericCellValue();
					System.out.println(numericCellValue + " ");
				} else {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue + " ");
				}
			}
			System.out.println(" ");
		}
		workbook.close();
	}

	@Test
	public void writeExcel() throws IOException {
		File f = new File(
				System.getProperty("user.dir") + "/src/test/resources/Student details - Project class May 3.xlsx");
		FileInputStream input = new FileInputStream(f);

		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("Student details - Project class");

		int totalRows = sheet.getPhysicalNumberOfRows();
		
		
// 		To modify the existing data		
//		XSSFRow row = sheet.getRow(0);
//		row.getCell(9).setCellValue("Karthikeyan ");

// 		To create a new data
		XSSFRow row = sheet.createRow(9);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Karthik");
		
		
		FileOutputStream out = new FileOutputStream(f);
		workbook.write(out);
		out.close();
		workbook.close();
	}

}
