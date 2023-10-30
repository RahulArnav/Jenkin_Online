package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
@Test(dataProvider="getData")
	public void addProductToCart(String Name,int price,int qty)
	{
		System.out.println(Name+price+qty);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][3];
		data[0][0]="Samsung";
		data[0][1]=10000;
		data[0][2]=10;
		
		data[1][0]="Nokia";
		data[1][1]=15000;
		data[1][2]=15;
		
		return data;
		
	}
}
