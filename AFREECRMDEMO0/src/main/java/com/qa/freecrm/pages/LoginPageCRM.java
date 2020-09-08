package com.qa.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.freecrm.util.Utility;

public class LoginPageCRM
{
	WebDriver driver;
	public LoginPageCRM(WebDriver driver) {

		this.driver = driver;
	}
	//page factory - OR
	By user= By.xpath("//*[@name='email']");
	By password=By.xpath("//*[@name='password']");	
	By loginButton=By.xpath("//div[text()='Login']");
	
	public void verifyUrlBeforeLogin()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Login Page does not contain login url");	
	}
	
	
	//Actions
		public  HomePageCRM loginToApplication(String userName,String passWord)
		{
			/*user.sendKeys(userName);
			pass.sendKeys(passWord);
			loginButton.click();*/
			//return new  HomePage();
			Utility.waitForWebElement(driver,user).sendKeys(userName);
			Utility.waitForWebElement(driver,password).sendKeys(passWord);
			Utility.waitForWebElement(driver,loginButton).click();
			
			return new HomePageCRM(driver);
			
		}
	
		
		
}
