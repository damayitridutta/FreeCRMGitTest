package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase{
	
	@FindBy(xpath="//span[@class='title']")
		WebElement title;

}
