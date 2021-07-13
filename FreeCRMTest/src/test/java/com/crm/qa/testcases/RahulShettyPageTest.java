package com.crm.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.RahulShettyPage;


public class RahulShettyPageTest extends TestBase {
	RahulShettyPage rahulShettyPage;
	
	public RahulShettyPageTest(){
		super();
		
	}	
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		rahulShettyPage = new RahulShettyPage();
	}
	
	@Test(priority=1)
	public void rahulShettyPageMousehoverTest() {
		rahulShettyPage.rahulshettyMouseHover();
		}
	
	@Test(priority=2)
	public void rahulShettyPageDropdownTest() {
		rahulShettyPage.rahulshettyDropdown("Option1");
	}
	
	
	@Test(priority=3)
	public void rahulShettyPageCheckboxTest() {
			rahulShettyPage.rahulshettyCheckbox();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
