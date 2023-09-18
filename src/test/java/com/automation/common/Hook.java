package com.automation.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hook{
	
	public static WebDriver driver;
	LoginPage login=new LoginPage();
   
	@BeforeAll()
	public static void initialize() {
		driver=new ChromeDriver();
		driver.get(GeneralUtilities.readProperty("baseUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	}
   
   @After
   public void cleanUp() {
	   login.logOut();
   }
   
   @AfterAll
   public static void tearDown() {
	driver.close();   
   }
}
