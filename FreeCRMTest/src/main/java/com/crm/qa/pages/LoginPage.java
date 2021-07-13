package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR
	
	@FindBy(name="user-name")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement Login;
	
	
	@FindBy(xpath="//div[@class='login_logo']")
	WebElement login_logo;
	
	
	//Initializing the Page Object:
	public  LoginPage(){
		PageFactory.initElements(driver, this); //'this' means current class object
	}
	
	//Actions:
	public  String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return login_logo.isDisplayed();
	}
		
	public HomePage login (String un, String pwd) {
		Username.sendKeys(un);
		password.sendKeys(pwd);
		Login.click();

		
		return new HomePage();
	}
	
}
