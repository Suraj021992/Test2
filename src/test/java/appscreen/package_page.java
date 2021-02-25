package appscreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class package_page 
{
	//automate for package_page
	
	public WebDriver dr_package_page=null;
	
	@FindBy(xpath = "//div[@class='col-xs-24 padding-left-30']//li[4]/a")
	WebElement packages_menu;
	
	public package_page(WebDriver dr)
	{dr_package_page=dr;}
	
	public void click_packages()
	{
		packages_menu.click();
		
	}

}
