package com.qa.freecrm.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.freecrm.base.BaseClass;
import com.qa.freecrm.factories.DataProviderFactory;
import com.qa.freecrm.factories.ExcelUtil;
import com.qa.freecrm.pages.ContactDetails;
import com.qa.freecrm.pages.ContactsPageCRM;
import com.qa.freecrm.pages.HomePageCRM;
import com.qa.freecrm.pages.LoginPageCRM;
import com.qa.freecrm.pages.LogoutPageCRM;

public class ContactsPageTest extends BaseClass
{
	public LoginPageCRM login;
	public LogoutPageCRM logout;
	public HomePageCRM homepage;
    public ContactsPageCRM contactpage;
    String sheetName = "contacts";
	public ContactsPageTest() 
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
		  contactpage=PageFactory.initElements(driver,ContactsPageCRM.class);
		logger=report.createTest("Contact Page Tests");
		
//		login.loginToApplication("Admin","admin123");
		
	 login.loginToApplication(DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 0),
				
				DataProviderFactory.getExcel().getCellData("OrangeHRM", 1, 1));
		
		System.out.println("credential entered!!");
	   
		//login.verifyUrlAfterLogin();
		System.out.println("verify");
		
		logger.info("Logged in");
		
	}
	
@Test(priority=2)
public void clickOnContact() 
{
	homepage.clickOnContactsLink();
	
}



@DataProvider
public Object[][] getCRMTestData(){
	Object data[][] = ExcelUtil.getTestData(sheetName);
	return data;
}


@Test(priority=3, dataProvider="getCRMTestData")
public void validateCreateNewContact(String email, String firstname, String lastname, String company){
	contactpage.clickOnNewContactLink();
	//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
	contactpage.createNewContact(email, firstname, lastname, company);
	clickOnContact() ;
}

@Test(priority=4)
public  void ContactByCount() throws InterruptedException
{
	
	contactpage.selectContactsByCount(4);
	
}



@Test(priority=5)
public  void SearchContactByName()
{
	
	contactpage.selectContactsByNameAndClickRating("Rabish sharma");
	
	
}
@Test(priority=6,enabled=false)
public void ratingTest()
{
	contactpage.clickOnEyeIcon();
}

}