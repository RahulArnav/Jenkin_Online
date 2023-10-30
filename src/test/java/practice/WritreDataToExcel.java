package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritreDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
				// Step 1: Open the doc in java readable format
				FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\OnlineAdvSel.xlsx");

				// Step2: Create Workbook

				Workbook wb = WorkbookFactory.create(fis);
				// Step3: Navigate to required sheet

			Sheet sh = wb.getSheet("Contacts");
				// Step4: Navigate to required row
				Row rw = sh.createRow(7);

				// Step5: Navigate to required cell
				Cell cl = rw.createCell(7);

				// Step6: Capture the value and print
				cl.setCellValue("rahul");
				fis.close();
				//System.out.println(value);
				//save the value
				FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\OnlineAdvSel.xlsx");
				wb.write(fos);
				fos.close();;
			}
		}

