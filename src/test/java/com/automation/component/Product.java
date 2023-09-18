package com.automation.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product {
	private WebElement product;
	
	public Product(WebElement element) {
		product=element;
	}
	
	public WebElement getProductName() {
		return product.findElement(By.xpath(".//span[@role='heading']"));
	}
	public WebElement getProductPrice() {
		return product.findElement(By.xpath(".//span[@class='s-item__price']"));
	}
}
