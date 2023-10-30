package practice;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {
	public static void main(String[] args) throws Exception {

		// Step 1: Open the doc in java readable format
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\OnlineAdvSel.xlsx");

		// Step2: Create Workbook

		Workbook wb = WorkbookFactory.create(fis);
		// Step3: Navigate to required sheet

		Sheet sh = wb.getSheet("Contacts");
		// Step4: Navigate to required row
		Row rw = sh.getRow(7);

		// Step5: Navigate to required cell
		Cell cl = rw.getCell(7);

		// Step6: Capture the value and print
		String value = cl.getStringCellValue();
		fis.close();
		System.out.println(value);

	}
}
