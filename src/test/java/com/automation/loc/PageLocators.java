package com.automation.loc;

public interface PageLocators {
	
	public interface HomePageLoc{
		
		String Navigation_Menu="//ul[@id='main-nav']/li//a";
		String Products="//ul[@class='products']/li";
		String New_Arrival_label="//h2[text()='new arrivals']";
		
	}
	
	
	public interface ShopPageLoc{
		String Breadcrum_Link="//nav[@class='woocommerce-breadcrumb']//a[text()='%s']";
		String PriceFilter_loc="//div[contains(@class,'price_filter')]";
	}
	
	public interface ProductDetailsPageLoc{
		String ProductName="//h1";
		String Price="//p[@class='price']/span";
		String Quanity="//input[@title='Qty']";
		String AddToCartButton="//button[@type='submit']";
	}

}
