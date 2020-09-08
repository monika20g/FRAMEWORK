package com.qa.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.freecrm.base.BaseClass;
import com.qa.freecrm.util.Utility;

public class CalenderPage extends BaseClass {

	WebDriver driver;
	 By calenderLbl = By.xpath("//div[text()='Calendar']");
		


	public CalenderPage(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
		
	
	 public String getcalenderPageTitle() {
		if(Utility.doIsDisplayed(calenderLbl,driver))
			return Utility.doGetText(calenderLbl,driver);
		return null;
	}

	
	
	

}