package appscreen;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class eclipse_releases 
{
	
	public WebDriver dr_releases=null;
	public eclipse_releases(WebDriver dr)
	{ dr_releases=dr;	}
	
	@FindAll(@FindBy(how = How.XPATH, using ="//div[@class='region region-content solstice-region-element-count-1']//div[@class='block-content']/ul/li/a"))
	List<WebElement>  releases; //work same as findelements() method 
  
	public void verify_releases()
	{
		//System.out.println(releases.size());
	
		for (WebElement releas : releases) 
		{
		  	System.out.println(releas.getText());
		}
		
		
	}
}
