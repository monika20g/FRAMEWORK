package com.qa.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.freecrm.util.Utility;



public class ProductsPage 
{
WebDriver driver;	
public LoginPageCRM login;
public ProductsPage() {
		super();
	}

By productButton=By.xpath("//span[text()='Products']");
By settingIcon=By.xpath("//*[@class='settings icon']");



//Actions
		public  ProductsPage  loginToApplication(String userName,String passWord)
		{ 
			login.loginToApplication(userName, passWord);
			
			/*user.sendKeys(userName);
			pass.sendKeys(passWord);
			loginButton.click();*/
			//return new  HomePage();
			
			
			return new ProductsPage ();
			
		}
	

}
