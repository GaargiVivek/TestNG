import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNGParameterizationExcel {
	
	public static ExcelReader xls = null;
	
	@Test(dataProvider = "getData")
	public void testData(Hashtable<String,String> data)
	{
		System.out.println(data.get("userName")+"----"+data.get("password")+"----"+data.get("isCorrect")+"----"+data.get("age")+"----"+data.get("gender"));
		//System.out.println(userName+" - "+password+" - "+isCorrect);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		if(xls == null)
		{
			xls = new ExcelReader("E:\\Login.xlsx");
		}
		
		
		String sheetName = "LoginTest";
		
		int rows = xls.getRowCount(sheetName);
		int cols = xls.getColumnCount(sheetName);
		
		//System.out.println(rows);
		//System.out.println(cols);
		
		Object[][] data = new Object[rows-1][1];
		
		Hashtable<String,String> table = null;
		
		for(int rowNum = 2;rowNum<=rows;rowNum++)
		{
			table = new Hashtable<String, String>();
			for(int colNum=0;colNum<cols;colNum++)
			{
				//To get the data from excel using hashtable. 
				//This is done so that data can be retrieved for a large file like 1000 columns
				table.put(xls.getCellData(sheetName, colNum, 1), xls.getCellData(sheetName, colNum, rowNum));
				data[rowNum-2][0] = table;
				//data[rowNum-2][colNum] = xls.getCellData(sheetName,colNum,rowNum);
				
				//System.out.println(data[i][j]);
			}
		}
		
		//System.out.println(xls.getCellData(sheetName, colNum, rowNum));
		return data;
	}

}
