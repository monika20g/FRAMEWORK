package com.qa.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.freecrm.util.Utility;

public class HomePageCRM {
	WebDriver driver;
	By calenderBtn =By.xpath("//span[text()='Calendar']");
    By contactsLink=By.xpath("//div[@id='main-nav']/a[3]");
	
	public HomePageCRM(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	By accountName=By.xpath("//*[@id='top-header-menu']/div/span");
		
		public String getLoggedInAccountName(){
		
			if(Utility.doIsDisplayed(accountName,driver))
				return Utility.doGetText(accountName,driver);
			return null;
		}
		
		public  CalenderPage goToCalenderPage()
	
		{
			Utility.waitForWebElement(driver,calenderBtn).click();
			return new CalenderPage(driver);
			
		}

		
			
		
		
		
		
		
		public ContactsPageCRM clickOnContactsLink(){
			Utility.waitForWebElement(driver,contactsLink).click();
			return new ContactsPageCRM(driver);
		}
		
		public DealsPageCRM clickOnDealsLink(){
		//	dealsLink.click();
			return new DealsPageCRM();
		}
		
		public TasksPageCRM clickOnTasksLink(){
		//	tasksLink.click();
			return new TasksPageCRM();
		}	
		
		

}
