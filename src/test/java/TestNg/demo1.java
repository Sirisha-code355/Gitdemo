package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo1 {
	@AfterTest
	public void Af()
	{
		System.out.println("i ll execute After test");
	}
@Test(dependsOnMethods="setdata")
	
	public void getdata1()
	{
		System.out.println("Bye");
	}
	@Test
	
	public void setdata()
	{
		System.out.println("Hi");
	}
	


}
