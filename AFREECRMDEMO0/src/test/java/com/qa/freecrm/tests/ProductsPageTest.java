package com.qa.freecrm.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.freecrm.base.BaseClass;
import com.qa.freecrm.factories.DataProviderFactory;
import com.qa.freecrm.pages.HomePageCRM;
import com.qa.freecrm.pages.LoginPageCRM;
import com.qa.freecrm.pages.LogoutPageCRM;
import com.qa.freecrm.pages.ProductsPage;

public class ProductsPageTest extends BaseClass
{
	public LoginPageCRM login;
	public LogoutPageCRM logout;
	public HomePageCRM homepage;
	public ProductsPage productpage;
	public ProductsPageTest() 
	{
		super();
	}
	
	@Test(priority=1)
	public void loginToApplication()
	{
		//ExcelProvider excel;
		
		//	excel = new ExcelProvider();
		 login=PageFactory.initElements(driver,LoginPageCRM .class);
		  logout=PageFactory.initElements(driver,LogoutPageCRM.class);
		
		logger=report.createTest("Login as productspage");
		
//		login.loginToApplication("Admin","admin123");
		
	 login.loginToApplication(DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 0),
				
				DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 1));
		
		System.out.println("credential entered!!");
	   
		//login.verifyUrlAfterLogin();
		System.out.println("verify");
		
		logger.info("Logged in");
		
	}
	
	
}
