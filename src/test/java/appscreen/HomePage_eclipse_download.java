package appscreen;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage_eclipse_download 
{
	//automate for eclipse download site
	
	public WebDriver dr_homepage=null;
    
	@FindBy(xpath = "//div[@class='downloads-installer']//a[@class='grey-link'][1]")
	WebElement download_package;
	
	public HomePage_eclipse_download(WebDriver dr)
	{
		dr_homepage=dr;
		
	}
	
	public void click_download_package()
	{
		//download_package.click();
		JavascriptExecutor executor = (JavascriptExecutor)dr_homepage;
		executor.executeScript("arguments[0].click();", download_package);
	}
}
