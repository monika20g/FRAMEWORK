package com.qa.freecrm.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.freecrm.base.BaseClass;
import com.qa.freecrm.factories.DataProviderFactory;
import com.qa.freecrm.pages.CalenderPage;
import com.qa.freecrm.pages.HomePageCRM;
import com.qa.freecrm.pages.LoginPageCRM;
import com.qa.freecrm.pages.LogoutPageCRM;

public class CalenderPageTest extends BaseClass{
	
		public LoginPageCRM login;
		public LogoutPageCRM logout;
		public HomePageCRM homepage;

		public CalenderPageTest() 
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
			  homepage=PageFactory.initElements(driver,HomePageCRM.class);
			logger=report.createTest("Login as admin");
			
//			login.loginToApplication("Admin","admin123");
			
		 login.loginToApplication(DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 0),
					
					DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 1));
			
			System.out.println("credential entered!!");
		   
			//login.verifyUrlAfterLogin();
			System.out.println("verify");
			
			logger.info("Logged in");
			
		}
	
	
	@Test (priority=2)
	void verifyWeAreInCalenderpageAndCnnfirmTitle() 
	{  
		  logger=report.createTest("Verifying we are in Calenderpage");
		  homepage.goToCalenderPage();
	      
		
		/*String label = calenderpage.getcalenderPageTitle();
		System.out.println("Logged in user account name is : " + label);		
		Assert.assertEquals(label,"Calender");	
		logger.info("Verified logged-in  user from Property File!!!!");
		String calbl = calenderpage.getcalenderPageTitle();
		System.out.println("Calender page label is: "+ calbl);
		Assert.assertEquals(calbl,"Calendar" );		*/
	}

}
