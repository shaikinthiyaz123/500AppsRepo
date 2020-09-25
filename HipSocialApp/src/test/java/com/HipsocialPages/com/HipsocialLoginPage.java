package com.HipsocialPages.com;

import org.openqa.selenium.By;

public class HipsocialLoginPage {
	public static By LoginPage_Xpath=By.xpath("//h1[text()='Login']");
	public static By Email=By.xpath("//input[@id='user']");
	public static By Password=By.xpath("//input[@id='pass']");
	public static By Loginbtn=By.cssSelector("button[type='submit']");
	public static By HomePage = By.xpath("//div[text()='Welcome to 500apps']");
	public static By Click_Hipsocial_Xpath= By.xpath("//h5[contains(text(),'Hipsocial')]");
	public static By Hipsocial_Dashboard= By.xpath("//h3[text()='Dashboard']");

}
