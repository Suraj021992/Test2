package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeMethod
	public void Before()
	{
		System.out.println("Befor Method");
	}
  @Test
  public void f() 
  {
	  System.out.println("In a Test 2 class");
  }
  
  @AfterMethod
  public void after()
  {
	  System.out.println("After Method");
  }
}
