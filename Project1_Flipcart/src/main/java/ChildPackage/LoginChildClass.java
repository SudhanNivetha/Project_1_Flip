package ChildPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ParenPackage.ParentClass;

public class LoginChildClass extends ParentClass
{
	@FindBy(xpath="//a[contains(text(),'Login & Signup')]")
	WebElement login_btn;
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement email;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement pass;
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement login_1;
	public LoginChildClass()
	{
		PageFactory.initElements(driver, this);
	}
	public void loginButtonclick(String email1,String pass1)
	{
		login_btn.click();
		email.clear();
		email.sendKeys(email1);
		pass.clear();
		pass.sendKeys(pass1);
		login_1.click();

		
	}

}
