package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

		LoginPage loginPage;
		HomePage homePage;
		TestUtil testUtil;
		ContactsPage contactsPage;
		DealsPage dealsPage;
		
		String sheetName = "contacts";

		
		public ContactsPageTest(){
			super();
		}
		
		
		@BeforeMethod
		public void SetUp() {
			initialization();
			testUtil = new TestUtil();
			contactsPage = new ContactsPage();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			contactsPage = homePage.clickOnBackpack();
			contactsPage = homePage.clickOnBikelight();
			contactsPage = homePage.clickOnFleeceJacket();
			contactsPage = homePage.clickOnShoppingCartLink();
			contactsPage = homePage.clickOnCheckout();
		}
		
//		@Test(priority=1)
//		public void veifyContactsPageLabel() {
//			boolean flag = contactsPage.veifyContactsLabel();
//			Assert.assertTrue(flag);
//		}
		
//		@Test(priority=2)
//		public void verifyDealsPageLinkTest() {
//			dealsPage = contactsPage.clickOnCheckout();
//		}
		
		
		@DataProvider
		public Object[][] getCRMTestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
		
		
		@Test(priority=1, dataProvider="getCRMTestData")
		public void validateCreateNewContact(String firstName, String lastName, String postalcode){
			//contactsPage.createNewContact("Tom", "Peter", "700001");
			homePage.clickOnCheckout();
			contactsPage.createNewContact(firstName, lastName, postalcode);
			
		}
		
		
		@AfterMethod
		public void tearDown() throws InterruptedException {
			//Thread.sleep(2000);
			driver.quit();
		}
		
		
	
}
