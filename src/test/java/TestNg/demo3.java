package TestNg;

import org.testng.annotations.Test;

public class demo3 {
	@Test
	
	public void webloginHomeloan()
	{
		System.out.println("webloginHomeloan");
	}
@Test
	
	public void mobileloginHomeloan()
	{
		System.out.println("mobileloginHomeloan");
	}
@Test

public void APIloginHomeloan()
{
	System.out.println("APIloginHomeloan");
}
@Test

public void sirisignin()
{
	System.out.println("sirisignin");
}
@Test(groups= {"smoke"})

public void sirilogin()
{
	System.out.println("sirilogin");
}
}
