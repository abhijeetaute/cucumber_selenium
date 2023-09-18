package com.automation.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.component.Product;


public class SearchResultPage extends BaseClass{

	@FindBy(xpath="//div[@id='srp-river-results']//li[contains(@id,'item')]")
	private List<WebElement> productList;
	
	
	public List<Product> getProductList(){
		List<Product> productComponentList=new ArrayList<>();
		for(WebElement element:productList)
			productComponentList.add(new Product(element));
		return productComponentList;
	}
	
	public void verifySearchResultForProduct(String product) {
		boolean flag=true;
		for(Product prod:getProductList()) {
			if(!prod.getProductName().getText().toLowerCase().contains(product))
				flag=false;
		}
		
		Assert.assertTrue("Search result is not matching", flag);
	}
	
	public void selectFirstProductFromResult() {
		String mainWindow=driver.getWindowHandle();
		waitForElementToBePresent(getProductList().get(0).getProductName());
		clickElementUsingJS(getProductList().get(0).getProductName());
		waitForPageLoad();
		Set<String> handles=driver.getWindowHandles();
		for(String window:handles) {
			if(!window.equals(mainWindow))
				driver.switchTo().window(window);
		}
	}
}
