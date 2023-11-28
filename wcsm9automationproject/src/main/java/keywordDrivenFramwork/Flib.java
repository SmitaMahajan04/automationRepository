package keywordDrivenFramwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// It is use to store generic reusable methods and all the generic reusable methods are non static

	public String readDataFromExcel(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);

		//String data=cell.getStringCellValue();

		String data=null;
		cell.getCellType();
		if(cell.getCellType()==CellType.STRING)
		{
			data=cell.getStringCellValue();
		} else {
			cell.getCellType();
			if(cell.getCellType()==CellType.NUMERIC)
			{
				cell.getStringCellValue();
				data=String.valueOf(cell.getNumericCellValue());


			}
		}

		return data;

	}


	public void writeDataToExcel(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		cell.setCellValue(data);

		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);


	}

	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();

		return rc;

	}

public String readDataFromProperty(String propPath,String key) throws IOException

{
	FileInputStream fis = new FileInputStream(propPath);
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty(key);
	return data;



}
}
