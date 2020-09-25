package com.finder.finderPages;

import org.openqa.selenium.By;

public class LoginPage {

	
	//public static By createAccount=By.xpath("//a[@id='createAccountSubmit']");
	
	public static By createAccount=By.xpath("//div[@id=\"nav-flyout-ya-signin\"]/a/span");
	public static  By continueButton = By.xpath("//input[@id='continue']");
	//public static  By continueButton = By.xpath("//input[@aria-labelledby='continue-announce']");
	public static  By signInButton = By.xpath("//input[@id='signInSubmit']");
}
