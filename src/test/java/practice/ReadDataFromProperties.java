package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {
	public static void main(String[] args) throws IOException {
		
	
	//Step1: open document in java readable format
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	
	//step2: Create object of properties for java.util package
	Properties p=new Properties();
	
	//Step3: Load the file input steam into properties
	p.load(fis);
	
	//Step4 :Provide the key and read the value 
	String value=p.getProperty("browser");
	System.out.println(value);
}
}