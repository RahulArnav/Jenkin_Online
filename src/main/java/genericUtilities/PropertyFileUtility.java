package genericUtilities;
//comment
/* Multiline comment*/
/**
 * This class consists of generic methods to read data from 
 * property file
 * @author Rahulkumar
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	/**
	 * 
	 * This method will read data from property file and return the value 
	 * caller
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	
	public String readDataFromPropertyFile(String Key) throws IOException {
	
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(Key);
		return value;
	}
}
