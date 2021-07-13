package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	

	@FindBy(xpath="//span[@class='title']")
	WebElement title;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocartsaucelabsbackpack;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement addtocartsaucelabsbikelight;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	WebElement addtocartsaucelabsfleecejacket;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement shoppingcartlink;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;

	//Initializing the Page Object:
		public  HomePage(){
			PageFactory.initElements(driver, this); //'this' means current class object
		}
		
		public String verifyHomePageTitle() {
			return driver.getTitle();		
		}
		
		public boolean verifycCorrectUserName() {
			return title.isDisplayed();
		}
		
		public ContactsPage clickOnBackpack() {
			addtocartsaucelabsbackpack.click();
			return new ContactsPage();
		}
		
		public ContactsPage clickOnBikelight() {
			addtocartsaucelabsbikelight.click();
			return new ContactsPage();
		}
		
		public ContactsPage clickOnFleeceJacket() {
			addtocartsaucelabsfleecejacket.click();
			return new ContactsPage();
		}
		
		public ContactsPage clickOnShoppingCartLink() {
			shoppingcartlink.click();
			return new ContactsPage();
			
		}
			
			public ContactsPage clickOnCheckout() {
				shoppingcartlink.click();
				return new ContactsPage();
				
		}

		
		
}
