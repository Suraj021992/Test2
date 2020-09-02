package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser 
{
	public static WebDriver dr=null;
	
	public static void openBrowser()
	{
		
		if(dr==null)
		{	
			System.setProperty("webdriver.chrome.driver",ReadProperties.chrome_browser_path);
		    dr=new ChromeDriver();		  
		    dr.get(ReadProperties.url);
		}
	}

	public static WebDriver instanceDriver()
	{
		return dr;
	}
	
	public static void maximizeWindow()
	{
		if(dr!=null)
		   dr.manage().window().maximize();
	}
	
	public static void closeDriver()
	{
		if(dr!=null)
		{
			dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			dr.close();
			dr=null;
		}
		
	}
	
	public static void quitDriver()
	{
		if(dr!=null)
		{
			dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			dr.quit();
			dr=null;
		}
		
	}
	
}
