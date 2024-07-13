package com.module.Utils.login;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;
import com.automation.utils.SeleniumCore;
import com.automation.utils.SeleniumUtils;
import com.module.Objects.login.Login_Objects;



public class Login_Utils extends Base {

	public SeleniumCore seleniumcore;
	public SeleniumUtils seleniumutils;
	public Login_Objects login_Objects;

	public Login_Utils() {

		seleniumcore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumutils=PageFactory.initElements(driver, SeleniumUtils.class);
		login_Objects=PageFactory.initElements(driver, Login_Objects.class);

	}

	public void applicationURL(String username,String password) {
		
		driver.manage().timeouts().implicitlyWait(2000 ,TimeUnit.SECONDS);
		seleniumcore.enterText(login_Objects.username,username);
		seleniumcore.enterText(login_Objects.pass,password);
		seleniumcore.clickOn(login_Objects.login);

	}

}
