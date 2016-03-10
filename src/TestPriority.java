import org.junit.Assert;
import org.testng.annotations.Test;


public class TestPriority {
	
	// Learning Priorities and Dependencies
	@Test(priority = 1)
	public void testLogin()
	{
		System.out.println("User Login");
		Assert.fail();
		
	}
	
	@Test(priority = 2,dependsOnMethods = {"testLogin"})
	public void testUserReg()
	{
		System.out.println("User Registration");
	}
	
	@Test(priority = 3,dependsOnMethods = {"testLogin"},alwaysRun=true)
	public void test3()
	{
		System.out.println("Executing test 3");
	}
	
	@Test(priority = 4,dependsOnMethods = {"testLogin"},alwaysRun=true)
	public void test4()
	{
		System.out.println("Executing test 4");
	}

}
