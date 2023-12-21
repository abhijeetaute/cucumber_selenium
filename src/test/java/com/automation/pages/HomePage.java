package com.automation.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.component.Product;
import com.automation.loc.PageLocators.HomePageLoc;


public class HomePage extends BaseClass implements HomePageLoc{

	@FindBy(xpath=Navigation_Menu)
	private List<WebElement> menus;
	
	@FindBy(xpath=Products)
	private List<WebElement> products;
	
	
	
	
	public void navigateToMenu(String menu) {
		waitForPageToLoad();
		//menus=driver.findElements(By.xpath(Navigation_Menu));
		for(WebElement element:menus) {
			if(element.getText().equalsIgnoreCase(menu)) {
					element.click();
					break;
			}
		}
	}
	
	public void waitForPageToLoad() {
		waitForElementToBePresent(driver.findElement(By.xpath(New_Arrival_label)));
		waitForPageLoad();
	}
	
	public void verifyProductCount(String count) {
		//waitForPageToLoad();
		
	}
	
	public List<Product> getProductList(){
		List<Product> list=new ArrayList<Product>();
		for(WebElement element:products) {
			list.add(new Product(element));
		}
		return list;
	}

}
