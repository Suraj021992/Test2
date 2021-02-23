package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import appscreen.HomePage_eclipse_download;
import appscreen.eclipse_releases;
import appscreen.package_page;

import utility.Launch_browser;
import utility.ReadProperties;

public class Test1 {
	
	Launch_browser br=null;
	HomePage_eclipse_download hp=null;
	package_page pkg=null;
	eclipse_releases release=null;
	
	@BeforeClass
	public void launchBrowser()
	{
		
		Launch_browser.openBrowser();
		Launch_browser.maximizeWindow();
	}
	@Test
	  public void f() 
	  {
		 hp=PageFactory.initElements(Launch_browser.instanceDriver(),HomePage_eclipse_download.class);
		 hp.click_download_package();
		
		 pkg=PageFactory.initElements(Launch_browser.instanceDriver(),package_page.class);
		 pkg.click_packages();
		 
		 release=PageFactory.initElements(Launch_browser.instanceDriver(),eclipse_releases.class);
		 release.verify_releases();
		  
	  }
	  
	  
	  @ AfterClass
	  public void afterClass()
	  {
		  //Launch_browser.closeDriver();
	  }
}
