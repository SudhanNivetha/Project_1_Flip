package ParenPackage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentClass 
{
	public static WebDriver driver;
	public static Properties prop;
	public void initialization()
{
		String browsername=prop.getProperty("browser");
	if (browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Isal/Desktop/Project_Testing/chromedriver.exe");
	    driver = new ChromeDriver();	    
	}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","Desktop/geckodriver.exe");
		driver = new FirefoxDriver();	    
	}
	System.out.println("Browser Opened successfully"); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url_path"));  
}
}
