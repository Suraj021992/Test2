package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.Launch_browser;
import utility.ReadProperties;

public class Test1 {
	@BeforeClass
	public void launchBrowser()
	{
		Launch_browser.browser();
		Launch_browser.maximizeWindow();
	}
	@Test
	  public void f() 
	  {
		  System.out.println(ReadProperties.chrome_browser_path);
		  System.out.println("In a Test 1");
	  }
	  @Test
	  public void test2()
	  {
		  System.out.println("In a test 2");
	  }
	  
	  @ AfterClass
	  public void afterClass()
	  {
		  Launch_browser.closeDriver();
	  }
}
