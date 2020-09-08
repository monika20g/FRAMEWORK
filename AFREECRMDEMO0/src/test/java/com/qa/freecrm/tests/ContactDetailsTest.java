package com.qa.freecrm.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.freecrm.base.BaseClass;
import com.qa.freecrm.pages.ContactDetails;
import com.qa.freecrm.pages.ContactsPageCRM;
import com.qa.freecrm.pages.HomePageCRM;
import com.qa.freecrm.pages.LoginPageCRM;
import com.qa.freecrm.pages.LogoutPageCRM;
import com.qa.freecrm.util.Utility;

public class ContactDetailsTest  extends BaseClass
{
	public LoginPageCRM login;
	public LogoutPageCRM logout;
	public HomePageCRM homepage;
    public ContactsPageCRM contactpage;
    public ContactDetails contactpagedetail;
	public ContactDetailsTest() 
	{
		super();
	}
	@Test(priority=1)
	public ContactsPageCRM weRInContDetailPage()
	{
		//ExcelProvider excel;
		
		//	excel = new ExcelProvider();
		 login=PageFactory.initElements(driver,LoginPageCRM .class);
		  logout=PageFactory.initElements(driver,LogoutPageCRM.class);
		  homepage=PageFactory.initElements(driver,HomePageCRM.class);
		  contactpage=PageFactory.initElements(driver,ContactsPageCRM.class);
		  contactpagedetail=PageFactory.initElements(driver,ContactDetails.class);
		  contactpagedetail.giveRating();
		  return new ContactsPageCRM(driver);
	
     }
}
