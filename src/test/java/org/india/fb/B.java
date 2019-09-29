package org.india.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B {
	public static void main(String[] args) throws IOException {

		File loc = new File("C:\\Users\\JAGAN\\eclipse-workspace\\FbLogin\\Excel\\FBData.xlsx");

		FileInputStream Stream = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(Stream);

		Sheet s = w.getSheet("FBSheet");

		Row r = s.getRow(4);
		Cell c = r.getCell(0);
		System.out.println(c);

	}

}
