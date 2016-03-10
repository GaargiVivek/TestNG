import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_1 {

	@Test
	public void testLogin()
	{
		System.out.println("Testing Login Screen");
	}
	
	@Test
	public void testFormFill()
	{
		System.out.println("Testing Form Fill");
	}
	
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("Opening Browser");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing Browser");
	}
	
	@BeforeTest
	public void openDBConnection()
	{
		System.out.println("Open DB Connection");
	}
	
	@AfterTest
	public void closeDBConnection()
	{
		System.out.println("Close DB Connection");
	}
	
	@BeforeSuite
	public void runSeleniumServer()
	{
		System.out.println("Starting Selenium Server");
	}
	
	@AfterSuite
	public void closeSeleniumServer()
	{
		System.out.println("Stopping Selenium Server");
	}
}
