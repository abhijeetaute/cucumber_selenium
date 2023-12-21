package com.automation.pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.automation.common.FrameworkConstants;
import com.automation.common.GeneralUtilities;
import com.automation.common.Hook;
import com.google.common.collect.ImmutableMap;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected  WebDriver driver;
	//public static Logger logger=null ;
	protected WebDriverWait wait;
	
	
	public BaseClass() {
		this.driver=Hook.driver;
		PageFactory.initElements(driver, this);
	}
	

	  public void waitForElementToBePresent(WebElement element) { 
	  wait=new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(FrameworkConstants.DEFAULT_TIMEOUT)));
	  wait.until(ExpectedConditions.visibilityOf(element));
	  }

	  public void waitforElement(By element) {
		  wait=new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(FrameworkConstants.DEFAULT_TIMEOUT)));
		  wait.until(ExpectedConditions.presenceOfElementLocated(element));
	  }
	  public void waitForElementNotToBePresent(WebElement element) { 
	  wait=new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(FrameworkConstants.DEFAULT_TIMEOUT)));
	  wait.until(ExpectedConditions.invisibilityOf(element)); }
	  
	  
	  public void waitForPageLoad() { new WebDriverWait(driver,
	  Duration.ofSeconds(15)).until( driver ->((JavascriptExecutor)
	  driver).executeScript("return document.readyState").equals("complete"));
	  
	  }
	  
	  public void clickElementUsingJS(WebElement element) {
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()", element);
	  }
	  
	  public boolean isElementPresent(By locator) {
		 return driver.findElements(locator).size()>0?true:false;
	  }
	  
	  public void scrollToElement(WebElement element) {
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView()", element);
	  }
	/*
	 * public void setAllureEnvironment() { allureEnvironmentWriter(
	 * ImmutableMap.<String, String>builder() .put("Browser", "Chrome")
	 * .put("Browser-Version", "87.0.4280.88") .put("WEB-URL",
	 * "https://repeattest.1001dubaipanel.ae/login")
	 * .put("PlatformName",GeneralUtilities.readProperty("platformName").toString())
	 * .build(),System.getProperty("user.dir") + "/allure-results/"); }
	 */
	
	/*
	 * public String takeScreenshot(String testMethod) { String dateTime=new
	 * SimpleDateFormat("DDMMYYYY_hhmmss").format(new Date()); TakesScreenshot ts =
	 * (TakesScreenshot) driver;
	 * 
	 * File srcFile=ts.getScreenshotAs(OutputType.FILE); String
	 * destFilePath=System.getProperty("user.dir")+
	 * "\\screenshots\\"+testMethod+"_"+dateTime+".png"; try {
	 * FileUtils.copyFile(srcFile, new File(destFilePath)); } catch (IOException e)
	 * { e.printStackTrace(); }
	 * 
	 * return destFilePath; }
	 * 
	 * @AfterClass public void tearDown() { driver.quit(); }
	 */
}
