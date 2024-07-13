package com.automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Base{

	public static WebDriver driver;
	public static Properties config;
	public static Properties locator;
	public static String currDir=System.getProperty("user.dir");


	@BeforeSuite
	public void initbrowser() throws IOException {
		
		loaddata();
		
		if ("win".equalsIgnoreCase(config.getProperty("OS"))) {
			if ("chrome".equalsIgnoreCase(config.getProperty("browser"))) {
				System.setProperty("webdriver.chrome.driver", currDir+"\\src\\test\\resources\\Browsers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}else {
				System.out.println("Given browser is not available..");
			}

		}else if("mac".equalsIgnoreCase(config.getProperty("OS"))) {
			if ("chrome".equalsIgnoreCase(config.getProperty("browser"))) {
				System.setProperty("webdriver.chrome.driver", currDir+"\\src\\test\\resources\\Browsers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}else {
				System.out.println("Given browser is not available..");
			}

		}else {
			System.out.println("Given OS is not available....");
		}

		driver.get(config.getProperty("applicationURL"));	
	}

	public void loaddata() throws IOException {
		FileInputStream input=new FileInputStream(currDir+"\\src\\test\\resources\\Config\\applicationProperteis");
		config=new Properties();
		config.load(input);

	}

}