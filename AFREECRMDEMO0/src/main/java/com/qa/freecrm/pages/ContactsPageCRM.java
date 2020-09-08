package com.qa.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.qa.freecrm.util.Utility;

public class ContactsPageCRM {
WebDriver driver;

public ContactsPageCRM(WebDriver ldriver) {
		
	super();
	this.driver=ldriver;
	}
By newSaveBtn =By.xpath("//button/i[@class='save icon']");
By newContactLinkBtn=By.xpath("//button[contains(text(),'New')]");
By ffirstName=By.xpath("//input[@name='first_name']");
By llastName=By.xpath("//input[@name='last_name']");
By emailID=By.xpath("//input[@placeholder='Email address']");
By Position=By.xpath("//input[@name='position']");
By SelectCategaryDropDwn=By.xpath("//div[@name='category']");

//Select drop
//
    
    By status=By.xpath("//*[@name='status']/div[2]/div[3]/span");

By description =By.xpath("//textarea[@name ='description']");
	/*public String validateContactPageCRMTitle()
	{
		
		//return Utility.verifyTitleOfPage(driver, titleOfPage);
		
		
	}*/


String beforeXpath="//td[text()='";
String afterXpath="']//preceding-sibling::td/div[@class='ui fitted read-only checkbox']";

By eyeXpath=By.xpath("//td[text()='Radha Nayyer']//parent::*/td[@class='right aligned collapsing options-buttons-container']/a");
String eyeAfterXpath= "']//parent::*/td[@class='right aligned collapsing options-buttons-container']/a";


public void clickOnNewContactLink(){
	
	Utility.waitForWebElement(driver,newContactLinkBtn).click();
}

/*public void selectContactsByName(String name,WebDriver driver)
{
	driver.findElement(By.xpath("//td[text()='Radha Nayyer']//preceding-sibling::td/div[@class='ui fitted read-only checkbox']/input")).click();
}
*/

public void createNewContact(String email, String firstname, String lastname, String company)
{
	Utility.waitForWebElement(driver,emailID).sendKeys(email);
	Utility.waitForWebElement(driver,ffirstName).sendKeys(firstname);
	Utility.waitForWebElement(driver,llastName).sendKeys(lastname);
	Utility.waitForWebElement(driver,Position).sendKeys(company);
	Utility.waitForWebElement(driver,newSaveBtn).click();

}
   /* public void selectContactsByNam(String name){
	driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
			+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
}*/

    public void selectContactsByCount(int count) {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+ count +"]/td[1]/div")).click();
	}
    
public void selectContactsByNameAndClickRating(String name)
{
	//driver.findElement(By.xpath("//td[text()='"+name+"']//preceding-sibling::td/div[@class='ui fitted read-only checkbox']")).click();
  String actualXpath=beforeXpath+name+afterXpath;
  
  //WebElement element =driver.findElement(By.xpath(actualXpath));
  By fXpath=By.xpath(actualXpath);
  Utility.waitForWebElement(driver, fXpath);
//By eyeXpath=By.xpath("//td[text()='Radha Nayyer']//parent::*/td[@class='right aligned collapsing options-buttons-container']/a");
  String actualXpath1=beforeXpath+name+eyeAfterXpath;
  By fXpath1=By.xpath(actualXpath1);
  Utility.waitForWebElement(driver, fXpath1).click();
  Utility.waitForWebElement(driver,ratingStarPath).click();
 
} 

/*public void selectContactsByName(String name)
{
driver.findElement(By.xpath("//td[text()='"+name+"']//preceding-sibling::td/div[@class='ui fitted read-only checkbox']")).click();
  
}*/
By eyeIcon=By.xpath("//td[@class='right aligned collapsing options-buttons-container']/a[1]");
public void clickOnEyeIcon()
{
	driver.findElement(By.xpath("//td[@class='right aligned collapsing options-buttons-container']/a[1]")).click();
	try {
		giveRating();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


By ratingStarPath=By.xpath("//div[@class='ui star rating']/i[3]");

	public void giveRating() throws InterruptedException
	{
		Utility.waitForWebElement(driver,ratingStarPath).click();
		Thread.sleep(2000);
	}

	

}
