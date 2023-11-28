package readExcelDataNew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub



		//provide the path of excel file
				FileInputStream fis = new FileInputStream("./src/main/resource/TestData.xlsx");

				//make the file ready to read
				Workbook wb = WorkbookFactory.create(fis);

				Sheet sheet = wb.getSheet("IPL");//to get perticular sheet
				int rc = sheet.getLastRowNum();//to get the number of rows
				//System.out.println(rc);

				for(int i=1;i<=rc;i++)
				{
					//provide the path of excel file
				//	FileInputStream fis1 = new FileInputStream("./src/main/resource/TestData.xlsx");

					//make the file ready to read
					//Workbook wb1 = WorkbookFactory.create(fis1);

					//Read Methods
					//Sheet sheet1 = wb1.getSheet("IPL");//to get perticular sheet
					Row row = sheet.getRow(i);//to get into perticular row
					Cell cell = row.getCell(0);//to get into perticular column
					String data = cell.getStringCellValue();//to read the specific data from the cell
					System.out.println(data);



				}

	}

}
