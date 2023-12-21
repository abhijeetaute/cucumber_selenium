package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.loc.PageLocators.ShopPageLoc;

public class ShopPage extends BaseClass implements ShopPageLoc{


	
	public void navigateFromBreadcrum(String menu) {
		waitforElement(By.xpath(String.format(Breadcrum_Link,menu)));
		driver.findElement(By.xpath(String.format(Breadcrum_Link,menu))).click();;
	}
	
	public void waitForPageToLoad() {
		waitForElementToBePresent(driver.findElement(By.xpath(PriceFilter_loc)));
		waitForPageLoad();
	}
}
