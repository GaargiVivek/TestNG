import org.testng.annotations.Test;


public class TestGroup2 {

	@Test(groups = {"high"})
	public void validateTestResults()
	{
		System.out.println("Validating FLight results");
	}
}
