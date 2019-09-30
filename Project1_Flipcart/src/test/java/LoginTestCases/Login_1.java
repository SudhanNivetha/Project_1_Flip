package LoginTestCases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ChildPackage.LoginChildClass;
import ParenPackage.ParentClass;

public class Login_1 extends ParentClass {
LoginChildClass Lp;
ParentClass Pl;
	
	@BeforeMethod()
	public void launch()  
	{
		initialization();
		Lp=new LoginChildClass();
	}
	@Test
	public void LoginCase_1() throws InterruptedException
	{
		Lp=new LoginChildClass();
		Thread.sleep(5000);
		Lp.loginButtonclick(prop.getProperty("email"),prop.getProperty("pass"));

 		
	}
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
	}
}

