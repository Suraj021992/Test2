package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ReadProperties;

public class Test1 {
	
	WebDriver dr=null;
  @Test
  public void f() 
  {
	 //dr=new ChromeDriver();
	  //dr.get("https://www.google.com");
	  System.out.println(ReadProperties.readData("browser_path"));
	  System.out.println("In a Test 1");
  }
  @Test
  public void test2()
  {
	  System.out.println("In a test 2");
  }
}
