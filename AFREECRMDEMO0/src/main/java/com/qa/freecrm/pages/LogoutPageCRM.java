package com.qa.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.freecrm.util.Utility;

public class LogoutPageCRM {
	WebDriver driver;
	LogoutPageCRM logout;
	public LogoutPageCRM(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	//By logoutText =By.xpath("//*[@class='text'])[5]");
	By settingIcon=By.xpath("//*[@class='settings icon']");
	
	By logoutText=By.xpath("//span[text()='Log Out']");
	
public void logOutFromApplication() {
		
		/*driver.findElement(adminText).click();
		driver.findElement(logoutText).click();*/
        logout = PageFactory.initElements(driver,LogoutPageCRM.class);
		Utility.waitForWebElement(driver, settingIcon).click();
		Utility.waitForWebElement(driver,logoutText).click();
	
		
		
	}
}
