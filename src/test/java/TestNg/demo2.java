package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
	@AfterSuite
	public void As()
	{
		System.out.println("i ll execute before Suite");
	}
	@Test(groups= {"smoke"})
	
	public void siri()
	{
		System.out.println("siri");
	}
	
@Test
	
	public void sirisha()
	{
		System.out.println("sirisha");
		 
	}

@BeforeTest
public void bf()
{
	System.out.println("i ll execute before test");
}
@BeforeSuite
public void bs()
{
	System.out.println("i ll execute before Suite");
}

}
