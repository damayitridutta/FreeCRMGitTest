package com.crm.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class RahulShettyPage extends TestBase{
	
	@FindBy(xpath = "//button[@id='mousehover']")
	WebElement mousehover;
	
	@FindBy(xpath = "//a[@href='#top']")
	WebElement pagetop;
	
	@FindBy(name = "checkBoxOption2")
	WebElement checkbox;
	
	public void rahulshettyMouseHover() {
		Actions action = new Actions(driver);
		action.moveToElement(mousehover).build().perform();
		pagetop.click();
	}
	
	public void rahulshettyDropdown(String dropdownclassexample) {
		Select select = new Select(driver.findElement(By.name("dropdown-class-example")));
		select.selectByVisibleText(dropdownclassexample);		
	}
	
	public void rahulshettyCheckbox() {
		driver.findElement(By.id("checkBoxOption2")).click();
		
	}
	

}
