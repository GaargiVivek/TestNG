import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNG_Parameters {

	@Test(dataProvider="getData")
	public void testFormFill(String userName,String password,int age)
	{
		System.out.println(userName+" - "+password+" - "+age);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		
		data[0][0] = "tom_richards@gmail.com";
		data[0][1] = "Pass@123";
		data[0][2] = 20;
		
		data[1][0] = "Cory_Smith@gmail.com";
		data[1][1] = "Pass@456";
		data[1][2] = 30;
		
		return data;
	}
}
