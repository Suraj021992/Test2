package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties 
{
	public static Properties prop=null;
    public static String data="";
    
    public static String chrome_browser_path=readData("chrome_browser_path","./Drivers/chromedriver1.exe");
    public static String url=readData("url","https://www.google.com/");
    
	public static String readData(String key,String default_value)
	{
		try 
		{
			prop=new Properties();
			prop.load(new FileInputStream("./Properties/credentials.properties"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		return prop.getProperty(key,default_value);
	}

}
