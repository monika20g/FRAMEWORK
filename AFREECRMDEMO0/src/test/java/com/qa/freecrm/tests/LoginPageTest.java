package com.qa.freecrm.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.freecrm.base.BaseClass;
import com.qa.freecrm.factories.DataProviderFactory;
import com.qa.freecrm.pages.LoginPageCRM;
import com.qa.freecrm.pages.LogoutPageCRM;

public class LoginPageTest extends BaseClass
{
	public LoginPageTest() {
		super();
		}
		


public LoginPageCRM login;
public LogoutPageCRM logout;

  /*  @Test
	public void verifyPage()
	{	//how will you initialize ur page factory?
	   login=PageFactory.initElements(driver,LoginPage.class);
	   logout=PageFactory.initElements(driver,LogoutPage.class);
		//adminPage=PageFactory.initElements(driver,AdminPage.class);	
		logger=report.createTest("URL validation");	
		logger.info("Validating url");
	}*/
	
@Test(priority=1)
public void loginToApplication()
{
	//ExcelProvider excel;
	
	//	excel = new ExcelProvider();
	 login=PageFactory.initElements(driver,LoginPageCRM .class);
	  logout=PageFactory.initElements(driver,LogoutPageCRM.class);
	
	logger=report.createTest("Login as admin");
	
//	login.loginToApplication("Admin","admin123");
	
 login.loginToApplication(DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 0),
			
			DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 1));
	
	System.out.println("credential entered!!");
   
	//login.verifyUrlAfterLogin();
	System.out.println("verify");
	
	logger.info("Logged in");
	
}
@Test(priority=2,dependsOnMethods="loginToApplication")
public void logoutFromApplication() throws InterruptedException
{
	logger=report.createTest("Logout");
	
	logout.logOutFromApplication();
	System.out.println("logged out !!!!");
    logger.info("Logout done");
	
}
	
	
}
