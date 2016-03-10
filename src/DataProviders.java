import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviders {
	
	

	@DataProvider(name = "dp1")
	public static Object[][] getData(Method m)
	{
		Object[][] data = null;
		
		if(m.getName().equals("testData"))
		{
		
		data = new Object[2][2];
		
		data[0][0] = "raman";
		data[0][1] = "nsbdc";
		
		data[1][0] = "rahul";
		data[1][1] = "djjv";
		}
		else if(m.getName().equals("testUserReg"))
		{
			data = new Object[2][3];
			
			data[0][0] = "raman";
			data[0][1] = "nsbdc";
			data[0][2] = "jhdgd";
			
			data[1][0] = "rahul";
			data[1][1] = "djjv";
			data[1][2] = "hqw";
		}
		
		return data;
	}
	
	//SecondData Provider commented to explain overloaded Method m that accepts method name
	//and assigns data 
	
	/*@DataProvider(name = "dp2")
	public static Object[][] getRegData()
	{
		Object[][] data = new Object[2][3];
		
		data[0][0] = "raman";
		data[0][1] = "nsbdc";
		data[0][2] = "jhdgd";
		
		data[1][0] = "rahul";
		data[1][1] = "djjv";
		data[1][2] = "hqw";
		
		return data;
	}*/
	
}
