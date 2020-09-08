package com.qa.freecrm.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.freecrm.base.BaseClass;
import com.qa.freecrm.factories.DataProviderFactory;
import com.qa.freecrm.pages.CalenderPage;
import com.qa.freecrm.pages.HomePageCRM;
import com.qa.freecrm.pages.LoginPageCRM;
import com.qa.freecrm.pages.LogoutPageCRM;

public class HomePageTest extends BaseClass{
	
	public LoginPageCRM login;
	public LogoutPageCRM logout;
	public HomePageCRM homepage;
	public CalenderPage calenderpage;
	public HomePageTest() 
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
		logger=report.createTest("Login as homepage");
		
	//	login.loginToApplication("Admin","admin123");
		
     login.loginToApplication(DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 0),
				
				DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 1));
		
		System.out.println("credential entered!!");
	   
		//login.verifyUrlAfterLogin();
		System.out.println("verify");
		
		logger.info("Logged in");
		
	}
	@Test(priority=2,dependsOnMethods="loginToApplication")
	public void verifyLoggedInUserTest() throws InterruptedException
	{ homepage=PageFactory.initElements(driver,HomePageCRM .class);
	   
		logger=report.createTest("create user");
	
		String accountName = homepage.getLoggedInAccountName();
		System.out.println("Logged in user account name is : " + accountName);
		
		AssertJUnit.assertEquals(accountName, DataProviderFactory.getConfig().getValue("accountname"));
		
		  logger.info("Verified logged-in  user from Property File!!!!");
		
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest(){
		
		calenderpage = homepage.goToCalenderPage();
	}
	
	
	
	
	/*@Test(priority=4,dependsOnMethods="loginToApplication")
	public void logoutFromApplication() throws InterruptedException
	{
		logger=report.createTest("Logout");
		
		logout.logOutFromApplication();
		System.out.println("logged out !!!!");
	    logger.info("Logout done");
		
	}*/
	
	
	
}
