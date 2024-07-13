package com.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.Base;

public class SeleniumCore extends Base{
	
	public void enterText(WebElement locator , String value) {
		locator.sendKeys(value);
	}
	
	public void clickOn(WebElement locator) {
		locator.click();
	}
	public void selectVisibleText(String locator ,String value ) {
		Select select=new Select(driver.findElement(By.xpath(locator)));
		select.deselectByVisibleText(value);
	}
	
}