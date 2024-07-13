package com.module.Objects.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Objects {
	
	@FindBy(xpath = "//input[@ placeholder='Username']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement login;

}
