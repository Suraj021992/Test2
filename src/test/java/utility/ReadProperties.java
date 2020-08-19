package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties 
{
	public static Properties prop=null;
    public static String data="";
    
	public static String readData(String key)
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
		return prop.getProperty("browser_path","Not Executed");
	}

}
