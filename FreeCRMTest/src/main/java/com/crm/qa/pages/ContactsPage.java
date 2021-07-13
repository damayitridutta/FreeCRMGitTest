package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(xpath="//span[@class='title']")
	WebElement carttitle;
	
	
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement postalcode;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continuebttn;
	
	
	//Initializing the Page Object:
			public  ContactsPage(){
				PageFactory.initElements(driver, this); //'this' means current class object
			}
	
			public boolean veifyContactsLabel() {
				return carttitle.isDisplayed();
			}
			
//			public void clickOnCheckout() {
//				checkout.click();
				//return new DealsPage();
				
//			}
			
			public void createNewContact(String ftName, String ltName, String pinCode){
				//checkout.click();
				firstname.sendKeys(ftName);
				lastname.sendKeys(ltName);
				postalcode.sendKeys(pinCode);
				continuebttn.click();
			
				
			}
	
}
