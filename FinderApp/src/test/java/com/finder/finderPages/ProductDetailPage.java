package com.finder.finderPages;

import org.openqa.selenium.By;

public class ProductDetailPage {
	
	public static  By productTitle = By.id("productTitle");
	//public static  By addToCart = By.xpath("//span[@id='submit.add-to-cart']//input[contains(@id,'add-to-cart-button')]");
	public static  By addToCart = By.xpath("//input[contains(@id,'add-to-cart-button')]");
	public static  By checkCart = By.xpath("//a[@id='nav-cart']");
	public static  By homePageLink = By.xpath("//div[@id='nav-logo']");
	
}
