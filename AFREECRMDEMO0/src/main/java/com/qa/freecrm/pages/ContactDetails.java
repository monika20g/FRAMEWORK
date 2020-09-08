package com.qa.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.freecrm.util.Utility;

public class ContactDetails {
	
	
	WebDriver driver;

	public ContactDetails(WebDriver ldriver) {
			
		super();
		this.driver=ldriver;
		}
	
   By ratingStarPath=By.xpath("//div[@class='ui star rating']/i[3]");
	
	public void giveRating()
	{
		
		Utility.waitForWebElement(driver,ratingStarPath).click();
	}
}
