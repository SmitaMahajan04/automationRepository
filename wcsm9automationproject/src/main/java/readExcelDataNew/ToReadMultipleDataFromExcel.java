package readExcelDataNew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++)
		{
		//To provide the file path
				FileInputStream fis = new FileInputStream("./src/main/resource/TestData.xlsx");

				//Make the file Ready To read
				Workbook wb = WorkbookFactory.create(fis);

				Thread.sleep(2000);
				//Read Methods
				Sheet sheet = wb.getSheet("IPL");

				Row row = sheet.getRow(i);

				Cell cell = row.getCell(0);
				String data = cell.getStringCellValue();
				System.out.println(data);
		}
	}

}
