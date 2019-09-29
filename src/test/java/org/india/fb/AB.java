package org.india.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AB {

	public static void main(String[] args) throws IOException {

		File loc = new File("C:\\Users\\JAGAN\\eclipse-workspace\\FbLogin\\Excel\\FBData.xlsx");

		FileInputStream Stream = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(Stream);

		Sheet s = w.getSheet("FBSheet");
		for (int i=0; i<s.getPhysicalNumberOfRows();i++) {
			
			Row r = s.getRow(i);
			for (int j=0; j<r.getPhysicalNumberOfCells(); i++) {
				
				Cell c = r.getCell(i);
				
				System.out.println(c);
			}
			
			
		}
		

	}
}
