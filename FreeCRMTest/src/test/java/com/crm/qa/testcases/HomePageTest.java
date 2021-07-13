package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public HomePageTest(){
		super();
	}
	
	//test cases should be separated --independent with each other
	//before each test cases -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Swag Labs","Home page title not match");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		boolean flag = homePage.verifycCorrectUserName();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest() {
		contactsPage = homePage.clickOnBackpack();
		contactsPage = homePage.clickOnBikelight();
		contactsPage = homePage.clickOnFleeceJacket();
		contactsPage = homePage.clickOnShoppingCartLink();
		contactsPage = homePage.clickOnCheckout();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
