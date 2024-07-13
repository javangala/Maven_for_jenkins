package com.module.scripts.login;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.Base;
import com.module.Utils.login.Login_Utils;

public class Login_Scripts extends Base {

	public  Login_Utils login_Utils;

	@BeforeClass

	public void load() {
		login_Utils=PageFactory.initElements(driver, Login_Utils.class);

	}

	@Test
	public void LoginCredentials() {
		login_Utils.applicationURL("Admin", "admin123");

	}

}
